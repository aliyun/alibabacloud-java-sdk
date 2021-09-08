// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseChargeDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SubmitInternalPurchaseChargeDataResponseBodyData data;

    public static SubmitInternalPurchaseChargeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseChargeDataResponseBody self = new SubmitInternalPurchaseChargeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseChargeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInternalPurchaseChargeDataResponseBody setData(SubmitInternalPurchaseChargeDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseChargeDataResponseBodyData getData() {
        return this.data;
    }

    public static class SubmitInternalPurchaseChargeDataResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Message")
        public String message;

        public static SubmitInternalPurchaseChargeDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseChargeDataResponseBodyData self = new SubmitInternalPurchaseChargeDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseChargeDataResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SubmitInternalPurchaseChargeDataResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
