// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationRequest extends TeaModel {
    @NameInMap("OrganizationName")
    public String organizationName;

    @NameInMap("Location")
    public String location;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Description")
    public String description;

    @NameInMap("SpecName")
    public String specName;

    @NameInMap("PeersCount")
    public Integer peersCount;

    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    public static CreateFabricOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationRequest self = new CreateFabricOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public CreateFabricOrganizationRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateFabricOrganizationRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateFabricOrganizationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFabricOrganizationRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateFabricOrganizationRequest setPeersCount(Integer peersCount) {
        this.peersCount = peersCount;
        return this;
    }
    public Integer getPeersCount() {
        return this.peersCount;
    }

    public CreateFabricOrganizationRequest setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public CreateFabricOrganizationRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

}
