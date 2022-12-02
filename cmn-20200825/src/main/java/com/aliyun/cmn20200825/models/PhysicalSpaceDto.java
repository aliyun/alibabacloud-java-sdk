// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class PhysicalSpaceDto extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Children")
    public java.util.List<PhysicalSpaceDto> children;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("FullParentPath")
    public String fullParentPath;

    @NameInMap("Instance")
    public String instance;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

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

    public static PhysicalSpaceDto build(java.util.Map<String, ?> map) throws Exception {
        PhysicalSpaceDto self = new PhysicalSpaceDto();
        return TeaModel.build(map, self);
    }

    public PhysicalSpaceDto setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public PhysicalSpaceDto setChildren(java.util.List<PhysicalSpaceDto> children) {
        this.children = children;
        return this;
    }
    public java.util.List<PhysicalSpaceDto> getChildren() {
        return this.children;
    }

    public PhysicalSpaceDto setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public PhysicalSpaceDto setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public PhysicalSpaceDto setFullParentPath(String fullParentPath) {
        this.fullParentPath = fullParentPath;
        return this;
    }
    public String getFullParentPath() {
        return this.fullParentPath;
    }

    public PhysicalSpaceDto setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public PhysicalSpaceDto setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public PhysicalSpaceDto setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public PhysicalSpaceDto setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public PhysicalSpaceDto setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public PhysicalSpaceDto setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public PhysicalSpaceDto setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public PhysicalSpaceDto setSecurityDomainList(java.util.List<String> securityDomainList) {
        this.securityDomainList = securityDomainList;
        return this;
    }
    public java.util.List<String> getSecurityDomainList() {
        return this.securityDomainList;
    }

    public PhysicalSpaceDto setSpaceAbbreviation(String spaceAbbreviation) {
        this.spaceAbbreviation = spaceAbbreviation;
        return this;
    }
    public String getSpaceAbbreviation() {
        return this.spaceAbbreviation;
    }

    public PhysicalSpaceDto setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
