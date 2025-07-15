// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePushProxyLogResponseBody extends TeaModel {
    /**
     * <p>The log information.</p>
     */
    @NameInMap("DomainLogDetails")
    public DescribeLivePushProxyLogResponseBodyDomainLogDetails domainLogDetails;

    /**
     * <p>Push domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLivePushProxyLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePushProxyLogResponseBody self = new DescribeLivePushProxyLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePushProxyLogResponseBody setDomainLogDetails(DescribeLivePushProxyLogResponseBodyDomainLogDetails domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public DescribeLivePushProxyLogResponseBodyDomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    public DescribeLivePushProxyLogResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLivePushProxyLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
        /**
         * <p>The end of the time range during which data was queried.</p>
         * <p>The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1695189600</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the log file.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com
         * _2023_09_20_160000_170000.****.gz</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>The path of the log file.</p>
         */
        @NameInMap("LogPath")
        public String logPath;

        /**
         * <p>The size of the log file.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("LogSize")
        public Long logSize;

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * <p>The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1695193200</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail self = new DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos extends TeaModel {
        @NameInMap("LogInfoDetail")
        public java.util.List<DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail;

        public static DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos self = new DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos setLogInfoDetail(java.util.List<DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail) {
            this.logInfoDetail = logInfoDetail;
            return this;
        }
        public java.util.List<DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

    }

    public static class DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos self = new DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail extends TeaModel {
        /**
         * <p>The total number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LogCount")
        public Long logCount;

        /**
         * <p>Details about the logs.</p>
         */
        @NameInMap("LogInfos")
        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos;

        /**
         * <p>The page information.</p>
         */
        @NameInMap("PageInfos")
        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        public static DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail self = new DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail setLogInfos(DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos getLogInfos() {
            return this.logInfos;
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail setPageInfos(DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos getPageInfos() {
            return this.pageInfos;
        }

    }

    public static class DescribeLivePushProxyLogResponseBodyDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        public java.util.List<DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeLivePushProxyLogResponseBodyDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePushProxyLogResponseBodyDomainLogDetails self = new DescribeLivePushProxyLogResponseBodyDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeLivePushProxyLogResponseBodyDomainLogDetails setDomainLogDetail(java.util.List<DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail) {
            this.domainLogDetail = domainLogDetail;
            return this;
        }
        public java.util.List<DescribeLivePushProxyLogResponseBodyDomainLogDetailsDomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

    }

}
