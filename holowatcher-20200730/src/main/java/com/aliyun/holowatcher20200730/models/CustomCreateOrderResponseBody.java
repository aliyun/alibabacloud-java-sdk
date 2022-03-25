// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomCreateOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public CustomCreateOrderResponseBodyResultObj resultObj;

    @NameInMap("Success")
    public Boolean success;

    public static CustomCreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomCreateOrderResponseBody self = new CustomCreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomCreateOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomCreateOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CustomCreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CustomCreateOrderResponseBody setResultObj(CustomCreateOrderResponseBodyResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public CustomCreateOrderResponseBodyResultObj getResultObj() {
        return this.resultObj;
    }

    public CustomCreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CustomCreateOrderResponseBodyResultObj extends TeaModel {
        @NameInMap("CipherId")
        public String cipherId;

        @NameInMap("CipherProjectId")
        public String cipherProjectId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OrderName")
        public String orderName;

        @NameInMap("OrderState")
        public String orderState;

        public static CustomCreateOrderResponseBodyResultObj build(java.util.Map<String, ?> map) throws Exception {
            CustomCreateOrderResponseBodyResultObj self = new CustomCreateOrderResponseBodyResultObj();
            return TeaModel.build(map, self);
        }

        public CustomCreateOrderResponseBodyResultObj setCipherId(String cipherId) {
            this.cipherId = cipherId;
            return this;
        }
        public String getCipherId() {
            return this.cipherId;
        }

        public CustomCreateOrderResponseBodyResultObj setCipherProjectId(String cipherProjectId) {
            this.cipherProjectId = cipherProjectId;
            return this;
        }
        public String getCipherProjectId() {
            return this.cipherProjectId;
        }

        public CustomCreateOrderResponseBodyResultObj setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CustomCreateOrderResponseBodyResultObj setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CustomCreateOrderResponseBodyResultObj setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }
        public String getOrderName() {
            return this.orderName;
        }

        public CustomCreateOrderResponseBodyResultObj setOrderState(String orderState) {
            this.orderState = orderState;
            return this;
        }
        public String getOrderState() {
            return this.orderState;
        }

    }

}
