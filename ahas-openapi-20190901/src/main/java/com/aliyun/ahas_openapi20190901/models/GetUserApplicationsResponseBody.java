// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserApplicationsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("AppNameAndIdPairs")
    public java.util.List<GetUserApplicationsResponseBodyAppNameAndIdPairs> appNameAndIdPairs;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationsResponseBody self = new GetUserApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserApplicationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserApplicationsResponseBody setAppNameAndIdPairs(java.util.List<GetUserApplicationsResponseBodyAppNameAndIdPairs> appNameAndIdPairs) {
        this.appNameAndIdPairs = appNameAndIdPairs;
        return this;
    }
    public java.util.List<GetUserApplicationsResponseBodyAppNameAndIdPairs> getAppNameAndIdPairs() {
        return this.appNameAndIdPairs;
    }

    public GetUserApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserApplicationsResponseBodyAppNameAndIdPairs extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ScopeType")
        public Integer scopeType;

        @NameInMap("AppType")
        public Integer appType;

        public static GetUserApplicationsResponseBodyAppNameAndIdPairs build(java.util.Map<String, ?> map) throws Exception {
            GetUserApplicationsResponseBodyAppNameAndIdPairs self = new GetUserApplicationsResponseBodyAppNameAndIdPairs();
            return TeaModel.build(map, self);
        }

        public GetUserApplicationsResponseBodyAppNameAndIdPairs setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetUserApplicationsResponseBodyAppNameAndIdPairs setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetUserApplicationsResponseBodyAppNameAndIdPairs setScopeType(Integer scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public Integer getScopeType() {
            return this.scopeType;
        }

        public GetUserApplicationsResponseBodyAppNameAndIdPairs setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

    }

}
