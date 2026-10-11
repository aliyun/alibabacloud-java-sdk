// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyIpPoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>created by epg</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testIpPool</p>
     */
    @NameInMap("EgressProxyIpPoolName")
    public String egressProxyIpPoolName;

    /**
     * <strong>example:</strong>
     * <p>SourceIP</p>
     */
    @NameInMap("HashFactor")
    public String hashFactor;

    /**
     * <strong>example:</strong>
     * <p>X-Forwarded-For</p>
     */
    @NameInMap("HashHeaderName")
    public String hashHeaderName;

    /**
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("Tag")
    public java.util.List<CreateEgressProxyIpPoolRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CreateEgressProxyIpPoolRequestZoneMappings> zoneMappings;

    public static CreateEgressProxyIpPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyIpPoolRequest self = new CreateEgressProxyIpPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyIpPoolRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateEgressProxyIpPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEgressProxyIpPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEgressProxyIpPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEgressProxyIpPoolRequest setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public CreateEgressProxyIpPoolRequest setEgressProxyIpPoolName(String egressProxyIpPoolName) {
        this.egressProxyIpPoolName = egressProxyIpPoolName;
        return this;
    }
    public String getEgressProxyIpPoolName() {
        return this.egressProxyIpPoolName;
    }

    public CreateEgressProxyIpPoolRequest setHashFactor(String hashFactor) {
        this.hashFactor = hashFactor;
        return this;
    }
    public String getHashFactor() {
        return this.hashFactor;
    }

    public CreateEgressProxyIpPoolRequest setHashHeaderName(String hashHeaderName) {
        this.hashHeaderName = hashHeaderName;
        return this;
    }
    public String getHashHeaderName() {
        return this.hashHeaderName;
    }

    public CreateEgressProxyIpPoolRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateEgressProxyIpPoolRequest setTag(java.util.List<CreateEgressProxyIpPoolRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEgressProxyIpPoolRequestTag> getTag() {
        return this.tag;
    }

    public CreateEgressProxyIpPoolRequest setZoneMappings(java.util.List<CreateEgressProxyIpPoolRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateEgressProxyIpPoolRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateEgressProxyIpPoolRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>epg</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEgressProxyIpPoolRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyIpPoolRequestTag self = new CreateEgressProxyIpPoolRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyIpPoolRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEgressProxyIpPoolRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses extends TeaModel {
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

        public static CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses self = new CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses setPrivateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        public String getPrivateIpv4Address() {
            return this.privateIpv4Address;
        }

    }

    public static class CreateEgressProxyIpPoolRequestZoneMappings extends TeaModel {
        @NameInMap("IpAddresses")
        public java.util.List<CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses> ipAddresses;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IpCount")
        public Integer ipCount;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jl8x3ridfqbikax5o****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateEgressProxyIpPoolRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyIpPoolRequestZoneMappings self = new CreateEgressProxyIpPoolRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyIpPoolRequestZoneMappings setIpAddresses(java.util.List<CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<CreateEgressProxyIpPoolRequestZoneMappingsIpAddresses> getIpAddresses() {
            return this.ipAddresses;
        }

        public CreateEgressProxyIpPoolRequestZoneMappings setIpCount(Integer ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Integer getIpCount() {
            return this.ipCount;
        }

        public CreateEgressProxyIpPoolRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateEgressProxyIpPoolRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
