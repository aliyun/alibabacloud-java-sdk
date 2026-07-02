// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrepayBillTotalResponseBody extends TeaModel {
    /**
     * <p>The bill list, aggregated by day.</p>
     */
    @NameInMap("BillList")
    public java.util.List<DescribePrepayBillTotalResponseBodyBillList> billList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>450D47F5-956E-543E-8502-***********</p>
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

    public static DescribePrepayBillTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrepayBillTotalResponseBody self = new DescribePrepayBillTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrepayBillTotalResponseBody setBillList(java.util.List<DescribePrepayBillTotalResponseBodyBillList> billList) {
        this.billList = billList;
        return this;
    }
    public java.util.List<DescribePrepayBillTotalResponseBodyBillList> getBillList() {
        return this.billList;
    }

    public DescribePrepayBillTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrepayBillTotalResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePrepayBillTotalResponseBodyBillList extends TeaModel {
        /**
         * <p>The actual billed traffic for sensitive data leak detection.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BilledDetectionTraffic")
        public Float billedDetectionTraffic;

        /**
         * <p>The sensitive data detection traffic for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DailyDetectionTraffic")
        public Float dailyDetectionTraffic;

        /**
         * <p>The total elastic traffic for the day. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DailyOverflowTraffic")
        public Float dailyOverflowTraffic;

        /**
         * <p>The default bandwidth of the edition. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DefaultBandwidth")
        public Long defaultBandwidth;

        /**
         * <p>The elastic bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ElasticBandwidth")
        public Long elasticBandwidth;

        /**
         * <p>The end time of the day. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761667200</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The extended bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ExtensionBandwidth")
        public Long extensionBandwidth;

        /**
         * <p>The Internet traffic bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetTrafficBandwidth")
        public Float internetTrafficBandwidth;

        /**
         * <p>The monthly free traffic quota for sensitive data detection. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonthlyRemainingFreeTraffic")
        public Float monthlyRemainingFreeTraffic;

        /**
         * <p>The NAT traffic bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NatTrafficBandwidth")
        public Float natTrafficBandwidth;

        /**
         * <p>The timestamp when the maximum combined bandwidth (Internet + VPC + NAT) occurred on that day.</p>
         * 
         * <strong>example:</strong>
         * <p>1761588300</p>
         */
        @NameInMap("OverflowTime")
        public Long overflowTime;

        /**
         * <p>The start time of the day. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761580800</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The temporary upgrade bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TemporaryBandwidth")
        public Long temporaryBandwidth;

        /**
         * <p>The VPC traffic bandwidth. Unit: Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VpcTrafficBandwidth")
        public Float vpcTrafficBandwidth;

        public static DescribePrepayBillTotalResponseBodyBillList build(java.util.Map<String, ?> map) throws Exception {
            DescribePrepayBillTotalResponseBodyBillList self = new DescribePrepayBillTotalResponseBodyBillList();
            return TeaModel.build(map, self);
        }

        public DescribePrepayBillTotalResponseBodyBillList setBilledDetectionTraffic(Float billedDetectionTraffic) {
            this.billedDetectionTraffic = billedDetectionTraffic;
            return this;
        }
        public Float getBilledDetectionTraffic() {
            return this.billedDetectionTraffic;
        }

        public DescribePrepayBillTotalResponseBodyBillList setDailyDetectionTraffic(Float dailyDetectionTraffic) {
            this.dailyDetectionTraffic = dailyDetectionTraffic;
            return this;
        }
        public Float getDailyDetectionTraffic() {
            return this.dailyDetectionTraffic;
        }

        public DescribePrepayBillTotalResponseBodyBillList setDailyOverflowTraffic(Float dailyOverflowTraffic) {
            this.dailyOverflowTraffic = dailyOverflowTraffic;
            return this;
        }
        public Float getDailyOverflowTraffic() {
            return this.dailyOverflowTraffic;
        }

        public DescribePrepayBillTotalResponseBodyBillList setDefaultBandwidth(Long defaultBandwidth) {
            this.defaultBandwidth = defaultBandwidth;
            return this;
        }
        public Long getDefaultBandwidth() {
            return this.defaultBandwidth;
        }

        public DescribePrepayBillTotalResponseBodyBillList setElasticBandwidth(Long elasticBandwidth) {
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }
        public Long getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        public DescribePrepayBillTotalResponseBodyBillList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePrepayBillTotalResponseBodyBillList setExtensionBandwidth(Long extensionBandwidth) {
            this.extensionBandwidth = extensionBandwidth;
            return this;
        }
        public Long getExtensionBandwidth() {
            return this.extensionBandwidth;
        }

        public DescribePrepayBillTotalResponseBodyBillList setInternetTrafficBandwidth(Float internetTrafficBandwidth) {
            this.internetTrafficBandwidth = internetTrafficBandwidth;
            return this;
        }
        public Float getInternetTrafficBandwidth() {
            return this.internetTrafficBandwidth;
        }

        public DescribePrepayBillTotalResponseBodyBillList setMonthlyRemainingFreeTraffic(Float monthlyRemainingFreeTraffic) {
            this.monthlyRemainingFreeTraffic = monthlyRemainingFreeTraffic;
            return this;
        }
        public Float getMonthlyRemainingFreeTraffic() {
            return this.monthlyRemainingFreeTraffic;
        }

        public DescribePrepayBillTotalResponseBodyBillList setNatTrafficBandwidth(Float natTrafficBandwidth) {
            this.natTrafficBandwidth = natTrafficBandwidth;
            return this;
        }
        public Float getNatTrafficBandwidth() {
            return this.natTrafficBandwidth;
        }

        public DescribePrepayBillTotalResponseBodyBillList setOverflowTime(Long overflowTime) {
            this.overflowTime = overflowTime;
            return this;
        }
        public Long getOverflowTime() {
            return this.overflowTime;
        }

        public DescribePrepayBillTotalResponseBodyBillList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePrepayBillTotalResponseBodyBillList setTemporaryBandwidth(Long temporaryBandwidth) {
            this.temporaryBandwidth = temporaryBandwidth;
            return this;
        }
        public Long getTemporaryBandwidth() {
            return this.temporaryBandwidth;
        }

        public DescribePrepayBillTotalResponseBodyBillList setVpcTrafficBandwidth(Float vpcTrafficBandwidth) {
            this.vpcTrafficBandwidth = vpcTrafficBandwidth;
            return this;
        }
        public Float getVpcTrafficBandwidth() {
            return this.vpcTrafficBandwidth;
        }

    }

}
