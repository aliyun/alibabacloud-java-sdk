// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateConsortiumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Any</p>
     */
    @NameInMap("ChannelPolicy")
    public String channelPolicy;

    /**
     * <strong>example:</strong>
     * <p>some</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>helloworld</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>24</p>
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
     * <p>helloworld</p>
     */
    @NameInMap("Name")
    public String name;

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

    @NameInMap("Organization")
    public java.util.List<CreateConsortiumRequestOrganization> organization;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PeersCount")
    public Integer peersCount;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
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
     * <p>zone</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsortiumRequest self = new CreateConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsortiumRequest setChannelPolicy(String channelPolicy) {
        this.channelPolicy = channelPolicy;
        return this;
    }
    public String getChannelPolicy() {
        return this.channelPolicy;
    }

    public CreateConsortiumRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConsortiumRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateConsortiumRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateConsortiumRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateConsortiumRequest setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public CreateConsortiumRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateConsortiumRequest setOrdererType(String ordererType) {
        this.ordererType = ordererType;
        return this;
    }
    public String getOrdererType() {
        return this.ordererType;
    }

    public CreateConsortiumRequest setOrderersCount(Integer orderersCount) {
        this.orderersCount = orderersCount;
        return this;
    }
    public Integer getOrderersCount() {
        return this.orderersCount;
    }

    public CreateConsortiumRequest setOrganization(java.util.List<CreateConsortiumRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateConsortiumRequestOrganization> getOrganization() {
        return this.organization;
    }

    public CreateConsortiumRequest setPeersCount(Integer peersCount) {
        this.peersCount = peersCount;
        return this;
    }
    public Integer getPeersCount() {
        return this.peersCount;
    }

    public CreateConsortiumRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateConsortiumRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateConsortiumRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateConsortiumRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-yidio-1tuigx42b1goc</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateConsortiumRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateConsortiumRequestOrganization self = new CreateConsortiumRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateConsortiumRequestOrganization setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
