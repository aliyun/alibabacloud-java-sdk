// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site log information.</p>
     */
    @NameInMap("SiteLogDetails")
    public java.util.List<DescribeSiteLogsResponseBodySiteLogDetails> siteLogDetails;

    public static DescribeSiteLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteLogsResponseBody self = new DescribeSiteLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteLogsResponseBody setSiteLogDetails(java.util.List<DescribeSiteLogsResponseBodySiteLogDetails> siteLogDetails) {
        this.siteLogDetails = siteLogDetails;
        return this;
    }
    public java.util.List<DescribeSiteLogsResponseBodySiteLogDetails> getSiteLogDetails() {
        return this.siteLogDetails;
    }

    public static class DescribeSiteLogsResponseBodySiteLogDetailsLogInfos extends TeaModel {
        /**
         * <p>The end time.</p>
         * <blockquote>
         * <p>Date format example: yyyy-MM-ddTHH:mm:ssZ</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-11-06T17:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The log name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com_2022_11_07_000000_020000.gz.xxxxxx</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>The log path.</p>
         * <blockquote>
         * <p>Note the Expires field (expiration timestamp) in the LogPath response parameter. After the expiration time, the log download link becomes invalid and must be obtained again.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com /v1.l1cache/105252530/example.com/2022_11_07/example.com_2022_11_07_000000_020000.gz.xxxxxx?Expires=1636963354&amp;OSSAccessKeyId=LTAIviCc6zy8****&amp;Signature=u0V6foRfZniHE8i%2BHUdxGOhZsK****</p>
         */
        @NameInMap("LogPath")
        public String logPath;

        /**
         * <p>The log size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>438304768</p>
         */
        @NameInMap("LogSize")
        public Integer logSize;

        /**
         * <p>The start time.</p>
         * <blockquote>
         * <p>Date format example: yyyy-MM-ddTHH:mm:ssZ</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-11-06T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeSiteLogsResponseBodySiteLogDetailsLogInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteLogsResponseBodySiteLogDetailsLogInfos self = new DescribeSiteLogsResponseBodySiteLogDetailsLogInfos();
            return TeaModel.build(map, self);
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsLogInfos setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsLogInfos setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsLogInfos setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsLogInfos setLogSize(Integer logSize) {
            this.logSize = logSize;
            return this;
        }
        public Integer getLogSize() {
            return this.logSize;
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsLogInfos setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeSiteLogsResponseBodySiteLogDetailsPageInfos extends TeaModel {
        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Integer pageIndex;

        /**
         * <p>The number of entries per page. Default value: <strong>300</strong>. Valid values: <strong>1 to 1000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSiteLogsResponseBodySiteLogDetailsPageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteLogsResponseBodySiteLogDetailsPageInfos self = new DescribeSiteLogsResponseBodySiteLogDetailsPageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsPageInfos setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsPageInfos setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSiteLogsResponseBodySiteLogDetailsPageInfos setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSiteLogsResponseBodySiteLogDetails extends TeaModel {
        /**
         * <p>The total number of entries returned on this page.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("LogCount")
        public Integer logCount;

        /**
         * <p>The site log package information.</p>
         */
        @NameInMap("LogInfos")
        public java.util.List<DescribeSiteLogsResponseBodySiteLogDetailsLogInfos> logInfos;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfos")
        public DescribeSiteLogsResponseBodySiteLogDetailsPageInfos pageInfos;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456***</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        public static DescribeSiteLogsResponseBodySiteLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteLogsResponseBodySiteLogDetails self = new DescribeSiteLogsResponseBodySiteLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSiteLogsResponseBodySiteLogDetails setLogCount(Integer logCount) {
            this.logCount = logCount;
            return this;
        }
        public Integer getLogCount() {
            return this.logCount;
        }

        public DescribeSiteLogsResponseBodySiteLogDetails setLogInfos(java.util.List<DescribeSiteLogsResponseBodySiteLogDetailsLogInfos> logInfos) {
            this.logInfos = logInfos;
            return this;
        }
        public java.util.List<DescribeSiteLogsResponseBodySiteLogDetailsLogInfos> getLogInfos() {
            return this.logInfos;
        }

        public DescribeSiteLogsResponseBodySiteLogDetails setPageInfos(DescribeSiteLogsResponseBodySiteLogDetailsPageInfos pageInfos) {
            this.pageInfos = pageInfos;
            return this;
        }
        public DescribeSiteLogsResponseBodySiteLogDetailsPageInfos getPageInfos() {
            return this.pageInfos;
        }

        public DescribeSiteLogsResponseBodySiteLogDetails setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public DescribeSiteLogsResponseBodySiteLogDetails setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

}
