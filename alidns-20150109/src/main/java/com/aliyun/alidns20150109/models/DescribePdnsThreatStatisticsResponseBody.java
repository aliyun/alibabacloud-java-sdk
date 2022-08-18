// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePdnsThreatStatisticsResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePdnsThreatStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatStatisticsResponseBody self = new DescribePdnsThreatStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatStatisticsResponseBody setData(java.util.List<DescribePdnsThreatStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePdnsThreatStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public DescribePdnsThreatStatisticsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsThreatStatisticsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsThreatStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePdnsThreatStatisticsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePdnsThreatStatisticsResponseBodyData extends TeaModel {
        @NameInMap("DohTotalCount")
        public Long dohTotalCount;

        @NameInMap("DomainCount")
        public Long domainCount;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("LatestThreatTime")
        public Long latestThreatTime;

        @NameInMap("MaxThreatLevel")
        public String maxThreatLevel;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("ThreatLevel")
        public String threatLevel;

        @NameInMap("ThreatType")
        public String threatType;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UdpTotalCount")
        public Long udpTotalCount;

        public static DescribePdnsThreatStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsThreatStatisticsResponseBodyData self = new DescribePdnsThreatStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePdnsThreatStatisticsResponseBodyData setDohTotalCount(Long dohTotalCount) {
            this.dohTotalCount = dohTotalCount;
            return this;
        }
        public Long getDohTotalCount() {
            return this.dohTotalCount;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setLatestThreatTime(Long latestThreatTime) {
            this.latestThreatTime = latestThreatTime;
            return this;
        }
        public Long getLatestThreatTime() {
            return this.latestThreatTime;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setMaxThreatLevel(String maxThreatLevel) {
            this.maxThreatLevel = maxThreatLevel;
            return this;
        }
        public String getMaxThreatLevel() {
            return this.maxThreatLevel;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setThreatType(String threatType) {
            this.threatType = threatType;
            return this;
        }
        public String getThreatType() {
            return this.threatType;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribePdnsThreatStatisticsResponseBodyData setUdpTotalCount(Long udpTotalCount) {
            this.udpTotalCount = udpTotalCount;
            return this;
        }
        public Long getUdpTotalCount() {
            return this.udpTotalCount;
        }

    }

}
