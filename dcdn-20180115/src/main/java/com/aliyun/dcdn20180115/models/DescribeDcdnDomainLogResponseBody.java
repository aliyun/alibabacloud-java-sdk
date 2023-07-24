// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainLogResponseBody extends TeaModel {
    /**
     * <p>The log information. The log information is indicated by the DomainLogDetail parameter.</p>
     */
    @NameInMap("DomainLogDetails")
    public DescribeDcdnDomainLogResponseBodyDomainLogDetails domainLogDetails;

    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainLogResponseBody self = new DescribeDcdnDomainLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainLogResponseBody setDomainLogDetails(DescribeDcdnDomainLogResponseBodyDomainLogDetails domainLogDetails) {
        this.domainLogDetails = domainLogDetails;
        return this;
    }
    public DescribeDcdnDomainLogResponseBodyDomainLogDetails getDomainLogDetails() {
        return this.domainLogDetails;
    }

    public DescribeDcdnDomainLogResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail extends TeaModel {
        /**
         * <p>The end of the time range during which data was queried.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the log file.</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>The path of the log file.</p>
         * <br>
         * <p>Take note of the Expires field (expiration timestamp) in the response parameter LogPath. If the log download URL expires, you must obtain it again. For more information, see [LogPath field](~~31952~~).</p>
         */
        @NameInMap("LogPath")
        public String logPath;

        /**
         * <p>The size of the log file. Unit: bytes.</p>
         */
        @NameInMap("LogSize")
        public Long logSize;

        /**
         * <p>The start of the time range during which data was queried.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail self = new DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos extends TeaModel {
        @NameInMap("LogInfoDetail")
        public java.util.List<DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail;

        public static DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos self = new DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos setLogInfoDetail(java.util.List<DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> logInfoDetail) {
            this.logInfoDetail = logInfoDetail;
            return this;
        }
        public java.util.List<DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfosLogInfoDetail> getLogInfoDetail() {
            return this.logInfoDetail;
        }

    }

    public static class DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos self = new DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail extends TeaModel {
        /**
         * <p>The total number of entries returned on the current page.</p>
         */
        @NameInMap("LogCount")
        public Long logCount;

        /**
         * <p>The log information. The log information is indicated by the LogInfoDetail parameter.</p>
         */
        @NameInMap("LogInfos")
        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos;

        /**
         * <p>The page information. The page information is indicated by the PageInfoDetail parameter.</p>
         */
        @NameInMap("PageInfos")
        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos;

        public static DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail self = new DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail setLogInfos(DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailLogInfos getLogInfos() {
            return this.logInfos;
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail setPageInfos(DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetailPageInfos getPageInfos() {
            return this.pageInfos;
        }

    }

    public static class DescribeDcdnDomainLogResponseBodyDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        public java.util.List<DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeDcdnDomainLogResponseBodyDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainLogResponseBodyDomainLogDetails self = new DescribeDcdnDomainLogResponseBodyDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainLogResponseBodyDomainLogDetails setDomainLogDetail(java.util.List<DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail> domainLogDetail) {
            this.domainLogDetail = domainLogDetail;
            return this;
        }
        public java.util.List<DescribeDcdnDomainLogResponseBodyDomainLogDetailsDomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

    }

}
