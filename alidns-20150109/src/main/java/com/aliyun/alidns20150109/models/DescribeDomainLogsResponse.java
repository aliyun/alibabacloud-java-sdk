// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("DomainLogs")
    @Validation(required = true)
    public DescribeDomainLogsResponseDomainLogs domainLogs;

    public static DescribeDomainLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainLogsResponse self = new DescribeDomainLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainLogsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainLogsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainLogsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainLogsResponse setDomainLogs(DescribeDomainLogsResponseDomainLogs domainLogs) {
        this.domainLogs = domainLogs;
        return this;
    }
    public DescribeDomainLogsResponseDomainLogs getDomainLogs() {
        return this.domainLogs;
    }

    public static class DescribeDomainLogsResponseDomainLogsDomainLog extends TeaModel {
        @NameInMap("ActionTime")
        @Validation(required = true)
        public String actionTime;

        @NameInMap("ActionTimestamp")
        @Validation(required = true)
        public Long actionTimestamp;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("ClientIp")
        @Validation(required = true)
        public String clientIp;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeDomainLogsResponseDomainLogsDomainLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainLogsResponseDomainLogsDomainLog self = new DescribeDomainLogsResponseDomainLogsDomainLog();
            return TeaModel.build(map, self);
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setActionTimestamp(Long actionTimestamp) {
            this.actionTimestamp = actionTimestamp;
            return this;
        }
        public Long getActionTimestamp() {
            return this.actionTimestamp;
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDomainLogsResponseDomainLogsDomainLog setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDomainLogsResponseDomainLogs extends TeaModel {
        @NameInMap("DomainLog")
        @Validation(required = true)
        public java.util.List<DescribeDomainLogsResponseDomainLogsDomainLog> domainLog;

        public static DescribeDomainLogsResponseDomainLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainLogsResponseDomainLogs self = new DescribeDomainLogsResponseDomainLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainLogsResponseDomainLogs setDomainLog(java.util.List<DescribeDomainLogsResponseDomainLogsDomainLog> domainLog) {
            this.domainLog = domainLog;
            return this;
        }
        public java.util.List<DescribeDomainLogsResponseDomainLogsDomainLog> getDomainLog() {
            return this.domainLog;
        }

    }

}
