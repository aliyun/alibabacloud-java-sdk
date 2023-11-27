// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetCommonConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetCommonConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetCommonConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommonConfigResponseBody self = new GetCommonConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommonConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCommonConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCommonConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommonConfigResponseBody setResult(GetCommonConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCommonConfigResponseBodyResult getResult() {
        return this.result;
    }

    public GetCommonConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCommonConfigResponseBodyResultCommonConfigAppConfigs extends TeaModel {
        /**
         * <p>appKey</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("Platform")
        public String platform;

        public static GetCommonConfigResponseBodyResultCommonConfigAppConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResultCommonConfigAppConfigs self = new GetCommonConfigResponseBodyResultCommonConfigAppConfigs();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResultCommonConfigAppConfigs setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetCommonConfigResponseBodyResultCommonConfigAppConfigs setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

    public static class GetCommonConfigResponseBodyResultCommonConfigLoginConfig extends TeaModel {
        @NameInMap("LoginType")
        public Integer loginType;

        public static GetCommonConfigResponseBodyResultCommonConfigLoginConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResultCommonConfigLoginConfig self = new GetCommonConfigResponseBodyResultCommonConfigLoginConfig();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResultCommonConfigLoginConfig setLoginType(Integer loginType) {
            this.loginType = loginType;
            return this;
        }
        public Integer getLoginType() {
            return this.loginType;
        }

    }

    public static class GetCommonConfigResponseBodyResultCommonConfig extends TeaModel {
        @NameInMap("AppConfigs")
        public java.util.List<GetCommonConfigResponseBodyResultCommonConfigAppConfigs> appConfigs;

        @NameInMap("LoginConfig")
        public GetCommonConfigResponseBodyResultCommonConfigLoginConfig loginConfig;

        public static GetCommonConfigResponseBodyResultCommonConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResultCommonConfig self = new GetCommonConfigResponseBodyResultCommonConfig();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResultCommonConfig setAppConfigs(java.util.List<GetCommonConfigResponseBodyResultCommonConfigAppConfigs> appConfigs) {
            this.appConfigs = appConfigs;
            return this;
        }
        public java.util.List<GetCommonConfigResponseBodyResultCommonConfigAppConfigs> getAppConfigs() {
            return this.appConfigs;
        }

        public GetCommonConfigResponseBodyResultCommonConfig setLoginConfig(GetCommonConfigResponseBodyResultCommonConfigLoginConfig loginConfig) {
            this.loginConfig = loginConfig;
            return this;
        }
        public GetCommonConfigResponseBodyResultCommonConfigLoginConfig getLoginConfig() {
            return this.loginConfig;
        }

    }

    public static class GetCommonConfigResponseBodyResult extends TeaModel {
        @NameInMap("CommonConfig")
        public GetCommonConfigResponseBodyResultCommonConfig commonConfig;

        public static GetCommonConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResult self = new GetCommonConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResult setCommonConfig(GetCommonConfigResponseBodyResultCommonConfig commonConfig) {
            this.commonConfig = commonConfig;
            return this;
        }
        public GetCommonConfigResponseBodyResultCommonConfig getCommonConfig() {
            return this.commonConfig;
        }

    }

}
