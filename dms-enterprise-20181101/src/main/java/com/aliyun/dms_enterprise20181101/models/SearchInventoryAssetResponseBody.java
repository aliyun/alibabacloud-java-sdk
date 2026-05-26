// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchInventoryAssetResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchInventoryAssetResponseBodyData data;

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

    public static SearchInventoryAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryAssetResponseBody self = new SearchInventoryAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchInventoryAssetResponseBody setData(SearchInventoryAssetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchInventoryAssetResponseBodyData getData() {
        return this.data;
    }

    public SearchInventoryAssetResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchInventoryAssetResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchInventoryAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchInventoryAssetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchInventoryAssetResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<TableKnowledgeVO> items;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchInventoryAssetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchInventoryAssetResponseBodyData self = new SearchInventoryAssetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchInventoryAssetResponseBodyData setItems(java.util.List<TableKnowledgeVO> items) {
            this.items = items;
            return this;
        }
        public java.util.List<TableKnowledgeVO> getItems() {
            return this.items;
        }

        public SearchInventoryAssetResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
