// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("City")
    public String city;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Country")
    public String country;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    @NameInMap("Province")
    public String province;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SecurityDomainList")
    public String securityDomainListShrink;

    @NameInMap("SpaceAbbreviation")
    public String spaceAbbreviation;

    @NameInMap("SpaceType")
    public String spaceType;

    public static CreatePhysicalSpaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalSpaceShrinkRequest self = new CreatePhysicalSpaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalSpaceShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreatePhysicalSpaceShrinkRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreatePhysicalSpaceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalSpaceShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreatePhysicalSpaceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreatePhysicalSpaceShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreatePhysicalSpaceShrinkRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public CreatePhysicalSpaceShrinkRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public CreatePhysicalSpaceShrinkRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CreatePhysicalSpaceShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePhysicalSpaceShrinkRequest setSecurityDomainListShrink(String securityDomainListShrink) {
        this.securityDomainListShrink = securityDomainListShrink;
        return this;
    }
    public String getSecurityDomainListShrink() {
        return this.securityDomainListShrink;
    }

    public CreatePhysicalSpaceShrinkRequest setSpaceAbbreviation(String spaceAbbreviation) {
        this.spaceAbbreviation = spaceAbbreviation;
        return this;
    }
    public String getSpaceAbbreviation() {
        return this.spaceAbbreviation;
    }

    public CreatePhysicalSpaceShrinkRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
