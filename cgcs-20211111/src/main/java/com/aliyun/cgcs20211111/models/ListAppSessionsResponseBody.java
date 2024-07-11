// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppSessionsResponseBody extends TeaModel {
    @NameInMap("AppSessions")
    public java.util.List<ListAppSessionsResponseBodyAppSessions> appSessions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListAppSessionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppSessionsResponseBodyAppSessionsBizInfo extends TeaModel {
        /**
         * <p>会话启动时间</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20 17:58:51</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>会话停止时间</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20 17:58:57</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        public static ListAppSessionsResponseBodyAppSessionsBizInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppSessionsResponseBodyAppSessionsBizInfo self = new ListAppSessionsResponseBodyAppSessionsBizInfo();
            return TeaModel.build(map, self);
        }

        public ListAppSessionsResponseBodyAppSessionsBizInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAppSessionsResponseBodyAppSessionsBizInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class ListAppSessionsResponseBodyAppSessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13027XXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>35067XXXX</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>业务特定的信息，如会话启动/停止时间。</p>
         */
        @NameInMap("BizInfo")
        public ListAppSessionsResponseBodyAppSessionsBizInfo bizInfo;

        /**
         * <strong>example:</strong>
         * <p>1ADE0XXXX</p>
         */
        @NameInMap("CustomSessionId")
        public String customSessionId;

        /**
         * <strong>example:</strong>
         * <p>100XXXX</p>
         */
        @NameInMap("PlatformSessionId")
        public String platformSessionId;

        /**
         * <strong>example:</strong>
         * <p>d9a8****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
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

        public ListAppSessionsResponseBodyAppSessions setBizInfo(ListAppSessionsResponseBodyAppSessionsBizInfo bizInfo) {
            this.bizInfo = bizInfo;
            return this;
        }
        public ListAppSessionsResponseBodyAppSessionsBizInfo getBizInfo() {
            return this.bizInfo;
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

        public ListAppSessionsResponseBodyAppSessions setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
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
