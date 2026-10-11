// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class AddIpAddressesToEgressProxyIpPoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42661417****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eppool-gw80606a59ecc10****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<AddIpAddressesToEgressProxyIpPoolRequestZoneMappings> zoneMappings;

    public static AddIpAddressesToEgressProxyIpPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpAddressesToEgressProxyIpPoolRequest self = new AddIpAddressesToEgressProxyIpPoolRequest();
        return TeaModel.build(map, self);
    }

    public AddIpAddressesToEgressProxyIpPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddIpAddressesToEgressProxyIpPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddIpAddressesToEgressProxyIpPoolRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public AddIpAddressesToEgressProxyIpPoolRequest setZoneMappings(java.util.List<AddIpAddressesToEgressProxyIpPoolRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<AddIpAddressesToEgressProxyIpPoolRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eip-2zep1zbmxnvoyt1vsj****</p>
         */
        @NameInMap("EipAllocationId")
        public String eipAllocationId;

        /**
         * <strong>example:</strong>
         * <p>172.16.1.1</p>
         */
        @NameInMap("PrivateIpv4Address")
        public String privateIpv4Address;

        public static AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses self = new AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses();
            return TeaModel.build(map, self);
        }

        public AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses setPrivateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        public String getPrivateIpv4Address() {
            return this.privateIpv4Address;
        }

    }

    public static class AddIpAddressesToEgressProxyIpPoolRequestZoneMappings extends TeaModel {
        @NameInMap("IpAddresses")
        public java.util.List<AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses> ipAddresses;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpCount")
        public Integer ipCount;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static AddIpAddressesToEgressProxyIpPoolRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            AddIpAddressesToEgressProxyIpPoolRequestZoneMappings self = new AddIpAddressesToEgressProxyIpPoolRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public AddIpAddressesToEgressProxyIpPoolRequestZoneMappings setIpAddresses(java.util.List<AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<AddIpAddressesToEgressProxyIpPoolRequestZoneMappingsIpAddresses> getIpAddresses() {
            return this.ipAddresses;
        }

        public AddIpAddressesToEgressProxyIpPoolRequestZoneMappings setIpCount(Integer ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Integer getIpCount() {
            return this.ipCount;
        }

        public AddIpAddressesToEgressProxyIpPoolRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
