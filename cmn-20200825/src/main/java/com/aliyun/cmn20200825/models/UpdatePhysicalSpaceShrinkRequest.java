// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceShrinkRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("City")
    public String city;

    @NameInMap("Country")
    public String country;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MoveAction")
    public String moveAction;

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
    public String securityDomainListShrink;

    @NameInMap("SpaceAbbreviation")
    public String spaceAbbreviation;

    @NameInMap("SpaceType")
    public String spaceType;

    @NameInMap("TargetUid")
    public String targetUid;

    public static UpdatePhysicalSpaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhysicalSpaceShrinkRequest self = new UpdatePhysicalSpaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhysicalSpaceShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdatePhysicalSpaceShrinkRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdatePhysicalSpaceShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdatePhysicalSpaceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePhysicalSpaceShrinkRequest setMoveAction(String moveAction) {
        this.moveAction = moveAction;
        return this;
    }
    public String getMoveAction() {
        return this.moveAction;
    }

    public UpdatePhysicalSpaceShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdatePhysicalSpaceShrinkRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public UpdatePhysicalSpaceShrinkRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdatePhysicalSpaceShrinkRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public UpdatePhysicalSpaceShrinkRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public UpdatePhysicalSpaceShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdatePhysicalSpaceShrinkRequest setSecurityDomainListShrink(String securityDomainListShrink) {
        this.securityDomainListShrink = securityDomainListShrink;
        return this;
    }
    public String getSecurityDomainListShrink() {
        return this.securityDomainListShrink;
    }

    public UpdatePhysicalSpaceShrinkRequest setSpaceAbbreviation(String spaceAbbreviation) {
        this.spaceAbbreviation = spaceAbbreviation;
        return this;
    }
    public String getSpaceAbbreviation() {
        return this.spaceAbbreviation;
    }

    public UpdatePhysicalSpaceShrinkRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public UpdatePhysicalSpaceShrinkRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

}
