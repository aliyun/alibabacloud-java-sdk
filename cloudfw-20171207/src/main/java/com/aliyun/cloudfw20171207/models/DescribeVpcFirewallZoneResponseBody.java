// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallZoneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>337A4DBA-8A01-5E9C-99CA-84293E13****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of zones.</p>
     */
    @NameInMap("ZoneList")
    public java.util.List<java.util.List<DescribeVpcFirewallZoneResponseBodyZoneList>> zoneList;

    public static DescribeVpcFirewallZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallZoneResponseBody self = new DescribeVpcFirewallZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallZoneResponseBody setZoneList(java.util.List<java.util.List<DescribeVpcFirewallZoneResponseBodyZoneList>> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<java.util.List<DescribeVpcFirewallZoneResponseBodyZoneList>> getZoneList() {
        return this.zoneList;
    }

    public static class DescribeVpcFirewallZoneResponseBodyZoneList extends TeaModel {
        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Zone C</p>
         */
        @NameInMap("LocalName")
        public String localName;

        public static DescribeVpcFirewallZoneResponseBodyZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallZoneResponseBodyZoneList self = new DescribeVpcFirewallZoneResponseBodyZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallZoneResponseBodyZoneList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeVpcFirewallZoneResponseBodyZoneList setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

    }

}
