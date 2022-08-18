// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainLogsResponseBody extends TeaModel {
    @NameInMap("DomainLogs")
    public DescribeDomainLogsResponseBodyDomainLogs domainLogs;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainLogsResponseBody self = new DescribeDomainLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainLogsResponseBody setDomainLogs(DescribeDomainLogsResponseBodyDomainLogs domainLogs) {
        this.domainLogs = domainLogs;
        return this;
    }
    public DescribeDomainLogsResponseBodyDomainLogs getDomainLogs() {
        return this.domainLogs;
    }

    public DescribeDomainLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainLogsResponseBodyDomainLogsDomainLog extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionTime")
        public String actionTime;

        @NameInMap("ActionTimestamp")
        public Long actionTimestamp;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Message")
        public String message;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDomainLogsResponseBodyDomainLogsDomainLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainLogsResponseBodyDomainLogsDomainLog self = new DescribeDomainLogsResponseBodyDomainLogsDomainLog();
            return TeaModel.build(map, self);
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setActionTimestamp(Long actionTimestamp) {
            this.actionTimestamp = actionTimestamp;
            return this;
        }
        public Long getActionTimestamp() {
            return this.actionTimestamp;
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDomainLogsResponseBodyDomainLogsDomainLog setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDomainLogsResponseBodyDomainLogs extends TeaModel {
        @NameInMap("DomainLog")
        public java.util.List<DescribeDomainLogsResponseBodyDomainLogsDomainLog> domainLog;

        public static DescribeDomainLogsResponseBodyDomainLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainLogsResponseBodyDomainLogs self = new DescribeDomainLogsResponseBodyDomainLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainLogsResponseBodyDomainLogs setDomainLog(java.util.List<DescribeDomainLogsResponseBodyDomainLogsDomainLog> domainLog) {
            this.domainLog = domainLog;
            return this;
        }
        public java.util.List<DescribeDomainLogsResponseBodyDomainLogsDomainLog> getDomainLog() {
            return this.domainLog;
        }

    }

}
