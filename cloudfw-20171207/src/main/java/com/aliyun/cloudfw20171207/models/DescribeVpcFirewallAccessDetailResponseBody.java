// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAccessDetailResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallAccessDetailResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>8EAC2347-E85A-5DFF-9F49-B8E1BAFB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallAccessDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAccessDetailResponseBody self = new DescribeVpcFirewallAccessDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAccessDetailResponseBody setDataList(java.util.List<DescribeVpcFirewallAccessDetailResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallAccessDetailResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallAccessDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallAccessDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallAccessDetailResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17845821669.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <strong>example:</strong>
         * <p>10.125.1.XX</p>
         */
        @NameInMap("PeerAssetIP")
        public String peerAssetIP;

        /**
         * <strong>example:</strong>
         * <p>i-123451</p>
         */
        @NameInMap("PeerAssetInstanceId")
        public String peerAssetInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PeerAssetInstanceName")
        public String peerAssetInstanceName;

        /**
         * <strong>example:</strong>
         * <p>vpc-123411</p>
         */
        @NameInMap("PeerVpcId")
        public String peerVpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        @NameInMap("peerVpcName")
        public String peerVpcName;

        public static DescribeVpcFirewallAccessDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallAccessDetailResponseBodyDataList self = new DescribeVpcFirewallAccessDetailResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setPeerAssetIP(String peerAssetIP) {
            this.peerAssetIP = peerAssetIP;
            return this;
        }
        public String getPeerAssetIP() {
            return this.peerAssetIP;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setPeerAssetInstanceId(String peerAssetInstanceId) {
            this.peerAssetInstanceId = peerAssetInstanceId;
            return this;
        }
        public String getPeerAssetInstanceId() {
            return this.peerAssetInstanceId;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setPeerAssetInstanceName(String peerAssetInstanceName) {
            this.peerAssetInstanceName = peerAssetInstanceName;
            return this;
        }
        public String getPeerAssetInstanceName() {
            return this.peerAssetInstanceName;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setPeerVpcId(String peerVpcId) {
            this.peerVpcId = peerVpcId;
            return this;
        }
        public String getPeerVpcId() {
            return this.peerVpcId;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeVpcFirewallAccessDetailResponseBodyDataList setPeerVpcName(String peerVpcName) {
            this.peerVpcName = peerVpcName;
            return this;
        }
        public String getPeerVpcName() {
            return this.peerVpcName;
        }

    }

}
