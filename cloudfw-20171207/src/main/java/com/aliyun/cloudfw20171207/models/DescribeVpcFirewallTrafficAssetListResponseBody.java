// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallTrafficAssetListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallTrafficAssetListResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>C5BE1AA4-934A-5085-89CC-9AD1CAC3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallTrafficAssetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallTrafficAssetListResponseBody self = new DescribeVpcFirewallTrafficAssetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallTrafficAssetListResponseBody setDataList(java.util.List<DescribeVpcFirewallTrafficAssetListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallTrafficAssetListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallTrafficAssetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallTrafficAssetListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallTrafficAssetListResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a.com</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpsHitCnt")
        public Long ipsHitCnt;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>253023143</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        /**
         * <strong>example:</strong>
         * <p>a.com</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1mos0vhefmx5ah6****</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallTrafficAssetListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallTrafficAssetListResponseBodyDataList self = new DescribeVpcFirewallTrafficAssetListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallTrafficAssetListResponseBodyDataList setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeVpcFirewallTrafficAssetListResponseBodyDataList setIpsHitCnt(Long ipsHitCnt) {
            this.ipsHitCnt = ipsHitCnt;
            return this;
        }
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        public DescribeVpcFirewallTrafficAssetListResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeVpcFirewallTrafficAssetListResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeVpcFirewallTrafficAssetListResponseBodyDataList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallTrafficAssetListResponseBodyDataList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
