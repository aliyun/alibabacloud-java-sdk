// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class SearchUserApplicationsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public java.util.List<SearchUserApplicationsResponseBodyContent> content;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchUserApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchUserApplicationsResponseBody self = new SearchUserApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchUserApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchUserApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchUserApplicationsResponseBody setContent(java.util.List<SearchUserApplicationsResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<SearchUserApplicationsResponseBodyContent> getContent() {
        return this.content;
    }

    public SearchUserApplicationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchUserApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchUserApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchUserApplicationsResponseBodyContent extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppType")
        public Integer appType;

        public static SearchUserApplicationsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            SearchUserApplicationsResponseBodyContent self = new SearchUserApplicationsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public SearchUserApplicationsResponseBodyContent setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchUserApplicationsResponseBodyContent setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchUserApplicationsResponseBodyContent setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

    }

}
