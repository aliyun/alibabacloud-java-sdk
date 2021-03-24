// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetCommonConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 返回值
    @NameInMap("Result")
    public GetCommonConfigResponseBodyResult result;

    public static GetCommonConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommonConfigResponseBody self = new GetCommonConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommonConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommonConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public GetCommonConfigResponseBody setResult(GetCommonConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCommonConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetCommonConfigResponseBodyResultCommonConfigLoginConfig extends TeaModel {
        // 登录类型
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

    public static class GetCommonConfigResponseBodyResultCommonConfigAppConfigs extends TeaModel {
        // appKey
        @NameInMap("AppKey")
        public String appKey;

        // 平台
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

    public static class GetCommonConfigResponseBodyResultCommonConfigMediaConfig extends TeaModel {
        // 域名
        @NameInMap("Domain")
        public String domain;

        public static GetCommonConfigResponseBodyResultCommonConfigMediaConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResultCommonConfigMediaConfig self = new GetCommonConfigResponseBodyResultCommonConfigMediaConfig();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResultCommonConfigMediaConfig setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class GetCommonConfigResponseBodyResultCommonConfigConnectionConfig extends TeaModel {
        // 域名
        @NameInMap("Domain")
        public String domain;

        public static GetCommonConfigResponseBodyResultCommonConfigConnectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResultCommonConfigConnectionConfig self = new GetCommonConfigResponseBodyResultCommonConfigConnectionConfig();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResultCommonConfigConnectionConfig setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class GetCommonConfigResponseBodyResultCommonConfig extends TeaModel {
        // 登录配置
        @NameInMap("LoginConfig")
        public GetCommonConfigResponseBodyResultCommonConfigLoginConfig loginConfig;

        // app配置
        @NameInMap("AppConfigs")
        public java.util.List<GetCommonConfigResponseBodyResultCommonConfigAppConfigs> appConfigs;

        // 多媒体配置
        @NameInMap("MediaConfig")
        public GetCommonConfigResponseBodyResultCommonConfigMediaConfig mediaConfig;

        // 长连接配置
        @NameInMap("ConnectionConfig")
        public GetCommonConfigResponseBodyResultCommonConfigConnectionConfig connectionConfig;

        public static GetCommonConfigResponseBodyResultCommonConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCommonConfigResponseBodyResultCommonConfig self = new GetCommonConfigResponseBodyResultCommonConfig();
            return TeaModel.build(map, self);
        }

        public GetCommonConfigResponseBodyResultCommonConfig setLoginConfig(GetCommonConfigResponseBodyResultCommonConfigLoginConfig loginConfig) {
            this.loginConfig = loginConfig;
            return this;
        }
        public GetCommonConfigResponseBodyResultCommonConfigLoginConfig getLoginConfig() {
            return this.loginConfig;
        }

        public GetCommonConfigResponseBodyResultCommonConfig setAppConfigs(java.util.List<GetCommonConfigResponseBodyResultCommonConfigAppConfigs> appConfigs) {
            this.appConfigs = appConfigs;
            return this;
        }
        public java.util.List<GetCommonConfigResponseBodyResultCommonConfigAppConfigs> getAppConfigs() {
            return this.appConfigs;
        }

        public GetCommonConfigResponseBodyResultCommonConfig setMediaConfig(GetCommonConfigResponseBodyResultCommonConfigMediaConfig mediaConfig) {
            this.mediaConfig = mediaConfig;
            return this;
        }
        public GetCommonConfigResponseBodyResultCommonConfigMediaConfig getMediaConfig() {
            return this.mediaConfig;
        }

        public GetCommonConfigResponseBodyResultCommonConfig setConnectionConfig(GetCommonConfigResponseBodyResultCommonConfigConnectionConfig connectionConfig) {
            this.connectionConfig = connectionConfig;
            return this;
        }
        public GetCommonConfigResponseBodyResultCommonConfigConnectionConfig getConnectionConfig() {
            return this.connectionConfig;
        }

    }

    public static class GetCommonConfigResponseBodyResult extends TeaModel {
        // 通用配置
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
