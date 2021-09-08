// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseOrdersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SubmitInternalPurchaseOrdersResponseBodyData data;

    public static SubmitInternalPurchaseOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseOrdersResponseBody self = new SubmitInternalPurchaseOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInternalPurchaseOrdersResponseBody setData(SubmitInternalPurchaseOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseOrdersResponseBodyData getData() {
        return this.data;
    }

    public static class SubmitInternalPurchaseOrdersResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Message")
        public String message;

        public static SubmitInternalPurchaseOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseOrdersResponseBodyData self = new SubmitInternalPurchaseOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseOrdersResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SubmitInternalPurchaseOrdersResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
