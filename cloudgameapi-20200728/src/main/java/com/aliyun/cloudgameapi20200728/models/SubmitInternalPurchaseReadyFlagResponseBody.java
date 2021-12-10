// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseReadyFlagResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitInternalPurchaseReadyFlagResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitInternalPurchaseReadyFlagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseReadyFlagResponseBody self = new SubmitInternalPurchaseReadyFlagResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseReadyFlagResponseBody setData(SubmitInternalPurchaseReadyFlagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseReadyFlagResponseBodyData getData() {
        return this.data;
    }

    public SubmitInternalPurchaseReadyFlagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitInternalPurchaseReadyFlagResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("MissingBatchNumbers")
        public String missingBatchNumbers;

        @NameInMap("Status")
        public Integer status;

        public static SubmitInternalPurchaseReadyFlagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseReadyFlagResponseBodyData self = new SubmitInternalPurchaseReadyFlagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseReadyFlagResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitInternalPurchaseReadyFlagResponseBodyData setMissingBatchNumbers(String missingBatchNumbers) {
            this.missingBatchNumbers = missingBatchNumbers;
            return this;
        }
        public String getMissingBatchNumbers() {
            return this.missingBatchNumbers;
        }

        public SubmitInternalPurchaseReadyFlagResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
