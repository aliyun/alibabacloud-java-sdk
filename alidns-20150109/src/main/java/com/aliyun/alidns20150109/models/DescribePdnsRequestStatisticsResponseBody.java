// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticsResponseBody extends TeaModel {
    /**
     * <p>The list of request statistics.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribePdnsRequestStatisticsResponseBodyData> data;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page. The maximum value is <strong>100</strong>. The default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
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
        /**
         * <p>This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        /**
         * <p>This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
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
        /**
         * <p>The total number of DoH requests. This includes the total number of HTTP and HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DohTotalCount")
        public Long dohTotalCount;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The number of HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpCount")
        public Long httpCount;

        /**
         * <p>The number of HTTPS requests. On the Traffic Analysis tab of the Public DNS console, this parameter includes the number of DNS over HTTPS (DoH) requests. Therefore, the number of DoH requests is not separately displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpsCount")
        public Long httpsCount;

        /**
         * <p>The number of source IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpCount")
        public Long ipCount;

        /**
         * <p>This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxThreatLevel")
        public String maxThreatLevel;

        /**
         * <p>The subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        /**
         * <p>This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ThreatCount")
        public Long threatCount;

        /**
         * <p>This parameter is not supported in the current version.</p>
         */
        @NameInMap("ThreatInfo")
        public java.util.List<DescribePdnsRequestStatisticsResponseBodyDataThreatInfo> threatInfo;

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The total number of UDP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("UdpTotalCount")
        public Long udpTotalCount;

        /**
         * <p>The number of IPv4 requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V4Count")
        public Long v4Count;

        /**
         * <p>The number of IPv4 HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V4HttpCount")
        public Long v4HttpCount;

        /**
         * <p>The number of IPv4 HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V4HttpsCount")
        public Long v4HttpsCount;

        /**
         * <p>The number of IPv6 requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V6Count")
        public Long v6Count;

        /**
         * <p>The number of IPv6 HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V6HttpCount")
        public Long v6HttpCount;

        /**
         * <p>The number of IPv6 HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
