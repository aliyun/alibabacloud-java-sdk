// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseOrdersResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitInternalPurchaseOrdersResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitInternalPurchaseOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseOrdersResponseBody self = new SubmitInternalPurchaseOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseOrdersResponseBody setData(SubmitInternalPurchaseOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitInternalPurchaseOrdersResponseBodyData getData() {
        return this.data;
    }

    public SubmitInternalPurchaseOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitInternalPurchaseOrdersResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public Integer status;

        public static SubmitInternalPurchaseOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInternalPurchaseOrdersResponseBodyData self = new SubmitInternalPurchaseOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitInternalPurchaseOrdersResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitInternalPurchaseOrdersResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
