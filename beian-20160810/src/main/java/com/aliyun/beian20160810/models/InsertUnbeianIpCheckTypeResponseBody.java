// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class InsertUnbeianIpCheckTypeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HuntressIpCheckTypeResultDO")
    public InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InsertUnbeianIpCheckTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertUnbeianIpCheckTypeResponseBody self = new InsertUnbeianIpCheckTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertUnbeianIpCheckTypeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public InsertUnbeianIpCheckTypeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InsertUnbeianIpCheckTypeResponseBody setHuntressIpCheckTypeResultDO(InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO) {
        this.huntressIpCheckTypeResultDO = huntressIpCheckTypeResultDO;
        return this;
    }
    public InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO getHuntressIpCheckTypeResultDO() {
        return this.huntressIpCheckTypeResultDO;
    }

    public InsertUnbeianIpCheckTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertUnbeianIpCheckTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO extends TeaModel {
        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO build(java.util.Map<String, ?> map) throws Exception {
            InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO self = new InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO();
            return TeaModel.build(map, self);
        }

        public InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public InsertUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
