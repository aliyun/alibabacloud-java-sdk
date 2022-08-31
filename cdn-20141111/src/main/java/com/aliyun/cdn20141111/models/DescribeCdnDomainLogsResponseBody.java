// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainLogsResponseBody extends TeaModel {
    @NameInMap("DomainLogModel")
    public DescribeCdnDomainLogsResponseBodyDomainLogModel domainLogModel;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCdnDomainLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainLogsResponseBody self = new DescribeCdnDomainLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainLogsResponseBody setDomainLogModel(DescribeCdnDomainLogsResponseBodyDomainLogModel domainLogModel) {
        this.domainLogModel = domainLogModel;
        return this;
    }
    public DescribeCdnDomainLogsResponseBodyDomainLogModel getDomainLogModel() {
        return this.domainLogModel;
    }

    public DescribeCdnDomainLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnDomainLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCdnDomainLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnDomainLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail extends TeaModel {
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

        public static DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail self = new DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails extends TeaModel {
        @NameInMap("DomainLogDetail")
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail> domainLogDetail;

        public static DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails self = new DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails setDomainLogDetail(java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail> domainLogDetail) {
            this.domainLogDetail = domainLogDetail;
            return this;
        }
        public java.util.List<DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetailsDomainLogDetail> getDomainLogDetail() {
            return this.domainLogDetail;
        }

    }

    public static class DescribeCdnDomainLogsResponseBodyDomainLogModel extends TeaModel {
        @NameInMap("DomainLogDetails")
        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails domainLogDetails;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeCdnDomainLogsResponseBodyDomainLogModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainLogsResponseBodyDomainLogModel self = new DescribeCdnDomainLogsResponseBodyDomainLogModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModel setDomainLogDetails(DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails domainLogDetails) {
            this.domainLogDetails = domainLogDetails;
            return this;
        }
        public DescribeCdnDomainLogsResponseBodyDomainLogModelDomainLogDetails getDomainLogDetails() {
            return this.domainLogDetails;
        }

        public DescribeCdnDomainLogsResponseBodyDomainLogModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
