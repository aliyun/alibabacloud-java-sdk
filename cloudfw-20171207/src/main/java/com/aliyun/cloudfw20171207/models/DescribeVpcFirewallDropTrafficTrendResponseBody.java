// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDropTrafficTrendResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallDropTrafficTrendResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DropSessionMax")
    public Long dropSessionMax;

    /**
     * <strong>example:</strong>
     * <p>C87C1797-02E6-5EEB-A943-4416207D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpcFirewallDropTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDropTrafficTrendResponseBody self = new DescribeVpcFirewallDropTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDropTrafficTrendResponseBody setDataList(java.util.List<DescribeVpcFirewallDropTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallDropTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallDropTrafficTrendResponseBody setDropSessionMax(Long dropSessionMax) {
        this.dropSessionMax = dropSessionMax;
        return this;
    }
    public Long getDropSessionMax() {
        return this.dropSessionMax;
    }

    public DescribeVpcFirewallDropTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVpcFirewallDropTrafficTrendResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AclDrop")
        public Long aclDrop;

        /**
         * <strong>example:</strong>
         * <p>2018-08-25 12:00:00</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DropSession")
        public Long dropSession;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IpsDrop")
        public Long ipsDrop;

        /**
         * <strong>example:</strong>
         * <p>1659405600</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <strong>example:</strong>
         * <p>153188</p>
         */
        @NameInMap("TotalSession")
        public Long totalSession;

        public static DescribeVpcFirewallDropTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDropTrafficTrendResponseBodyDataList self = new DescribeVpcFirewallDropTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBodyDataList setAclDrop(Long aclDrop) {
            this.aclDrop = aclDrop;
            return this;
        }
        public Long getAclDrop() {
            return this.aclDrop;
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBodyDataList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBodyDataList setDropSession(Long dropSession) {
            this.dropSession = dropSession;
            return this;
        }
        public Long getDropSession() {
            return this.dropSession;
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBodyDataList setIpsDrop(Long ipsDrop) {
            this.ipsDrop = ipsDrop;
            return this;
        }
        public Long getIpsDrop() {
            return this.ipsDrop;
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBodyDataList setTotalSession(Long totalSession) {
            this.totalSession = totalSession;
            return this;
        }
        public Long getTotalSession() {
            return this.totalSession;
        }

    }

}
