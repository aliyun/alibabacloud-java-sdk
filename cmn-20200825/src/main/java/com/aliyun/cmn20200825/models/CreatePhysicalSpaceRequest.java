// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceRequest extends TeaModel {
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
    public java.util.List<String> securityDomainList;

    @NameInMap("SpaceAbbreviation")
    public String spaceAbbreviation;

    @NameInMap("SpaceType")
    public String spaceType;

    public static CreatePhysicalSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalSpaceRequest self = new CreatePhysicalSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalSpaceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreatePhysicalSpaceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreatePhysicalSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalSpaceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreatePhysicalSpaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreatePhysicalSpaceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreatePhysicalSpaceRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public CreatePhysicalSpaceRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public CreatePhysicalSpaceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CreatePhysicalSpaceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePhysicalSpaceRequest setSecurityDomainList(java.util.List<String> securityDomainList) {
        this.securityDomainList = securityDomainList;
        return this;
    }
    public java.util.List<String> getSecurityDomainList() {
        return this.securityDomainList;
    }

    public CreatePhysicalSpaceRequest setSpaceAbbreviation(String spaceAbbreviation) {
        this.spaceAbbreviation = spaceAbbreviation;
        return this;
    }
    public String getSpaceAbbreviation() {
        return this.spaceAbbreviation;
    }

    public CreatePhysicalSpaceRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
