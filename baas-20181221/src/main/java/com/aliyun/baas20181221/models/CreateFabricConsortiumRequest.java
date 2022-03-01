// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricConsortiumRequest extends TeaModel {
    @NameInMap("ChannelPolicy")
    public String channelPolicy;

    @NameInMap("ConsortiumDescription")
    public String consortiumDescription;

    @NameInMap("ConsortiumName")
    public String consortiumName;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Location")
    public String location;

    @NameInMap("OrdererType")
    public String ordererType;

    @NameInMap("OrderersCount")
    public Integer orderersCount;

    @NameInMap("Organization")
    public java.util.List<CreateFabricConsortiumRequestOrganization> organization;

    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("PeersCount")
    public Integer peersCount;

    @NameInMap("SpecName")
    public String specName;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateFabricConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricConsortiumRequest self = new CreateFabricConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricConsortiumRequest setChannelPolicy(String channelPolicy) {
        this.channelPolicy = channelPolicy;
        return this;
    }
    public String getChannelPolicy() {
        return this.channelPolicy;
    }

    public CreateFabricConsortiumRequest setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    public CreateFabricConsortiumRequest setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public CreateFabricConsortiumRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateFabricConsortiumRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateFabricConsortiumRequest setOrdererType(String ordererType) {
        this.ordererType = ordererType;
        return this;
    }
    public String getOrdererType() {
        return this.ordererType;
    }

    public CreateFabricConsortiumRequest setOrderersCount(Integer orderersCount) {
        this.orderersCount = orderersCount;
        return this;
    }
    public Integer getOrderersCount() {
        return this.orderersCount;
    }

    public CreateFabricConsortiumRequest setOrganization(java.util.List<CreateFabricConsortiumRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateFabricConsortiumRequestOrganization> getOrganization() {
        return this.organization;
    }

    public CreateFabricConsortiumRequest setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public CreateFabricConsortiumRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public CreateFabricConsortiumRequest setPeersCount(Integer peersCount) {
        this.peersCount = peersCount;
        return this;
    }
    public Integer getPeersCount() {
        return this.peersCount;
    }

    public CreateFabricConsortiumRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateFabricConsortiumRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateFabricConsortiumRequestOrganization extends TeaModel {
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateFabricConsortiumRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricConsortiumRequestOrganization self = new CreateFabricConsortiumRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateFabricConsortiumRequestOrganization setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
