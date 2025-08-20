// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ThirdImmediateMsgPushResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500000000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>服务器内部异常</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Model")
    public ThirdImmediateMsgPushResponseBodyModel model;

    @NameInMap("Success")
    public Boolean success;

    public static ThirdImmediateMsgPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ThirdImmediateMsgPushResponseBody self = new ThirdImmediateMsgPushResponseBody();
        return TeaModel.build(map, self);
    }

    public ThirdImmediateMsgPushResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ThirdImmediateMsgPushResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ThirdImmediateMsgPushResponseBody setModel(ThirdImmediateMsgPushResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ThirdImmediateMsgPushResponseBodyModel getModel() {
        return this.model;
    }

    public ThirdImmediateMsgPushResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ThirdImmediateMsgPushResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2DF6FEFE-3301-16DD-ABCC-968A9524920B</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static ThirdImmediateMsgPushResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ThirdImmediateMsgPushResponseBodyModel self = new ThirdImmediateMsgPushResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ThirdImmediateMsgPushResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ThirdImmediateMsgPushResponseBodyModel setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
