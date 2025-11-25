// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskTrendResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeOutgoingRiskTrendResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>1CA8D98E-A71B-5856-A658-3E8B3152E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalRiskDomain")
    public Integer totalRiskDomain;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalRiskIp")
    public Integer totalRiskIp;

    public static DescribeOutgoingRiskTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingRiskTrendResponseBody self = new DescribeOutgoingRiskTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingRiskTrendResponseBody setDataList(java.util.List<DescribeOutgoingRiskTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeOutgoingRiskTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeOutgoingRiskTrendResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeOutgoingRiskTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingRiskTrendResponseBody setTotalRiskDomain(Integer totalRiskDomain) {
        this.totalRiskDomain = totalRiskDomain;
        return this;
    }
    public Integer getTotalRiskDomain() {
        return this.totalRiskDomain;
    }

    public DescribeOutgoingRiskTrendResponseBody setTotalRiskIp(Integer totalRiskIp) {
        this.totalRiskIp = totalRiskIp;
        return this;
    }
    public Integer getTotalRiskIp() {
        return this.totalRiskIp;
    }

    public static class DescribeOutgoingRiskTrendResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RiskDomain")
        public Integer riskDomain;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RiskIp")
        public Integer riskIp;

        /**
         * <strong>example:</strong>
         * <p>1659405600</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeOutgoingRiskTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingRiskTrendResponseBodyDataList self = new DescribeOutgoingRiskTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingRiskTrendResponseBodyDataList setRiskDomain(Integer riskDomain) {
            this.riskDomain = riskDomain;
            return this;
        }
        public Integer getRiskDomain() {
            return this.riskDomain;
        }

        public DescribeOutgoingRiskTrendResponseBodyDataList setRiskIp(Integer riskIp) {
            this.riskIp = riskIp;
            return this;
        }
        public Integer getRiskIp() {
            return this.riskIp;
        }

        public DescribeOutgoingRiskTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
