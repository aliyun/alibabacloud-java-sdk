// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseOrdersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SubmitInternalPurchaseOrdersResponseData data;

    public static SubmitInternalPurchaseOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseOrdersResponse self = new SubmitInternalPurchaseOrdersResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseOrdersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInternalPurchaseOrdersResponse setData(SubmitInternalPurchaseOrdersResponseData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseOrdersResponseData getData() {
        return this.data;
    }

    public static class SubmitInternalPurchaseOrdersResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static SubmitInternalPurchaseOrdersResponseData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseOrdersResponseData self = new SubmitInternalPurchaseOrdersResponseData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseOrdersResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SubmitInternalPurchaseOrdersResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
