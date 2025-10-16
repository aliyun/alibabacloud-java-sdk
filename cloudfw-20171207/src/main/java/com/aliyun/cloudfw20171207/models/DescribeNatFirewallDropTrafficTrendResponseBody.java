// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallDropTrafficTrendResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeNatFirewallDropTrafficTrendResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>62436</p>
     */
    @NameInMap("DropSessionMax")
    public Long dropSessionMax;

    /**
     * <strong>example:</strong>
     * <p>1525662720</p>
     */
    @NameInMap("DropSessionMaxTime")
    public String dropSessionMaxTime;

    /**
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatFirewallDropTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallDropTrafficTrendResponseBody self = new DescribeNatFirewallDropTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallDropTrafficTrendResponseBody setDataList(java.util.List<DescribeNatFirewallDropTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeNatFirewallDropTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeNatFirewallDropTrafficTrendResponseBody setDropSessionMax(Long dropSessionMax) {
        this.dropSessionMax = dropSessionMax;
        return this;
    }
    public Long getDropSessionMax() {
        return this.dropSessionMax;
    }

    public DescribeNatFirewallDropTrafficTrendResponseBody setDropSessionMaxTime(String dropSessionMaxTime) {
        this.dropSessionMaxTime = dropSessionMaxTime;
        return this;
    }
    public String getDropSessionMaxTime() {
        return this.dropSessionMaxTime;
    }

    public DescribeNatFirewallDropTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNatFirewallDropTrafficTrendResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DropSession")
        public Long dropSession;

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

        public static DescribeNatFirewallDropTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallDropTrafficTrendResponseBodyDataList self = new DescribeNatFirewallDropTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallDropTrafficTrendResponseBodyDataList setDropSession(Long dropSession) {
            this.dropSession = dropSession;
            return this;
        }
        public Long getDropSession() {
            return this.dropSession;
        }

        public DescribeNatFirewallDropTrafficTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeNatFirewallDropTrafficTrendResponseBodyDataList setTotalSession(Long totalSession) {
            this.totalSession = totalSession;
            return this;
        }
        public Long getTotalSession() {
            return this.totalSession;
        }

    }

}
