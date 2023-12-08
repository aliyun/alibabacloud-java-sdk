// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainLogExTtlResponseBody extends TeaModel {
    @NameInMap("DomainLogDetails")
    public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails domainLogDetails;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainLogExTtlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainLogExTtlResponseBody self = new DescribeDcdnDomainLogExTtlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainLogExTtlResponseBody setDomainLogDetails(DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    public DescribeDcdnDomainLogExTtlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
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

        public static DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail self = new DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos extends TeaModel {
        @NameInMap("LogInfoDetail")
        public java.util.List<DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail;

        public static DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos self = new DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos setLogInfoDetail(java.util.List<DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail) {
            this.logInfoDetail = logInfoDetail;
            return this;
        }
        public java.util.List<DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

    }

    public static class DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos self = new DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LogCount")
        public Long logCount;

        @NameInMap("LogInfos")
        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos;

        @NameInMap("PageInfos")
        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        public static DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail self = new DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail setLogInfos(DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailLogInfos getLogInfos() {
            return this.logInfos;
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail setPageInfos(DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetailPageInfos getPageInfos() {
            return this.pageInfos;
        }

    }

    public static class DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        public java.util.List<DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails self = new DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetails setDomainLogDetail(java.util.List<DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail) {
            this.domainLogDetail = domainLogDetail;
            return this;
        }
        public java.util.List<DescribeDcdnDomainLogExTtlResponseBodyDomainLogDetailsDomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

    }

}
