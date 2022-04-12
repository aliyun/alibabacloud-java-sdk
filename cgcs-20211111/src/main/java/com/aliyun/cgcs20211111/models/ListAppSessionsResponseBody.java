// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppSessionsResponseBody extends TeaModel {
    @NameInMap("AppSessions")
    public java.util.List<ListAppSessionsResponseBodyAppSessions> appSessions;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static ListAppSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppSessionsResponseBody self = new ListAppSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppSessionsResponseBody setAppSessions(java.util.List<ListAppSessionsResponseBodyAppSessions> appSessions) {
        this.appSessions = appSessions;
        return this;
    }
    public java.util.List<ListAppSessionsResponseBodyAppSessions> getAppSessions() {
        return this.appSessions;
    }

    public ListAppSessionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppSessionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppSessionsResponseBodyAppSessions extends TeaModel {
        // 应用id
        @NameInMap("AppId")
        public String appId;

        // 应用版本
        @NameInMap("AppVersion")
        public String appVersion;

        // 自定义会话id
        @NameInMap("CustomSessionId")
        public String customSessionId;

        // 平台会话id
        @NameInMap("PlatformSessionId")
        public String platformSessionId;

        // 状态
        @NameInMap("Status")
        public String status;

        public static ListAppSessionsResponseBodyAppSessions build(java.util.Map<String, ?> map) throws Exception {
            ListAppSessionsResponseBodyAppSessions self = new ListAppSessionsResponseBodyAppSessions();
            return TeaModel.build(map, self);
        }

        public ListAppSessionsResponseBodyAppSessions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppSessionsResponseBodyAppSessions setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAppSessionsResponseBodyAppSessions setCustomSessionId(String customSessionId) {
            this.customSessionId = customSessionId;
            return this;
        }
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        public ListAppSessionsResponseBodyAppSessions setPlatformSessionId(String platformSessionId) {
            this.platformSessionId = platformSessionId;
            return this;
        }
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

        public ListAppSessionsResponseBodyAppSessions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
