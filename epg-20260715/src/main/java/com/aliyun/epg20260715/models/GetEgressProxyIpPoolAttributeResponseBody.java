// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyIpPoolAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <strong>example:</strong>
     * <p>2022-07-02T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    /**
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
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
     * <p>01A05AB8-D4FC-5B68-B645-5BA513A94F36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<GetEgressProxyIpPoolAttributeResponseBodyTags> tags;

    @NameInMap("ZoneMappings")
    public java.util.List<GetEgressProxyIpPoolAttributeResponseBodyZoneMappings> zoneMappings;

    public static GetEgressProxyIpPoolAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyIpPoolAttributeResponseBody self = new GetEgressProxyIpPoolAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyIpPoolAttributeResponseBody setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setEgressProxyIpPoolName(String egressProxyIpPoolName) {
        this.egressProxyIpPoolName = egressProxyIpPoolName;
        return this;
    }
    public String getEgressProxyIpPoolName() {
        return this.egressProxyIpPoolName;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setHashFactor(String hashFactor) {
        this.hashFactor = hashFactor;
        return this;
    }
    public String getHashFactor() {
        return this.hashFactor;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setHashHeaderName(String hashHeaderName) {
        this.hashHeaderName = hashHeaderName;
        return this;
    }
    public String getHashHeaderName() {
        return this.hashHeaderName;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setTags(java.util.List<GetEgressProxyIpPoolAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetEgressProxyIpPoolAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetEgressProxyIpPoolAttributeResponseBody setZoneMappings(java.util.List<GetEgressProxyIpPoolAttributeResponseBodyZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<GetEgressProxyIpPoolAttributeResponseBodyZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class GetEgressProxyIpPoolAttributeResponseBodyTags extends TeaModel {
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

        public static GetEgressProxyIpPoolAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyIpPoolAttributeResponseBodyTags self = new GetEgressProxyIpPoolAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyIpPoolAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEgressProxyIpPoolAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eip-2zep1zbmxnvoyt1vsj****</p>
         */
        @NameInMap("EipAllocationId")
        public String eipAllocationId;

        /**
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("PrivateIpv4Address")
        public String privateIpv4Address;

        /**
         * <strong>example:</strong>
         * <p>48.101.2.1</p>
         */
        @NameInMap("PublicIpv4Address")
        public String publicIpv4Address;

        public static GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses self = new GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses setEipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        public GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses setPrivateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }
        public String getPrivateIpv4Address() {
            return this.privateIpv4Address;
        }

        public GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses setPublicIpv4Address(String publicIpv4Address) {
            this.publicIpv4Address = publicIpv4Address;
            return this;
        }
        public String getPublicIpv4Address() {
            return this.publicIpv4Address;
        }

    }

    public static class GetEgressProxyIpPoolAttributeResponseBodyZoneMappings extends TeaModel {
        @NameInMap("IpAddresses")
        public java.util.List<GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses> ipAddresses;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf64h3tjn2xsd94mb****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-guangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetEgressProxyIpPoolAttributeResponseBodyZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyIpPoolAttributeResponseBodyZoneMappings self = new GetEgressProxyIpPoolAttributeResponseBodyZoneMappings();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyIpPoolAttributeResponseBodyZoneMappings setIpAddresses(java.util.List<GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<GetEgressProxyIpPoolAttributeResponseBodyZoneMappingsIpAddresses> getIpAddresses() {
            return this.ipAddresses;
        }

        public GetEgressProxyIpPoolAttributeResponseBodyZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetEgressProxyIpPoolAttributeResponseBodyZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
