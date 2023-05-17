// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class QuerySmsReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsReports")
    public java.util.List<QuerySmsReportsResponseBodySmsReports> smsReports;

    @NameInMap("TotalElements")
    public Long totalElements;

    public static QuerySmsReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsReportsResponseBody self = new QuerySmsReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsReportsResponseBody setSmsReports(java.util.List<QuerySmsReportsResponseBodySmsReports> smsReports) {
        this.smsReports = smsReports;
        return this;
    }
    public java.util.List<QuerySmsReportsResponseBodySmsReports> getSmsReports() {
        return this.smsReports;
    }

    public QuerySmsReportsResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public static class QuerySmsReportsResponseBodySmsReports extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChargedCount")
        public Integer chargedCount;

        @NameInMap("Code")
        public String code;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("Stat")
        public String stat;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("Time")
        public String time;

        public static QuerySmsReportsResponseBodySmsReports build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsReportsResponseBodySmsReports self = new QuerySmsReportsResponseBodySmsReports();
            return TeaModel.build(map, self);
        }

        public QuerySmsReportsResponseBodySmsReports setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QuerySmsReportsResponseBodySmsReports setChargedCount(Integer chargedCount) {
            this.chargedCount = chargedCount;
            return this;
        }
        public Integer getChargedCount() {
            return this.chargedCount;
        }

        public QuerySmsReportsResponseBodySmsReports setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QuerySmsReportsResponseBodySmsReports setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QuerySmsReportsResponseBodySmsReports setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QuerySmsReportsResponseBodySmsReports setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public QuerySmsReportsResponseBodySmsReports setStat(String stat) {
            this.stat = stat;
            return this;
        }
        public String getStat() {
            return this.stat;
        }

        public QuerySmsReportsResponseBodySmsReports setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QuerySmsReportsResponseBodySmsReports setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public QuerySmsReportsResponseBodySmsReports setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
