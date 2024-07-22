// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPvlNetworkResponseBody extends TeaModel {
    /**
     * <p>request id</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListKibanaPvlNetworkResponseBodyResult> result;

    public static ListKibanaPvlNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKibanaPvlNetworkResponseBody self = new ListKibanaPvlNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKibanaPvlNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKibanaPvlNetworkResponseBody setResult(java.util.List<ListKibanaPvlNetworkResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListKibanaPvlNetworkResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-xdefafns***</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone build(java.util.Map<String, ?> map) throws Exception {
            ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone self = new ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone();
            return TeaModel.build(map, self);
        }

        public ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListKibanaPvlNetworkResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-03-07T06:26:28Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>ep-bp1tah7zbrwmkjef****</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>es-cn-xxdjfia****-kibana</p>
         */
        @NameInMap("endpointName")
        public String endpointName;

        /**
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("endpointStatus")
        public String endpointStatus;

        /**
         * <strong>example:</strong>
         * <p>es-cn-27a3mul6l***-kibana-internal</p>
         */
        @NameInMap("pvlId")
        public String pvlId;

        @NameInMap("securityGroups")
        public java.util.List<String> securityGroups;

        @NameInMap("vSwitchIdsZone")
        public java.util.List<ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone> vSwitchIdsZone;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtma*****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListKibanaPvlNetworkResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListKibanaPvlNetworkResponseBodyResult self = new ListKibanaPvlNetworkResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListKibanaPvlNetworkResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListKibanaPvlNetworkResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListKibanaPvlNetworkResponseBodyResult setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListKibanaPvlNetworkResponseBodyResult setEndpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        public ListKibanaPvlNetworkResponseBodyResult setPvlId(String pvlId) {
            this.pvlId = pvlId;
            return this;
        }
        public String getPvlId() {
            return this.pvlId;
        }

        public ListKibanaPvlNetworkResponseBodyResult setSecurityGroups(java.util.List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public java.util.List<String> getSecurityGroups() {
            return this.securityGroups;
        }

        public ListKibanaPvlNetworkResponseBodyResult setVSwitchIdsZone(java.util.List<ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone> vSwitchIdsZone) {
            this.vSwitchIdsZone = vSwitchIdsZone;
            return this;
        }
        public java.util.List<ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone> getVSwitchIdsZone() {
            return this.vSwitchIdsZone;
        }

        public ListKibanaPvlNetworkResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
