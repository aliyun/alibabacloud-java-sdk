// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafLogsResponseBody extends TeaModel {
    @NameInMap("DomainLogDetails")
    public java.util.List<DescribeDcdnWafLogsResponseBodyDomainLogDetails> domainLogDetails;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafLogsResponseBody self = new DescribeDcdnWafLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafLogsResponseBody setDomainLogDetails(java.util.List<DescribeDcdnWafLogsResponseBodyDomainLogDetails> domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public java.util.List<DescribeDcdnWafLogsResponseBodyDomainLogDetails> getDomainLogDetails() {
        return this.domainLogDetails;
    }

    public DescribeDcdnWafLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("LogName")
        public String logName;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos self = new DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos self = new DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeDcdnWafLogsResponseBodyDomainLogDetails extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LogCount")
        public Long logCount;

        @NameInMap("LogInfos")
        public java.util.List<DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos> logInfos;

        @NameInMap("PageInfos")
        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos pageInfos;

        public static DescribeDcdnWafLogsResponseBodyDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafLogsResponseBodyDomainLogDetails self = new DescribeDcdnWafLogsResponseBodyDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetails setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetails setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetails setLogInfos(java.util.List<DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos> logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public java.util.List<DescribeDcdnWafLogsResponseBodyDomainLogDetailsLogInfos> getLogInfos() {
            return this.logInfos;
        }

        public DescribeDcdnWafLogsResponseBodyDomainLogDetails setPageInfos(DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeDcdnWafLogsResponseBodyDomainLogDetailsPageInfos getPageInfos() {
            return this.pageInfos;
        }

    }

}
