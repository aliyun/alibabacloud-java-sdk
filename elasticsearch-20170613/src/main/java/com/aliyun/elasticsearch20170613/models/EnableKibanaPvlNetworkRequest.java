// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EnableKibanaPvlNetworkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>es-cn-27a3mul6l000xxx-kibana-endpoint</p>
     */
    @NameInMap("endpointName")
    public String endpointName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("securityGroups")
    public java.util.List<String> securityGroups;

    @NameInMap("vSwitchIdsZone")
    public java.util.List<EnableKibanaPvlNetworkRequestVSwitchIdsZone> vSwitchIdsZone;

    /**
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static EnableKibanaPvlNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableKibanaPvlNetworkRequest self = new EnableKibanaPvlNetworkRequest();
        return TeaModel.build(map, self);
    }

    public EnableKibanaPvlNetworkRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public EnableKibanaPvlNetworkRequest setSecurityGroups(java.util.List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public EnableKibanaPvlNetworkRequest setVSwitchIdsZone(java.util.List<EnableKibanaPvlNetworkRequestVSwitchIdsZone> vSwitchIdsZone) {
        this.vSwitchIdsZone = vSwitchIdsZone;
        return this;
    }
    public java.util.List<EnableKibanaPvlNetworkRequestVSwitchIdsZone> getVSwitchIdsZone() {
        return this.vSwitchIdsZone;
    }

    public EnableKibanaPvlNetworkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public EnableKibanaPvlNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class EnableKibanaPvlNetworkRequestVSwitchIdsZone extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-xxxx</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static EnableKibanaPvlNetworkRequestVSwitchIdsZone build(java.util.Map<String, ?> map) throws Exception {
            EnableKibanaPvlNetworkRequestVSwitchIdsZone self = new EnableKibanaPvlNetworkRequestVSwitchIdsZone();
            return TeaModel.build(map, self);
        }

        public EnableKibanaPvlNetworkRequestVSwitchIdsZone setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public EnableKibanaPvlNetworkRequestVSwitchIdsZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
