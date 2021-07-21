// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseChargeDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SubmitInternalPurchaseChargeDataResponseData data;

    public static SubmitInternalPurchaseChargeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseChargeDataResponse self = new SubmitInternalPurchaseChargeDataResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseChargeDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInternalPurchaseChargeDataResponse setData(SubmitInternalPurchaseChargeDataResponseData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseChargeDataResponseData getData() {
        return this.data;
    }

    public static class SubmitInternalPurchaseChargeDataResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static SubmitInternalPurchaseChargeDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseChargeDataResponseData self = new SubmitInternalPurchaseChargeDataResponseData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseChargeDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SubmitInternalPurchaseChargeDataResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
