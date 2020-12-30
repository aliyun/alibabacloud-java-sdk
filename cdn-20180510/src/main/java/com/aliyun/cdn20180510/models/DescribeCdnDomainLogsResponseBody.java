// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainLogDetails")
    public DescribeCdnDomainLogsResponseBodyDomainLogDetails domainLogDetails;

    public static DescribeCdnDomainLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainLogsResponseBody self = new DescribeCdnDomainLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnDomainLogsResponseBody setDomainLogDetails(DescribeCdnDomainLogsResponseBodyDomainLogDetails domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public DescribeCdnDomainLogsResponseBodyDomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail self = new DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos extends TeaModel {
        @NameInMap("PageInfoDetail")
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail> pageInfoDetail;

        public static DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos self = new DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageInfoDetail(java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail> pageInfoDetail) {
            this.pageInfoDetail = pageInfoDetail;
            return this;
        }
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfosPageInfoDetail> getPageInfoDetail() {
            return this.pageInfoDetail;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("LogName")
        public String logName;

        public static DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail self = new DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos extends TeaModel {
        @NameInMap("LogInfoDetail")
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail;

        public static DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos self = new DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos setLogInfoDetail(java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail) {
            this.logInfoDetail = logInfoDetail;
            return this;
        }
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail extends TeaModel {
        @NameInMap("PageInfos")
        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        @NameInMap("LogCount")
        public Long logCount;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LogInfos")
        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos;

        public static DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail self = new DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail setPageInfos(DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailPageInfos getPageInfos() {
            return this.pageInfos;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail setLogInfos(DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetailLogInfos getLogInfos() {
            return this.logInfos;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeCdnDomainLogsResponseBodyDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogDetails self = new DescribeCdnDomainLogsResponseBodyDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogDetails setDomainLogDetail(java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail) {
            this.domainLogDetail = domainLogDetail;
            return this;
        }
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogDetailsDomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

    }

}
