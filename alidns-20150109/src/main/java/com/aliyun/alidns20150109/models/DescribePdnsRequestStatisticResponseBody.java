// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticResponseBody extends TeaModel {
    /**
     * <p>The statistics on the DNS requests.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribePdnsRequestStatisticResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePdnsRequestStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsRequestStatisticResponseBody self = new DescribePdnsRequestStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsRequestStatisticResponseBody setData(java.util.List<DescribePdnsRequestStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePdnsRequestStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribePdnsRequestStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePdnsRequestStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The total number of DoH requests, including HTTP and HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DohTotalCount")
        public Long dohTotalCount;

        /**
         * <p>The number of HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HttpCount")
        public Long httpCount;

        /**
         * <p>The number of HTTPS requests. On the Traffic Analysis tab of the Public DNS console, the value of this parameter includes the number of DNS over HTTPs (DoH) requests. Therefore, the number of DoH requests is not separately displayed in the console.</p>
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
         * <p>The statistical timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1706716800000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The total number of UDP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("UdpTotalCount")
        public Long udpTotalCount;

        /**
         * <p>The number of IPv4-based requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V4Count")
        public Long v4Count;

        /**
         * <p>The number of IPv4-based HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V4HttpCount")
        public Long v4HttpCount;

        /**
         * <p>The number of IPv4-based HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V4HttpsCount")
        public Long v4HttpsCount;

        /**
         * <p>The number of IPv6-based requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V6Count")
        public Long v6Count;

        /**
         * <p>The number of IPv6-based HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V6HttpCount")
        public Long v6HttpCount;

        /**
         * <p>The number of IPv6-based HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("V6HttpsCount")
        public Long v6HttpsCount;

        public static DescribePdnsRequestStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsRequestStatisticResponseBodyData self = new DescribePdnsRequestStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePdnsRequestStatisticResponseBodyData setDohTotalCount(Long dohTotalCount) {
            this.dohTotalCount = dohTotalCount;
            return this;
        }
        public Long getDohTotalCount() {
            return this.dohTotalCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setHttpCount(Long httpCount) {
            this.httpCount = httpCount;
            return this;
        }
        public Long getHttpCount() {
            return this.httpCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setHttpsCount(Long httpsCount) {
            this.httpsCount = httpsCount;
            return this;
        }
        public Long getHttpsCount() {
            return this.httpsCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setIpCount(Long ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Long getIpCount() {
            return this.ipCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribePdnsRequestStatisticResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setUdpTotalCount(Long udpTotalCount) {
            this.udpTotalCount = udpTotalCount;
            return this;
        }
        public Long getUdpTotalCount() {
            return this.udpTotalCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setV4Count(Long v4Count) {
            this.v4Count = v4Count;
            return this;
        }
        public Long getV4Count() {
            return this.v4Count;
        }

        public DescribePdnsRequestStatisticResponseBodyData setV4HttpCount(Long v4HttpCount) {
            this.v4HttpCount = v4HttpCount;
            return this;
        }
        public Long getV4HttpCount() {
            return this.v4HttpCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setV4HttpsCount(Long v4HttpsCount) {
            this.v4HttpsCount = v4HttpsCount;
            return this;
        }
        public Long getV4HttpsCount() {
            return this.v4HttpsCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setV6Count(Long v6Count) {
            this.v6Count = v6Count;
            return this;
        }
        public Long getV6Count() {
            return this.v6Count;
        }

        public DescribePdnsRequestStatisticResponseBodyData setV6HttpCount(Long v6HttpCount) {
            this.v6HttpCount = v6HttpCount;
            return this;
        }
        public Long getV6HttpCount() {
            return this.v6HttpCount;
        }

        public DescribePdnsRequestStatisticResponseBodyData setV6HttpsCount(Long v6HttpsCount) {
            this.v6HttpsCount = v6HttpsCount;
            return this;
        }
        public Long getV6HttpsCount() {
            return this.v6HttpsCount;
        }

    }

}
