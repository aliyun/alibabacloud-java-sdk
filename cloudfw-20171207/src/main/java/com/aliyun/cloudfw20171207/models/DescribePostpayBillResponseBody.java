// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayBillResponseBody extends TeaModel {
    /**
     * <p>The aggregated Internet traffic, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AggregateInternetTraffic")
    public Float aggregateInternetTraffic;

    /**
     * <p>The aggregated NAT traffic, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AggregateNatTraffic")
    public Float aggregateNatTraffic;

    /**
     * <p>The aggregated sensitive data detection traffic, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AggregateSdlTraffic")
    public Float aggregateSdlTraffic;

    /**
     * <p>The aggregated total traffic, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("AggregateTotalTraffic")
    public Float aggregateTotalTraffic;

    /**
     * <p>The aggregated VPC traffic, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AggregateVpcTraffic")
    public Float aggregateVpcTraffic;

    /**
     * <p>The bill list.</p>
     */
    @NameInMap("BillList")
    public java.util.List<DescribePostpayBillResponseBodyBillList> billList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>133173B9-8010-5DF5-8B93-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePostpayBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayBillResponseBody self = new DescribePostpayBillResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayBillResponseBody setAggregateInternetTraffic(Float aggregateInternetTraffic) {
        this.aggregateInternetTraffic = aggregateInternetTraffic;
        return this;
    }
    public Float getAggregateInternetTraffic() {
        return this.aggregateInternetTraffic;
    }

    public DescribePostpayBillResponseBody setAggregateNatTraffic(Float aggregateNatTraffic) {
        this.aggregateNatTraffic = aggregateNatTraffic;
        return this;
    }
    public Float getAggregateNatTraffic() {
        return this.aggregateNatTraffic;
    }

    public DescribePostpayBillResponseBody setAggregateSdlTraffic(Float aggregateSdlTraffic) {
        this.aggregateSdlTraffic = aggregateSdlTraffic;
        return this;
    }
    public Float getAggregateSdlTraffic() {
        return this.aggregateSdlTraffic;
    }

    public DescribePostpayBillResponseBody setAggregateTotalTraffic(Float aggregateTotalTraffic) {
        this.aggregateTotalTraffic = aggregateTotalTraffic;
        return this;
    }
    public Float getAggregateTotalTraffic() {
        return this.aggregateTotalTraffic;
    }

    public DescribePostpayBillResponseBody setAggregateVpcTraffic(Float aggregateVpcTraffic) {
        this.aggregateVpcTraffic = aggregateVpcTraffic;
        return this;
    }
    public Float getAggregateVpcTraffic() {
        return this.aggregateVpcTraffic;
    }

    public DescribePostpayBillResponseBody setBillList(java.util.List<DescribePostpayBillResponseBodyBillList> billList) {
        this.billList = billList;
        return this;
    }
    public java.util.List<DescribePostpayBillResponseBodyBillList> getBillList() {
        return this.billList;
    }

    public DescribePostpayBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostpayBillResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePostpayBillResponseBodyBillList extends TeaModel {
        /**
         * <p>The end time, expressed as a UNIX timestamp in seconds. The value is on the hour or on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>1733710015</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of Internet instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InternetInstanceCnt")
        public Long internetInstanceCnt;

        /**
         * <p>The Internet traffic, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetTraffic")
        public Float internetTraffic;

        /**
         * <p>Indicates whether a deduction is applied. A value of 0 indicates that no deduction is applied. Any value greater than 0 indicates that a deduction is applied. If a deduction is applied, the bill is not generated.</p>
         * <blockquote>
         * <p>This field is meaningful only when you query data at the hourly level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDerated")
        public Integer isDerated;

        /**
         * <p>The log service usage duration, in TB × hours.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("LogStorage")
        public Long logStorage;

        /**
         * <p>The number of NAT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NatInstanceCnt")
        public Long natInstanceCnt;

        /**
         * <p>The NAT traffic, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NatTraffic")
        public Float natTraffic;

        /**
         * <p>The sensitive data leak detection usage duration, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sdl")
        public Long sdl;

        /**
         * <p>The sensitive data detection traffic, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SdlTraffic")
        public Float sdlTraffic;

        /**
         * <p>The start time, expressed as a UNIX timestamp in seconds. The value is on the hour or on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>1710206070000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The threat intelligence usage duration, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ThreatIntelligence")
        public Long threatIntelligence;

        /**
         * <p>The number of VPC instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VpcInstanceCnt")
        public Long vpcInstanceCnt;

        /**
         * <p>The VPC traffic, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("VpcTraffic")
        public Float vpcTraffic;

        public static DescribePostpayBillResponseBodyBillList build(java.util.Map<String, ?> map) throws Exception {
            DescribePostpayBillResponseBodyBillList self = new DescribePostpayBillResponseBodyBillList();
            return TeaModel.build(map, self);
        }

        public DescribePostpayBillResponseBodyBillList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePostpayBillResponseBodyBillList setInternetInstanceCnt(Long internetInstanceCnt) {
            this.internetInstanceCnt = internetInstanceCnt;
            return this;
        }
        public Long getInternetInstanceCnt() {
            return this.internetInstanceCnt;
        }

        public DescribePostpayBillResponseBodyBillList setInternetTraffic(Float internetTraffic) {
            this.internetTraffic = internetTraffic;
            return this;
        }
        public Float getInternetTraffic() {
            return this.internetTraffic;
        }

        public DescribePostpayBillResponseBodyBillList setIsDerated(Integer isDerated) {
            this.isDerated = isDerated;
            return this;
        }
        public Integer getIsDerated() {
            return this.isDerated;
        }

        public DescribePostpayBillResponseBodyBillList setLogStorage(Long logStorage) {
            this.logStorage = logStorage;
            return this;
        }
        public Long getLogStorage() {
            return this.logStorage;
        }

        public DescribePostpayBillResponseBodyBillList setNatInstanceCnt(Long natInstanceCnt) {
            this.natInstanceCnt = natInstanceCnt;
            return this;
        }
        public Long getNatInstanceCnt() {
            return this.natInstanceCnt;
        }

        public DescribePostpayBillResponseBodyBillList setNatTraffic(Float natTraffic) {
            this.natTraffic = natTraffic;
            return this;
        }
        public Float getNatTraffic() {
            return this.natTraffic;
        }

        public DescribePostpayBillResponseBodyBillList setSdl(Long sdl) {
            this.sdl = sdl;
            return this;
        }
        public Long getSdl() {
            return this.sdl;
        }

        public DescribePostpayBillResponseBodyBillList setSdlTraffic(Float sdlTraffic) {
            this.sdlTraffic = sdlTraffic;
            return this;
        }
        public Float getSdlTraffic() {
            return this.sdlTraffic;
        }

        public DescribePostpayBillResponseBodyBillList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePostpayBillResponseBodyBillList setThreatIntelligence(Long threatIntelligence) {
            this.threatIntelligence = threatIntelligence;
            return this;
        }
        public Long getThreatIntelligence() {
            return this.threatIntelligence;
        }

        public DescribePostpayBillResponseBodyBillList setVpcInstanceCnt(Long vpcInstanceCnt) {
            this.vpcInstanceCnt = vpcInstanceCnt;
            return this;
        }
        public Long getVpcInstanceCnt() {
            return this.vpcInstanceCnt;
        }

        public DescribePostpayBillResponseBodyBillList setVpcTraffic(Float vpcTraffic) {
            this.vpcTraffic = vpcTraffic;
            return this;
        }
        public Float getVpcTraffic() {
            return this.vpcTraffic;
        }

    }

}
