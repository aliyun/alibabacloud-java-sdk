// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetHotlineQualificationByOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotlineQualificationByOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHotlineQualificationByOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineQualificationByOrderResponseBody self = new GetHotlineQualificationByOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineQualificationByOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineQualificationByOrderResponseBody setData(GetHotlineQualificationByOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineQualificationByOrderResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineQualificationByOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineQualificationByOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHotlineQualificationByOrderResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("Status")
        public String status;

        public static GetHotlineQualificationByOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineQualificationByOrderResponseBodyData self = new GetHotlineQualificationByOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineQualificationByOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetHotlineQualificationByOrderResponseBodyData setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public GetHotlineQualificationByOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
