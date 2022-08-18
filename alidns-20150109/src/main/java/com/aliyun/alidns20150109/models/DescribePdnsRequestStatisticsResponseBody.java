// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePdnsRequestStatisticsResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePdnsRequestStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsRequestStatisticsResponseBody self = new DescribePdnsRequestStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsRequestStatisticsResponseBody setData(java.util.List<DescribePdnsRequestStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePdnsRequestStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public DescribePdnsRequestStatisticsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsRequestStatisticsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsRequestStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePdnsRequestStatisticsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePdnsRequestStatisticsResponseBodyDataThreatInfo extends TeaModel {
        @NameInMap("ThreatLevel")
        public String threatLevel;

        @NameInMap("ThreatType")
        public String threatType;

        public static DescribePdnsRequestStatisticsResponseBodyDataThreatInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsRequestStatisticsResponseBodyDataThreatInfo self = new DescribePdnsRequestStatisticsResponseBodyDataThreatInfo();
            return TeaModel.build(map, self);
        }

        public DescribePdnsRequestStatisticsResponseBodyDataThreatInfo setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribePdnsRequestStatisticsResponseBodyDataThreatInfo setThreatType(String threatType) {
            this.threatType = threatType;
            return this;
        }
        public String getThreatType() {
            return this.threatType;
        }

    }

    public static class DescribePdnsRequestStatisticsResponseBodyData extends TeaModel {
        @NameInMap("DohTotalCount")
        public Long dohTotalCount;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("HttpCount")
        public Long httpCount;

        @NameInMap("HttpsCount")
        public Long httpsCount;

        @NameInMap("IpCount")
        public Long ipCount;

        @NameInMap("MaxThreatLevel")
        public String maxThreatLevel;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("ThreatCount")
        public Long threatCount;

        @NameInMap("ThreatInfo")
        public java.util.List<DescribePdnsRequestStatisticsResponseBodyDataThreatInfo> threatInfo;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UdpTotalCount")
        public Long udpTotalCount;

        @NameInMap("V4Count")
        public Long v4Count;

        @NameInMap("V4HttpCount")
        public Long v4HttpCount;

        @NameInMap("V4HttpsCount")
        public Long v4HttpsCount;

        @NameInMap("V6Count")
        public Long v6Count;

        @NameInMap("V6HttpCount")
        public Long v6HttpCount;

        @NameInMap("V6HttpsCount")
        public Long v6HttpsCount;

        public static DescribePdnsRequestStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsRequestStatisticsResponseBodyData self = new DescribePdnsRequestStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePdnsRequestStatisticsResponseBodyData setDohTotalCount(Long dohTotalCount) {
            this.dohTotalCount = dohTotalCount;
            return this;
        }
        public Long getDohTotalCount() {
            return this.dohTotalCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setHttpCount(Long httpCount) {
            this.httpCount = httpCount;
            return this;
        }
        public Long getHttpCount() {
            return this.httpCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setHttpsCount(Long httpsCount) {
            this.httpsCount = httpsCount;
            return this;
        }
        public Long getHttpsCount() {
            return this.httpsCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setIpCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Long getIpCount() {
            return this.ipCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setMaxThreatLevel(String maxThreatLevel) {
            this.maxThreatLevel = maxThreatLevel;
            return this;
        }
        public String getMaxThreatLevel() {
            return this.maxThreatLevel;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setThreatCount(Long threatCount) {
            this.threatCount = threatCount;
            return this;
        }
        public Long getThreatCount() {
            return this.threatCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setThreatInfo(java.util.List<DescribePdnsRequestStatisticsResponseBodyDataThreatInfo> threatInfo) {
            this.threatInfo = threatInfo;
            return this;
        }
        public java.util.List<DescribePdnsRequestStatisticsResponseBodyDataThreatInfo> getThreatInfo() {
            return this.threatInfo;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setUdpTotalCount(Long udpTotalCount) {
            this.udpTotalCount = udpTotalCount;
            return this;
        }
        public Long getUdpTotalCount() {
            return this.udpTotalCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setV4Count(Long v4Count) {
            this.v4Count = v4Count;
            return this;
        }
        public Long getV4Count() {
            return this.v4Count;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setV6Count(Long v6Count) {
            this.v6Count = v6Count;
            return this;
        }
        public Long getV6Count() {
            return this.v6Count;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribePdnsRequestStatisticsResponseBodyData setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

    }

}
