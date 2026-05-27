// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetUserIdByOpenDingtalkIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("results")
    public java.util.List<BatchGetUserIdByOpenDingtalkIdResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static BatchGetUserIdByOpenDingtalkIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetUserIdByOpenDingtalkIdResponseBody self = new BatchGetUserIdByOpenDingtalkIdResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetUserIdByOpenDingtalkIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetUserIdByOpenDingtalkIdResponseBody setResults(java.util.List<BatchGetUserIdByOpenDingtalkIdResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchGetUserIdByOpenDingtalkIdResponseBodyResults> getResults() {
        return this.results;
    }

    public BatchGetUserIdByOpenDingtalkIdResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public BatchGetUserIdByOpenDingtalkIdResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class BatchGetUserIdByOpenDingtalkIdResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>User.not.found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>DTOJdYJ2IQC4HuexhtjsS8Qxxxx</p>
         */
        @NameInMap("OpenDingtalkId")
        public String openDingtalkId;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static BatchGetUserIdByOpenDingtalkIdResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchGetUserIdByOpenDingtalkIdResponseBodyResults self = new BatchGetUserIdByOpenDingtalkIdResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchGetUserIdByOpenDingtalkIdResponseBodyResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchGetUserIdByOpenDingtalkIdResponseBodyResults setOpenDingtalkId(String openDingtalkId) {
            this.openDingtalkId = openDingtalkId;
            return this;
        }
        public String getOpenDingtalkId() {
            return this.openDingtalkId;
        }

        public BatchGetUserIdByOpenDingtalkIdResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
