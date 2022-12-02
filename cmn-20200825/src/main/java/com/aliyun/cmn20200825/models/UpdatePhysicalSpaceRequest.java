// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceRequest extends TeaModel {
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
    public java.util.List<String> securityDomainList;

    @NameInMap("SpaceAbbreviation")
    public String spaceAbbreviation;

    @NameInMap("SpaceType")
    public String spaceType;

    @NameInMap("TargetUid")
    public String targetUid;

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

    public UpdatePhysicalSpaceRequest setMoveAction(String moveAction) {
        this.moveAction = moveAction;
        return this;
    }
    public String getMoveAction() {
        return this.moveAction;
    }

    public UpdatePhysicalSpaceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdatePhysicalSpaceRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
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

    public UpdatePhysicalSpaceRequest setSecurityDomainList(java.util.List<String> securityDomainList) {
        this.securityDomainList = securityDomainList;
        return this;
    }
    public java.util.List<String> getSecurityDomainList() {
        return this.securityDomainList;
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

    public UpdatePhysicalSpaceRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

}
