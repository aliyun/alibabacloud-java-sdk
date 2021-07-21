// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseReadyFlagResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SubmitInternalPurchaseReadyFlagResponseData data;

    public static SubmitInternalPurchaseReadyFlagResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseReadyFlagResponse self = new SubmitInternalPurchaseReadyFlagResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseReadyFlagResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInternalPurchaseReadyFlagResponse setData(SubmitInternalPurchaseReadyFlagResponseData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseReadyFlagResponseData getData() {
        return this.data;
    }

    public static class SubmitInternalPurchaseReadyFlagResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("MissingBatchNumbers")
        @Validation(required = true)
        public String missingBatchNumbers;

        public static SubmitInternalPurchaseReadyFlagResponseData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseReadyFlagResponseData self = new SubmitInternalPurchaseReadyFlagResponseData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseReadyFlagResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SubmitInternalPurchaseReadyFlagResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitInternalPurchaseReadyFlagResponseData setMissingBatchNumbers(String missingBatchNumbers) {
            this.missingBatchNumbers = missingBatchNumbers;
            return this;
        }
        public String getMissingBatchNumbers() {
            return this.missingBatchNumbers;
        }

    }

}
