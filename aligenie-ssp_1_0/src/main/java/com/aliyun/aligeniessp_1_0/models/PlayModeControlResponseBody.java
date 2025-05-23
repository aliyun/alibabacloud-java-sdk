// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayModeControlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>10002398812</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public PlayModeControlResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static PlayModeControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlayModeControlResponseBody self = new PlayModeControlResponseBody();
        return TeaModel.build(map, self);
    }

    public PlayModeControlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PlayModeControlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PlayModeControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PlayModeControlResponseBody setResult(PlayModeControlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PlayModeControlResponseBodyResult getResult() {
        return this.result;
    }

    public PlayModeControlResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class PlayModeControlResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OpenPlayMode")
        public String openPlayMode;

        public static PlayModeControlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PlayModeControlResponseBodyResult self = new PlayModeControlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PlayModeControlResponseBodyResult setOpenPlayMode(String openPlayMode) {
            this.openPlayMode = openPlayMode;
            return this;
        }
        public String getOpenPlayMode() {
            return this.openPlayMode;
        }

    }

}
