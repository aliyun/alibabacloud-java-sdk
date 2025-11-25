// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAssetListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallAssetListResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>924A6CCC-4EAD-5554-8AD0-45F5ED56****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallAssetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAssetListResponseBody self = new DescribeVpcFirewallAssetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAssetListResponseBody setDataList(java.util.List<DescribeVpcFirewallAssetListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallAssetListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallAssetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallAssetListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallAssetListResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("AssetIP")
        public String assetIP;

        /**
         * <strong>example:</strong>
         * <p>i-hp3ez3rs9bxwt034****</p>
         */
        @NameInMap("AssetInstanceId")
        public String assetInstanceId;

        /**
         * <strong>example:</strong>
         * <p>ecs-test</p>
         */
        @NameInMap("AssetInstanceName")
        public String assetInstanceName;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpsHitCnt")
        public Long ipsHitCnt;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        @NameInMap("PortList")
        public java.util.List<String> portList;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RiskReason")
        public String riskReason;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        public static DescribeVpcFirewallAssetListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallAssetListResponseBodyDataList self = new DescribeVpcFirewallAssetListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setAssetIP(String assetIP) {
            this.assetIP = assetIP;
            return this;
        }
        public String getAssetIP() {
            return this.assetIP;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setAssetInstanceId(String assetInstanceId) {
            this.assetInstanceId = assetInstanceId;
            return this;
        }
        public String getAssetInstanceId() {
            return this.assetInstanceId;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setAssetInstanceName(String assetInstanceName) {
            this.assetInstanceName = assetInstanceName;
            return this;
        }
        public String getAssetInstanceName() {
            return this.assetInstanceName;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setIpsHitCnt(Long ipsHitCnt) {
            this.ipsHitCnt = ipsHitCnt;
            return this;
        }
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setPortList(java.util.List<String> portList) {
            this.portList = portList;
            return this;
        }
        public java.util.List<String> getPortList() {
            return this.portList;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setRiskReason(String riskReason) {
            this.riskReason = riskReason;
            return this;
        }
        public String getRiskReason() {
            return this.riskReason;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeVpcFirewallAssetListResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

    }

}
