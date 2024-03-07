// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPvlNetworkResponseBody extends TeaModel {
    /**
     * <p>request id</p>
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
        @NameInMap("vswitchId")
        public String vswitchId;

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
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("endpointId")
        public String endpointId;

        @NameInMap("endpointName")
        public String endpointName;

        @NameInMap("endpointStatus")
        public String endpointStatus;

        @NameInMap("pvlId")
        public String pvlId;

        @NameInMap("securityGroups")
        public java.util.List<String> securityGroups;

        @NameInMap("vSwitchIdsZone")
        public java.util.List<ListKibanaPvlNetworkResponseBodyResultVSwitchIdsZone> vSwitchIdsZone;

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
