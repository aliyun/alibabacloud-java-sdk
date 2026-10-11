// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class RemoveIpAddressesFromEgressProxyIpPoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
    public java.util.List<RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings> zoneMappings;

    public static RemoveIpAddressesFromEgressProxyIpPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpAddressesFromEgressProxyIpPoolRequest self = new RemoveIpAddressesFromEgressProxyIpPoolRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIpAddressesFromEgressProxyIpPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveIpAddressesFromEgressProxyIpPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveIpAddressesFromEgressProxyIpPoolRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public RemoveIpAddressesFromEgressProxyIpPoolRequest setZoneMappings(java.util.List<RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eip-2zep1zbmxnvoyt1vs****</p>
         */
        @NameInMap("EipAllocationId")
        public String eipAllocationId;

        /**
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("PrivateIpv4Address")
        public String privateIpv4Address;

        public static RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses self = new RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses();
            return TeaModel.build(map, self);
        }

        public RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses setPrivateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        public String getPrivateIpv4Address() {
            return this.privateIpv4Address;
        }

    }

    public static class RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IpAddresses")
        public java.util.List<RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses> ipAddresses;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings self = new RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings setIpAddresses(java.util.List<RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappingsIpAddresses> getIpAddresses() {
            return this.ipAddresses;
        }

        public RemoveIpAddressesFromEgressProxyIpPoolRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
