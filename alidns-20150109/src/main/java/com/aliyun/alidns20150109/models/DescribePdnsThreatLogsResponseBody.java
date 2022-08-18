// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<DescribePdnsThreatLogsResponseBodyLogs> logs;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePdnsThreatLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatLogsResponseBody self = new DescribePdnsThreatLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatLogsResponseBody setLogs(java.util.List<DescribePdnsThreatLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribePdnsThreatLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribePdnsThreatLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsThreatLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsThreatLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePdnsThreatLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePdnsThreatLogsResponseBodyLogs extends TeaModel {
        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("ThreatLevel")
        public String threatLevel;

        @NameInMap("ThreatTime")
        public String threatTime;

        @NameInMap("ThreatType")
        public String threatType;

        public static DescribePdnsThreatLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsThreatLogsResponseBodyLogs self = new DescribePdnsThreatLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribePdnsThreatLogsResponseBodyLogs setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribePdnsThreatLogsResponseBodyLogs setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribePdnsThreatLogsResponseBodyLogs setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribePdnsThreatLogsResponseBodyLogs setThreatTime(String threatTime) {
            this.threatTime = threatTime;
            return this;
        }
        public String getThreatTime() {
            return this.threatTime;
        }

        public DescribePdnsThreatLogsResponseBodyLogs setThreatType(String threatType) {
            this.threatType = threatType;
            return this;
        }
        public String getThreatType() {
            return this.threatType;
        }

    }

}
