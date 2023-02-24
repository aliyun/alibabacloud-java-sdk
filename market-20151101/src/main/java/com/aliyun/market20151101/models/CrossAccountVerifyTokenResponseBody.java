// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CrossAccountVerifyTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CrossAccountVerifyTokenResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CrossAccountVerifyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CrossAccountVerifyTokenResponseBody self = new CrossAccountVerifyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CrossAccountVerifyTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CrossAccountVerifyTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CrossAccountVerifyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CrossAccountVerifyTokenResponseBody setResult(CrossAccountVerifyTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CrossAccountVerifyTokenResponseBodyResult getResult() {
        return this.result;
    }

    public CrossAccountVerifyTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CrossAccountVerifyTokenResponseBodyResult extends TeaModel {
        @NameInMap("AuthRoles")
        public java.util.List<String> authRoles;

        @NameInMap("AuthTime")
        public Long authTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uid")
        public String uid;

        public static CrossAccountVerifyTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CrossAccountVerifyTokenResponseBodyResult self = new CrossAccountVerifyTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CrossAccountVerifyTokenResponseBodyResult setAuthRoles(java.util.List<String> authRoles) {
            this.authRoles = authRoles;
            return this;
        }
        public java.util.List<String> getAuthRoles() {
            return this.authRoles;
        }

        public CrossAccountVerifyTokenResponseBodyResult setAuthTime(Long authTime) {
            this.authTime = authTime;
            return this;
        }
        public Long getAuthTime() {
            return this.authTime;
        }

        public CrossAccountVerifyTokenResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CrossAccountVerifyTokenResponseBodyResult setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
