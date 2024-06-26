// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEcosphereRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Any</p>
     */
    @NameInMap("ChannelPolicy")
    public String channelPolicy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("ConsortiumName")
    public String consortiumName;

    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("OrdererDomain")
    public String ordererDomain;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kafka</p>
     */
    @NameInMap("OrdererType")
    public String ordererType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OrderersCount")
    public Integer orderersCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Organization")
    public java.util.List<CreateEcosphereRequestOrganization> organization;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PeersCount")
    public Integer peersCount;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("SpecName")
    public String specName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateEcosphereRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEcosphereRequest self = new CreateEcosphereRequest();
        return TeaModel.build(map, self);
    }

    public CreateEcosphereRequest setChannelPolicy(String channelPolicy) {
        this.channelPolicy = channelPolicy;
        return this;
    }
    public String getChannelPolicy() {
        return this.channelPolicy;
    }

    public CreateEcosphereRequest setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public CreateEcosphereRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEcosphereRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateEcosphereRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateEcosphereRequest setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public CreateEcosphereRequest setOrdererDomain(String ordererDomain) {
        this.ordererDomain = ordererDomain;
        return this;
    }
    public String getOrdererDomain() {
        return this.ordererDomain;
    }

    public CreateEcosphereRequest setOrdererType(String ordererType) {
        this.ordererType = ordererType;
        return this;
    }
    public String getOrdererType() {
        return this.ordererType;
    }

    public CreateEcosphereRequest setOrderersCount(Integer orderersCount) {
        this.orderersCount = orderersCount;
        return this;
    }
    public Integer getOrderersCount() {
        return this.orderersCount;
    }

    public CreateEcosphereRequest setOrganization(java.util.List<CreateEcosphereRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateEcosphereRequestOrganization> getOrganization() {
        return this.organization;
    }

    public CreateEcosphereRequest setPeersCount(Integer peersCount) {
        this.peersCount = peersCount;
        return this;
    }
    public Integer getPeersCount() {
        return this.peersCount;
    }

    public CreateEcosphereRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateEcosphereRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateEcosphereRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateEcosphereRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>domain1</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateEcosphereRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateEcosphereRequestOrganization self = new CreateEcosphereRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateEcosphereRequestOrganization setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEcosphereRequestOrganization setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateEcosphereRequestOrganization setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
