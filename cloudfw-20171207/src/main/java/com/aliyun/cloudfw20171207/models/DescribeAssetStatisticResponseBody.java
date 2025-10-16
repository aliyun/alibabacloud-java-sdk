// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetStatisticResponseBody extends TeaModel {
    @NameInMap("GeneralInstanceSpecStatistic")
    public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic generalInstanceSpecStatistic;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84******25g4d2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on specifications.</p>
     */
    @NameInMap("ResourceSpecStatistic")
    public DescribeAssetStatisticResponseBodyResourceSpecStatistic resourceSpecStatistic;

    public static DescribeAssetStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetStatisticResponseBody self = new DescribeAssetStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetStatisticResponseBody setGeneralInstanceSpecStatistic(DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic generalInstanceSpecStatistic) {
        this.generalInstanceSpecStatistic = generalInstanceSpecStatistic;
        return this;
    }
    public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic getGeneralInstanceSpecStatistic() {
        return this.generalInstanceSpecStatistic;
    }

    public DescribeAssetStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetStatisticResponseBody setResourceSpecStatistic(DescribeAssetStatisticResponseBodyResourceSpecStatistic resourceSpecStatistic) {
        this.resourceSpecStatistic = resourceSpecStatistic;
        return this;
    }
    public DescribeAssetStatisticResponseBodyResourceSpecStatistic getResourceSpecStatistic() {
        return this.resourceSpecStatistic;
    }

    public static class DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic extends TeaModel {
        @NameInMap("MemberList")
        public java.util.List<String> memberList;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic self = new DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic setMemberList(java.util.List<String> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic extends TeaModel {
        @NameInMap("CfwGeneralInstanceRegionStatistic")
        public java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic> cfwGeneralInstanceRegionStatistic;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCfwGeneralInstanceCnt")
        public Integer totalCfwGeneralInstanceCnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCfwGeneralInstanceUsedCnt")
        public Integer totalCfwGeneralInstanceUsedCnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalGeneralInstanceUsedCnt")
        public Integer totalGeneralInstanceUsedCnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNatGeneralInstanceCnt")
        public Integer totalNatGeneralInstanceCnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNatGeneralInstanceUsedCnt")
        public Integer totalNatGeneralInstanceUsedCnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalVfwGeneralInstanceUsedCnt")
        public Integer totalVfwGeneralInstanceUsedCnt;

        public static DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic self = new DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setCfwGeneralInstanceRegionStatistic(java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic> cfwGeneralInstanceRegionStatistic) {
            this.cfwGeneralInstanceRegionStatistic = cfwGeneralInstanceRegionStatistic;
            return this;
        }
        public java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic> getCfwGeneralInstanceRegionStatistic() {
            return this.cfwGeneralInstanceRegionStatistic;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setTotalCfwGeneralInstanceCnt(Integer totalCfwGeneralInstanceCnt) {
            this.totalCfwGeneralInstanceCnt = totalCfwGeneralInstanceCnt;
            return this;
        }
        public Integer getTotalCfwGeneralInstanceCnt() {
            return this.totalCfwGeneralInstanceCnt;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setTotalCfwGeneralInstanceUsedCnt(Integer totalCfwGeneralInstanceUsedCnt) {
            this.totalCfwGeneralInstanceUsedCnt = totalCfwGeneralInstanceUsedCnt;
            return this;
        }
        public Integer getTotalCfwGeneralInstanceUsedCnt() {
            return this.totalCfwGeneralInstanceUsedCnt;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setTotalGeneralInstanceUsedCnt(Integer totalGeneralInstanceUsedCnt) {
            this.totalGeneralInstanceUsedCnt = totalGeneralInstanceUsedCnt;
            return this;
        }
        public Integer getTotalGeneralInstanceUsedCnt() {
            return this.totalGeneralInstanceUsedCnt;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setTotalNatGeneralInstanceCnt(Integer totalNatGeneralInstanceCnt) {
            this.totalNatGeneralInstanceCnt = totalNatGeneralInstanceCnt;
            return this;
        }
        public Integer getTotalNatGeneralInstanceCnt() {
            return this.totalNatGeneralInstanceCnt;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setTotalNatGeneralInstanceUsedCnt(Integer totalNatGeneralInstanceUsedCnt) {
            this.totalNatGeneralInstanceUsedCnt = totalNatGeneralInstanceUsedCnt;
            return this;
        }
        public Integer getTotalNatGeneralInstanceUsedCnt() {
            return this.totalNatGeneralInstanceUsedCnt;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setTotalVfwGeneralInstanceUsedCnt(Integer totalVfwGeneralInstanceUsedCnt) {
            this.totalVfwGeneralInstanceUsedCnt = totalVfwGeneralInstanceUsedCnt;
            return this;
        }
        public Integer getTotalVfwGeneralInstanceUsedCnt() {
            return this.totalVfwGeneralInstanceUsedCnt;
        }

    }

    public static class DescribeAssetStatisticResponseBodyResourceSpecStatistic extends TeaModel {
        /**
         * <p>The number of public IP addresses that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IpNumSpec")
        public Integer ipNumSpec;

        /**
         * <p>The number of public IP addresses that are protected.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpNumUsed")
        public Integer ipNumUsed;

        /**
         * <p>The number of public IP addresses that can enable data leakage detection.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SensitiveDataIpNumSpec")
        public Long sensitiveDataIpNumSpec;

        /**
         * <p>The number of public IP addresses that enabled data leakage detection.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SensitiveDataIpNumUsed")
        public Long sensitiveDataIpNumUsed;

        public static DescribeAssetStatisticResponseBodyResourceSpecStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetStatisticResponseBodyResourceSpecStatistic self = new DescribeAssetStatisticResponseBodyResourceSpecStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIpNumSpec(Integer ipNumSpec) {
            this.ipNumSpec = ipNumSpec;
            return this;
        }
        public Integer getIpNumSpec() {
            return this.ipNumSpec;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIpNumUsed(Integer ipNumUsed) {
            this.ipNumUsed = ipNumUsed;
            return this;
        }
        public Integer getIpNumUsed() {
            return this.ipNumUsed;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setSensitiveDataIpNumSpec(Long sensitiveDataIpNumSpec) {
            this.sensitiveDataIpNumSpec = sensitiveDataIpNumSpec;
            return this;
        }
        public Long getSensitiveDataIpNumSpec() {
            return this.sensitiveDataIpNumSpec;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setSensitiveDataIpNumUsed(Long sensitiveDataIpNumUsed) {
            this.sensitiveDataIpNumUsed = sensitiveDataIpNumUsed;
            return this;
        }
        public Long getSensitiveDataIpNumUsed() {
            return this.sensitiveDataIpNumUsed;
        }

    }

}
