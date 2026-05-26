// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInventoryJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListInventoryJobsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInventoryJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryJobsResponseBody self = new ListInventoryJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInventoryJobsResponseBody setData(ListInventoryJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInventoryJobsResponseBodyData getData() {
        return this.data;
    }

    public ListInventoryJobsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInventoryJobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInventoryJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInventoryJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInventoryJobsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<KnowledgeJobInfoVO> items;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInventoryJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInventoryJobsResponseBodyData self = new ListInventoryJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInventoryJobsResponseBodyData setItems(java.util.List<KnowledgeJobInfoVO> items) {
            this.items = items;
            return this;
        }
        public java.util.List<KnowledgeJobInfoVO> getItems() {
            return this.items;
        }

        public ListInventoryJobsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
