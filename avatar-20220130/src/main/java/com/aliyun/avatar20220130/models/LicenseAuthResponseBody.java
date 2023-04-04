// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class LicenseAuthResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LicenseAuthResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static LicenseAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LicenseAuthResponseBody self = new LicenseAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public LicenseAuthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LicenseAuthResponseBody setData(LicenseAuthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LicenseAuthResponseBodyData getData() {
        return this.data;
    }

    public LicenseAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LicenseAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LicenseAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LicenseAuthResponseBodyData extends TeaModel {
        @NameInMap("Token")
        public String token;

        public static LicenseAuthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LicenseAuthResponseBodyData self = new LicenseAuthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LicenseAuthResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
