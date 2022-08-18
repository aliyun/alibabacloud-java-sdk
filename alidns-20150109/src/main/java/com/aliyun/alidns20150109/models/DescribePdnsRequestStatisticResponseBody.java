// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsRequestStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePdnsRequestStatisticResponseBodyData> data;

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
        @NameInMap("DohTotalCount")
        public Long dohTotalCount;

        @NameInMap("HttpCount")
        public Long httpCount;

        @NameInMap("HttpsCount")
        public Long httpsCount;

        @NameInMap("IpCount")
        public Long ipCount;

        @NameInMap("Timestamp")
        public Long timestamp;

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
