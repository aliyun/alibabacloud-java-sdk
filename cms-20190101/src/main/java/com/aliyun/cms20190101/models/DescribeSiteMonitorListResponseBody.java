// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    @NameInMap("SiteMonitors")
    public DescribeSiteMonitorListResponseBodySiteMonitors siteMonitors;

    public static DescribeSiteMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListResponseBody self = new DescribeSiteMonitorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSiteMonitorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSiteMonitorListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSiteMonitorListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSiteMonitorListResponseBody setSiteMonitors(DescribeSiteMonitorListResponseBodySiteMonitors siteMonitors) {
        this.siteMonitors = siteMonitors;
        return this;
    }
    public DescribeSiteMonitorListResponseBodySiteMonitors getSiteMonitors() {
        return this.siteMonitors;
    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson extends TeaModel {
        @NameInMap("password")
        public String password;

        @NameInMap("request_format")
        public String requestFormat;

        @NameInMap("expect_value")
        public String expectValue;

        @NameInMap("response_content")
        public String responseContent;

        @NameInMap("time_out")
        public Long timeOut;

        @NameInMap("failure_rate")
        public Float failureRate;

        @NameInMap("header")
        public String header;

        @NameInMap("cookie")
        public String cookie;

        @NameInMap("ping_num")
        public Integer pingNum;

        @NameInMap("port")
        public Integer port;

        @NameInMap("authentication")
        public Integer authentication;

        @NameInMap("http_method")
        public String httpMethod;

        @NameInMap("match_rule")
        public Integer matchRule;

        @NameInMap("request_content")
        public String requestContent;

        @NameInMap("username")
        public String username;

        @NameInMap("traceroute")
        public Long traceroute;

        @NameInMap("response_format")
        public String responseFormat;

        @NameInMap("dns_type")
        public String dnsType;

        @NameInMap("dns_server")
        public String dnsServer;

        public static DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson self = new DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setRequestFormat(String requestFormat) {
            this.requestFormat = requestFormat;
            return this;
        }
        public String getRequestFormat() {
            return this.requestFormat;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setResponseContent(String responseContent) {
            this.responseContent = responseContent;
            return this;
        }
        public String getResponseContent() {
            return this.responseContent;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setTimeOut(Long timeOut) {
            this.timeOut = timeOut;
            return this;
        }
        public Long getTimeOut() {
            return this.timeOut;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setFailureRate(Float failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public Float getFailureRate() {
            return this.failureRate;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setHeader(String header) {
            this.header = header;
            return this;
        }
        public String getHeader() {
            return this.header;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setPingNum(Integer pingNum) {
            this.pingNum = pingNum;
            return this;
        }
        public Integer getPingNum() {
            return this.pingNum;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setAuthentication(Integer authentication) {
            this.authentication = authentication;
            return this;
        }
        public Integer getAuthentication() {
            return this.authentication;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setMatchRule(Integer matchRule) {
            this.matchRule = matchRule;
            return this;
        }
        public Integer getMatchRule() {
            return this.matchRule;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setTraceroute(Long traceroute) {
            this.traceroute = traceroute;
            return this;
        }
        public Long getTraceroute() {
            return this.traceroute;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setResponseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }
        public String getResponseFormat() {
            return this.responseFormat;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDnsType(String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public String getDnsType() {
            return this.dnsType;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson setDnsServer(String dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public String getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor extends TeaModel {
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("TaskState")
        public String taskState;

        @NameInMap("OptionsJson")
        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson optionsJson;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Address")
        public String address;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor self = new DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setOptionsJson(DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitorOptionsJson getOptionsJson() {
            return this.optionsJson;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeSiteMonitorListResponseBodySiteMonitors extends TeaModel {
        @NameInMap("SiteMonitor")
        public java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor> siteMonitor;

        public static DescribeSiteMonitorListResponseBodySiteMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseBodySiteMonitors self = new DescribeSiteMonitorListResponseBodySiteMonitors();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorListResponseBodySiteMonitors setSiteMonitor(java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor> siteMonitor) {
            this.siteMonitor = siteMonitor;
            return this;
        }
        public java.util.List<DescribeSiteMonitorListResponseBodySiteMonitorsSiteMonitor> getSiteMonitor() {
            return this.siteMonitor;
        }

    }

}
