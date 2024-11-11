// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessAuthenticateResponseBody extends TeaModel {
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
     * <p>73*<em><strong>9-175A-1324-8202-9FAAB</strong></em>**A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public EcologyOpennessAuthenticateResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EcologyOpennessAuthenticateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EcologyOpennessAuthenticateResponseBody self = new EcologyOpennessAuthenticateResponseBody();
        return TeaModel.build(map, self);
    }

    public EcologyOpennessAuthenticateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EcologyOpennessAuthenticateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EcologyOpennessAuthenticateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EcologyOpennessAuthenticateResponseBody setResult(EcologyOpennessAuthenticateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EcologyOpennessAuthenticateResponseBodyResult getResult() {
        return this.result;
    }

    public EcologyOpennessAuthenticateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EcologyOpennessAuthenticateResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12****7</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ThirdUserIdentifier")
        public String thirdUserIdentifier;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ThirdUserType")
        public String thirdUserType;

        /**
         * <strong>example:</strong>
         * <p>o****RnNAW/smBNX9By7Zlc3J7iQUXPiUj/6OizU+ifLSzn1vpQL9ZgSp22u7hsxj0UZ2i6urbv9HQ==</p>
         */
        @NameInMap("UserOpenId")
        public String userOpenId;

        public static EcologyOpennessAuthenticateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EcologyOpennessAuthenticateResponseBodyResult self = new EcologyOpennessAuthenticateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EcologyOpennessAuthenticateResponseBodyResult setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public EcologyOpennessAuthenticateResponseBodyResult setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public EcologyOpennessAuthenticateResponseBodyResult setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public EcologyOpennessAuthenticateResponseBodyResult setThirdUserIdentifier(String thirdUserIdentifier) {
            this.thirdUserIdentifier = thirdUserIdentifier;
            return this;
        }
        public String getThirdUserIdentifier() {
            return this.thirdUserIdentifier;
        }

        public EcologyOpennessAuthenticateResponseBodyResult setThirdUserType(String thirdUserType) {
            this.thirdUserType = thirdUserType;
            return this;
        }
        public String getThirdUserType() {
            return this.thirdUserType;
        }

        public EcologyOpennessAuthenticateResponseBodyResult setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

    }

}
