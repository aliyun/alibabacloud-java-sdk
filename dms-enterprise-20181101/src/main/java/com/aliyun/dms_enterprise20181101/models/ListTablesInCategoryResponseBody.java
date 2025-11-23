// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTablesInCategoryResponseBody extends TeaModel {
    /**
     * <p>List of table information associated with the asset category.</p>
     */
    @NameInMap("EntityList")
    public ListTablesInCategoryResponseBodyEntityList entityList;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request succeeded.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTablesInCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesInCategoryResponseBody self = new ListTablesInCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesInCategoryResponseBody setEntityList(ListTablesInCategoryResponseBodyEntityList entityList) {
        this.entityList = entityList;
        return this;
    }
    public ListTablesInCategoryResponseBodyEntityList getEntityList() {
        return this.entityList;
    }

    public ListTablesInCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTablesInCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTablesInCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTablesInCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTablesInCategoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTablesInCategoryResponseBodyEntityList extends TeaModel {
        @NameInMap("MetaCategoryTableEntity")
        public java.util.List<MetaCategoryTableEntity> metaCategoryTableEntity;

        public static ListTablesInCategoryResponseBodyEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesInCategoryResponseBodyEntityList self = new ListTablesInCategoryResponseBodyEntityList();
            return TeaModel.build(map, self);
        }

        public ListTablesInCategoryResponseBodyEntityList setMetaCategoryTableEntity(java.util.List<MetaCategoryTableEntity> metaCategoryTableEntity) {
            this.metaCategoryTableEntity = metaCategoryTableEntity;
            return this;
        }
        public java.util.List<MetaCategoryTableEntity> getMetaCategoryTableEntity() {
            return this.metaCategoryTableEntity;
        }

    }

}
