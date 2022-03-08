// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceRequest extends TeaModel {
    // 具体地址
    @NameInMap("Address")
    public String address;

    // 所属城市
    @NameInMap("City")
    public String city;

    // 所属国家
    @NameInMap("Country")
    public String country;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 负责人
    @NameInMap("Owner")
    public String owner;

    // 实例 ID。
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

    public static UpdatePhysicalSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhysicalSpaceRequest self = new UpdatePhysicalSpaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhysicalSpaceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdatePhysicalSpaceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdatePhysicalSpaceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdatePhysicalSpaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePhysicalSpaceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdatePhysicalSpaceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdatePhysicalSpaceRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public UpdatePhysicalSpaceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public UpdatePhysicalSpaceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdatePhysicalSpaceRequest setSpaceAbbreviation(String spaceAbbreviation) {
        this.spaceAbbreviation = spaceAbbreviation;
        return this;
    }
    public String getSpaceAbbreviation() {
        return this.spaceAbbreviation;
    }

    public UpdatePhysicalSpaceRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
