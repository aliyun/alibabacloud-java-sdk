// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseReadyFlagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SubmitInternalPurchaseReadyFlagResponseBodyData data;

    public static SubmitInternalPurchaseReadyFlagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseReadyFlagResponseBody self = new SubmitInternalPurchaseReadyFlagResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseReadyFlagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInternalPurchaseReadyFlagResponseBody setData(SubmitInternalPurchaseReadyFlagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseReadyFlagResponseBodyData getData() {
        return this.data;
    }

    public static class SubmitInternalPurchaseReadyFlagResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("MissingBatchNumbers")
        public String missingBatchNumbers;

        @NameInMap("Message")
        public String message;

        public static SubmitInternalPurchaseReadyFlagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseReadyFlagResponseBodyData self = new SubmitInternalPurchaseReadyFlagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseReadyFlagResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SubmitInternalPurchaseReadyFlagResponseBodyData setMissingBatchNumbers(String missingBatchNumbers) {
            this.missingBatchNumbers = missingBatchNumbers;
            return this;
        }
        public String getMissingBatchNumbers() {
            return this.missingBatchNumbers;
        }

        public SubmitInternalPurchaseReadyFlagResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
