// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetStatisticResponseBody extends TeaModel {
    /**
     * <p>Whether automatic traffic diversion is enabled. Valid values:- <strong>true</strong>: enabled- <strong>false</strong>: disabled</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoResourceEnable")
    public Boolean autoResourceEnable;

    /**
     * <p>Specifications for general instances in version 2.0.</p>
     */
    @NameInMap("GeneralInstanceSpecStatistic")
    public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic generalInstanceSpecStatistic;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84******25g4d2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Resource specification usage statistics.</p>
     */
    @NameInMap("ResourceSpecStatistic")
    public DescribeAssetStatisticResponseBodyResourceSpecStatistic resourceSpecStatistic;

    public static DescribeAssetStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetStatisticResponseBody self = new DescribeAssetStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetStatisticResponseBody setAutoResourceEnable(Boolean autoResourceEnable) {
        this.autoResourceEnable = autoResourceEnable;
        return this;
    }
    public Boolean getAutoResourceEnable() {
        return this.autoResourceEnable;
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
        /**
         * <p>List of member accounts in the region.</p>
         */
        @NameInMap("MemberList")
        public java.util.List<String> memberList;

        /**
         * <p>Region information</p>
         * 
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

    public static class DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic extends TeaModel {
        /**
         * <p>List of member accounts in the region.</p>
         */
        @NameInMap("MemberList")
        public java.util.List<String> memberList;

        /**
         * <p>Region information</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic self = new DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic setMemberList(java.util.List<String> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic extends TeaModel {
        /**
         * <p>Internet-facing firewall instance usage by region.</p>
         */
        @NameInMap("CfwGeneralInstanceRegionStatistic")
        public java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwGeneralInstanceRegionStatistic> cfwGeneralInstanceRegionStatistic;

        /**
         * <p>Total Internet-facing firewall instances by region.</p>
         */
        @NameInMap("CfwTotalGeneralInstanceRegionStatistic")
        public java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic> cfwTotalGeneralInstanceRegionStatistic;

        /**
         * <p>Total number of Internet-facing firewall instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCfwGeneralInstanceCnt")
        public Integer totalCfwGeneralInstanceCnt;

        /**
         * <p>Number of Internet-facing firewall instances with protection enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCfwGeneralInstanceUsedCnt")
        public Integer totalCfwGeneralInstanceUsedCnt;

        /**
         * <p>Total number of general instances used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalGeneralInstanceUsedCnt")
        public Integer totalGeneralInstanceUsedCnt;

        /**
         * <p>Total number of NAT firewall instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNatGeneralInstanceCnt")
        public Integer totalNatGeneralInstanceCnt;

        /**
         * <p>Number of NAT firewall instances with protection enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNatGeneralInstanceUsedCnt")
        public Integer totalNatGeneralInstanceUsedCnt;

        /**
         * <p>Number of VPC firewall instances with protection enabled.</p>
         * 
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

        public DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatistic setCfwTotalGeneralInstanceRegionStatistic(java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic> cfwTotalGeneralInstanceRegionStatistic) {
            this.cfwTotalGeneralInstanceRegionStatistic = cfwTotalGeneralInstanceRegionStatistic;
            return this;
        }
        public java.util.List<DescribeAssetStatisticResponseBodyGeneralInstanceSpecStatisticCfwTotalGeneralInstanceRegionStatistic> getCfwTotalGeneralInstanceRegionStatistic() {
            return this.cfwTotalGeneralInstanceRegionStatistic;
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
         * <p>Maximum number of public IP addresses that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IpNumSpec")
        public Integer ipNumSpec;

        /**
         * <p>Number of public IP addresses with protection enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpNumUsed")
        public Integer ipNumUsed;

        /**
         * <p>The number of IP specifications for sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SensitiveDataIpNumSpec")
        public Long sensitiveDataIpNumSpec;

        /**
         * <p>Number of public IP addresses currently scanned for sensitive data.</p>
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
