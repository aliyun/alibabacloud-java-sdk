// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceRequest extends TeaModel {
    // 具体地址
    @NameInMap("Address")
    public String address;

    // 所属城市
    @NameInMap("City")
    public String city;

    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    // 所属国家
    @NameInMap("Country")
    public String country;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 负责人
    @NameInMap("Owner")
    public String owner;

    // 物理空间名称
    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    // 所属省份
    @NameInMap("Province")
    public String province;

    // 备注
    @NameInMap("Remark")
    public String remark;

    // 物理空间缩写
    @NameInMap("SpaceAbbreviation")
    public String spaceAbbreviation;

    // 物理空间模型
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
