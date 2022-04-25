// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class PhysicalSpaceDto extends TeaModel {
    // 具体地址
    @NameInMap("Address")
    public String address;

    // 下一级
    @NameInMap("Children")
    public java.util.List<PhysicalSpaceDto> children;

    // 所属城市
    @NameInMap("City")
    public String city;

    // 所属国家
    @NameInMap("Country")
    public String country;

    // 上级全路径
    @NameInMap("FullParentPath")
    public String fullParentPath;

    // 实例
    @NameInMap("Instance")
    public String instance;

    // 负责人
    @NameInMap("Owner")
    public String owner;

    // 上级物理空间
    @NameInMap("ParentUid")
    public String parentUid;

    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 物理空间名称
    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    // 所属省份
    @NameInMap("Province")
    public String province;

    // 备注
    @NameInMap("Remark")
    public String remark;

    // 缩写
    @NameInMap("SpaceAbbreviation")
    public String spaceAbbreviation;

    // 模型
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
