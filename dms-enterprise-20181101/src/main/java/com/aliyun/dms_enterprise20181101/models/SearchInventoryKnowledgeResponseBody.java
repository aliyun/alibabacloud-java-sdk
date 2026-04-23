// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchInventoryKnowledgeResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchInventoryKnowledgeResponseBodyData data;

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

    public static SearchInventoryKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryKnowledgeResponseBody self = new SearchInventoryKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchInventoryKnowledgeResponseBody setData(SearchInventoryKnowledgeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchInventoryKnowledgeResponseBodyData getData() {
        return this.data;
    }

    public SearchInventoryKnowledgeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchInventoryKnowledgeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchInventoryKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchInventoryKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchInventoryKnowledgeResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<KnowledgeBaseVO> items;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchInventoryKnowledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchInventoryKnowledgeResponseBodyData self = new SearchInventoryKnowledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchInventoryKnowledgeResponseBodyData setItems(java.util.List<KnowledgeBaseVO> items) {
            this.items = items;
            return this;
        }
        public java.util.List<KnowledgeBaseVO> getItems() {
            return this.items;
        }

        public SearchInventoryKnowledgeResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
