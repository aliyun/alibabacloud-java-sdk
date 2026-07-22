// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallDropTrendResponseBody extends TeaModel {
    /**
     * <p>The returned data list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeFirewallDropTrendResponseBodyDataList> dataList;

    /**
     * <p>The maximum number of total blocked sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxDropSession")
    public Long maxDropSession;

    /**
     * <p>The time when the maximum number of total blocked sessions occurred. The value is a UNIX timestamp in seconds, such as 1672502400.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("MaxDropTime")
    public Long maxDropTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75E60025-43C5-5635-B7B7-272C5246****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFirewallDropTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallDropTrendResponseBody self = new DescribeFirewallDropTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallDropTrendResponseBody setDataList(java.util.List<DescribeFirewallDropTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeFirewallDropTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeFirewallDropTrendResponseBody setMaxDropSession(Long maxDropSession) {
        this.maxDropSession = maxDropSession;
        return this;
    }
    public Long getMaxDropSession() {
        return this.maxDropSession;
    }

    public DescribeFirewallDropTrendResponseBody setMaxDropTime(Long maxDropTime) {
        this.maxDropTime = maxDropTime;
        return this;
    }
    public Long getMaxDropTime() {
        return this.maxDropTime;
    }

    public DescribeFirewallDropTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFirewallDropTrendResponseBodyDataList extends TeaModel {
        /**
         * <p>The number of sessions blocked by the Internet firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InternetDropSession")
        public Long internetDropSession;

        /**
         * <p>The number of sessions blocked by the NAT firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NatDropSession")
        public Long natDropSession;

        /**
         * <p>The time when the traffic occurred. The value is a UNIX timestamp in seconds.</p>
         * <p>If the data at this point in time has not been processed, the values of other fields are -1.</p>
         * 
         * <strong>example:</strong>
         * <p>1758474000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The total number of sessions blocked by the firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalDropSession")
        public Long totalDropSession;

        /**
         * <p>The number of sessions blocked by the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("VpcDropSession")
        public Long vpcDropSession;

        public static DescribeFirewallDropTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallDropTrendResponseBodyDataList self = new DescribeFirewallDropTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallDropTrendResponseBodyDataList setInternetDropSession(Long internetDropSession) {
            this.internetDropSession = internetDropSession;
            return this;
        }
        public Long getInternetDropSession() {
            return this.internetDropSession;
        }

        public DescribeFirewallDropTrendResponseBodyDataList setNatDropSession(Long natDropSession) {
            this.natDropSession = natDropSession;
            return this;
        }
        public Long getNatDropSession() {
            return this.natDropSession;
        }

        public DescribeFirewallDropTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeFirewallDropTrendResponseBodyDataList setTotalDropSession(Long totalDropSession) {
            this.totalDropSession = totalDropSession;
            return this;
        }
        public Long getTotalDropSession() {
            return this.totalDropSession;
        }

        public DescribeFirewallDropTrendResponseBodyDataList setVpcDropSession(Long vpcDropSession) {
            this.vpcDropSession = vpcDropSession;
            return this;
        }
        public Long getVpcDropSession() {
            return this.vpcDropSession;
        }

    }

}
