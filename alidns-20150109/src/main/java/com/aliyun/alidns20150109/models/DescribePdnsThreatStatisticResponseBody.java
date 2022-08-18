// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePdnsThreatStatisticResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePdnsThreatStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatStatisticResponseBody self = new DescribePdnsThreatStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatStatisticResponseBody setData(java.util.List<DescribePdnsThreatStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePdnsThreatStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribePdnsThreatStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePdnsThreatStatisticResponseBodyData extends TeaModel {
        @NameInMap("DohTotalCount")
        public Long dohTotalCount;

        @NameInMap("ThreatLevel")
        public String threatLevel;

        @NameInMap("ThreatType")
        public String threatType;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UdpTotalCount")
        public Long udpTotalCount;

        public static DescribePdnsThreatStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsThreatStatisticResponseBodyData self = new DescribePdnsThreatStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePdnsThreatStatisticResponseBodyData setDohTotalCount(Long dohTotalCount) {
            this.dohTotalCount = dohTotalCount;
            return this;
        }
        public Long getDohTotalCount() {
            return this.dohTotalCount;
        }

        public DescribePdnsThreatStatisticResponseBodyData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribePdnsThreatStatisticResponseBodyData setThreatType(String threatType) {
            this.threatType = threatType;
            return this;
        }
        public String getThreatType() {
            return this.threatType;
        }

        public DescribePdnsThreatStatisticResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribePdnsThreatStatisticResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribePdnsThreatStatisticResponseBodyData setUdpTotalCount(Long udpTotalCount) {
            this.udpTotalCount = udpTotalCount;
            return this;
        }
        public Long getUdpTotalCount() {
            return this.udpTotalCount;
        }

    }

}
