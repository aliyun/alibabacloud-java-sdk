// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CtripOrderPushResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Model")
    public CtripOrderPushResponseBodyModel model;

    @NameInMap("Success")
    public Boolean success;

    public static CtripOrderPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CtripOrderPushResponseBody self = new CtripOrderPushResponseBody();
        return TeaModel.build(map, self);
    }

    public CtripOrderPushResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CtripOrderPushResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CtripOrderPushResponseBody setModel(CtripOrderPushResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CtripOrderPushResponseBodyModel getModel() {
        return this.model;
    }

    public CtripOrderPushResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CtripOrderPushResponseBodyModel extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static CtripOrderPushResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CtripOrderPushResponseBodyModel self = new CtripOrderPushResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CtripOrderPushResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CtripOrderPushResponseBodyModel setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
