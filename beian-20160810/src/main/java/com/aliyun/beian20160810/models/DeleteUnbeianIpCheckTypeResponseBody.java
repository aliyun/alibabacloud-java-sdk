// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class DeleteUnbeianIpCheckTypeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HuntressIpCheckTypeResultDO")
    public DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteUnbeianIpCheckTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnbeianIpCheckTypeResponseBody self = new DeleteUnbeianIpCheckTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUnbeianIpCheckTypeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteUnbeianIpCheckTypeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteUnbeianIpCheckTypeResponseBody setHuntressIpCheckTypeResultDO(DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO) {
        this.huntressIpCheckTypeResultDO = huntressIpCheckTypeResultDO;
        return this;
    }
    public DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO getHuntressIpCheckTypeResultDO() {
        return this.huntressIpCheckTypeResultDO;
    }

    public DeleteUnbeianIpCheckTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUnbeianIpCheckTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO extends TeaModel {
        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO build(java.util.Map<String, ?> map) throws Exception {
            DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO self = new DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO();
            return TeaModel.build(map, self);
        }

        public DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DeleteUnbeianIpCheckTypeResponseBodyHuntressIpCheckTypeResultDO setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
