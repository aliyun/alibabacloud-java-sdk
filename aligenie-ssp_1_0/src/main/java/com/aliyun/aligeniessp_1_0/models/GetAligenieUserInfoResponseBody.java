// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAligenieUserInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAligenieUserInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetAligenieUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAligenieUserInfoResponseBody self = new GetAligenieUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAligenieUserInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAligenieUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAligenieUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAligenieUserInfoResponseBody setResult(GetAligenieUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAligenieUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public GetAligenieUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAligenieUserInfoResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("AligenieNickname")
        public String aligenieNickname;

        /**
         * <strong>example:</strong>
         * <p><a href="http://img.alicdn.com/xxx.jpg">http://img.alicdn.com/xxx.jpg</a></p>
         */
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Deletable")
        public Boolean deletable;

        public static GetAligenieUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAligenieUserInfoResponseBodyResult self = new GetAligenieUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAligenieUserInfoResponseBodyResult setAligenieNickname(String aligenieNickname) {
            this.aligenieNickname = aligenieNickname;
            return this;
        }
        public String getAligenieNickname() {
            return this.aligenieNickname;
        }

        public GetAligenieUserInfoResponseBodyResult setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetAligenieUserInfoResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

    }

}
