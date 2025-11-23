// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListMetaCategoryResponseBody extends TeaModel {
    /**
     * <p>The list of categories.</p>
     */
    @NameInMap("CategoryList")
    public ListMetaCategoryResponseBodyCategoryList categoryList;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
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

    public static ListMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCategoryResponseBody self = new ListMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaCategoryResponseBody setCategoryList(ListMetaCategoryResponseBodyCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public ListMetaCategoryResponseBodyCategoryList getCategoryList() {
        return this.categoryList;
    }

    public ListMetaCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMetaCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMetaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaCategoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaCategoryResponseBodyCategoryList extends TeaModel {
        @NameInMap("MetaCategory")
        public java.util.List<MetaCategory> metaCategory;

        public static ListMetaCategoryResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListMetaCategoryResponseBodyCategoryList self = new ListMetaCategoryResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public ListMetaCategoryResponseBodyCategoryList setMetaCategory(java.util.List<MetaCategory> metaCategory) {
            this.metaCategory = metaCategory;
            return this;
        }
        public java.util.List<MetaCategory> getMetaCategory() {
            return this.metaCategory;
        }

    }

}
