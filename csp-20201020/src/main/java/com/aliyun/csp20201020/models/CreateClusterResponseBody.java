// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateClusterResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setData(CreateClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateClusterResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateClusterResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateClusterResponseBodyData extends TeaModel {
        @NameInMap("BeganOn")
        public Long beganOn;

        @NameInMap("EndOn")
        public Long endOn;

        @NameInMap("OrderId")
        public String orderId;

        public static CreateClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterResponseBodyData self = new CreateClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateClusterResponseBodyData setBeganOn(Long beganOn) {
            this.beganOn = beganOn;
            return this;
        }
        public Long getBeganOn() {
            return this.beganOn;
        }

        public CreateClusterResponseBodyData setEndOn(Long endOn) {
            this.endOn = endOn;
            return this;
        }
        public Long getEndOn() {
            return this.endOn;
        }

        public CreateClusterResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
