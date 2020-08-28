// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SiteMonitors")
    @Validation(required = true)
    public DescribeSiteMonitorListResponseSiteMonitors siteMonitors;

    public static DescribeSiteMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListResponse self = new DescribeSiteMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSiteMonitorListResponseSiteMonitorsSiteMonitorOptionsJson extends TeaModel {
        @NameInMap("dns_type")
        @Validation(required = true)
        public String dnsType;

        @NameInMap("dns_server")
        @Validation(required = true)
        public String dnsServer;

        @NameInMap("expect_value")
        @Validation(required = true)
        public String expectValue;

        @NameInMap("http_method")
        @Validation(required = true)
        public String httpMethod;

        @NameInMap("response_content")
        @Validation(required = true)
        public String responseContent;

        @NameInMap("match_rule")
        @Validation(required = true)
        public Integer matchRule;

        @NameInMap("request_content")
        @Validation(required = true)
        public String requestContent;

        @NameInMap("cookie")
        @Validation(required = true)
        public String cookie;

        @NameInMap("header")
        @Validation(required = true)
        public String header;

        @NameInMap("username")
        @Validation(required = true)
        public String username;

        @NameInMap("password")
        @Validation(required = true)
        public String password;

        @NameInMap("time_out")
        @Validation(required = true)
        public Long timeOut;

        @NameInMap("ping_num")
        @Validation(required = true)
        public Integer pingNum;

        @NameInMap("failure_rate")
        @Validation(required = true)
        public Double failureRate;

        @NameInMap("request_format")
        @Validation(required = true)
        public String requestFormat;

        @NameInMap("response_format")
        @Validation(required = true)
        public String responseFormat;

        @NameInMap("port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("authentication")
        @Validation(required = true)
        public Integer authentication;

        @NameInMap("traceroute")
        @Validation(required = true)
        public Long traceroute;

        public static DescribeSiteMonitorListResponseSiteMonitorsSiteMonitorOptionsJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseSiteMonitorsSiteMonitorOptionsJson self = new DescribeSiteMonitorListResponseSiteMonitorsSiteMonitorOptionsJson();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorListResponseSiteMonitorsSiteMonitor extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("TaskState")
        @Validation(required = true)
        public String taskState;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("Interval")
        @Validation(required = true)
        public String interval;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("OptionsJson")
        @Validation(required = true)
        public DescribeSiteMonitorListResponseSiteMonitorsSiteMonitorOptionsJson optionsJson;

        public static DescribeSiteMonitorListResponseSiteMonitorsSiteMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseSiteMonitorsSiteMonitor self = new DescribeSiteMonitorListResponseSiteMonitorsSiteMonitor();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorListResponseSiteMonitors extends TeaModel {
        @NameInMap("SiteMonitor")
        @Validation(required = true)
        public java.util.List<DescribeSiteMonitorListResponseSiteMonitorsSiteMonitor> siteMonitor;

        public static DescribeSiteMonitorListResponseSiteMonitors build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorListResponseSiteMonitors self = new DescribeSiteMonitorListResponseSiteMonitors();
            return TeaModel.build(map, self);
        }

    }

}
