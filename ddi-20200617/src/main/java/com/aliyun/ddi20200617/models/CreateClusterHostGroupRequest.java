// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateClusterHostGroupRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostGroupName")
    public String hostGroupName;

    @NameInMap("HostGroupType")
    public String hostGroupType;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("HostGroupParams")
    public String hostGroupParams;

    public static CreateClusterHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterHostGroupRequest self = new CreateClusterHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterHostGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateClusterHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterHostGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterHostGroupRequest setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    public CreateClusterHostGroupRequest setHostGroupType(String hostGroupType) {
        this.hostGroupType = hostGroupType;
        return this;
    }
    public String getHostGroupType() {
        return this.hostGroupType;
    }

    public CreateClusterHostGroupRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateClusterHostGroupRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateClusterHostGroupRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateClusterHostGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterHostGroupRequest setHostGroupParams(String hostGroupParams) {
        this.hostGroupParams = hostGroupParams;
        return this;
    }
    public String getHostGroupParams() {
        return this.hostGroupParams;
    }

}
