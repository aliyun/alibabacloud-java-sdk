// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeVpcHavsInstancesRequest extends TeaModel {
    @NameInMap("MaxResultSize")
    public Integer maxResultSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VpcIdList")
    public java.util.List<String> vpcIdList;

    public static DescribeVpcHavsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHavsInstancesRequest self = new DescribeVpcHavsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHavsInstancesRequest setMaxResultSize(Integer maxResultSize) {
        this.maxResultSize = maxResultSize;
        return this;
    }
    public Integer getMaxResultSize() {
        return this.maxResultSize;
    }

    public DescribeVpcHavsInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpcHavsInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcHavsInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpcHavsInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpcHavsInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpcHavsInstancesRequest setVpcIdList(java.util.List<String> vpcIdList) {
        this.vpcIdList = vpcIdList;
        return this;
    }
    public java.util.List<String> getVpcIdList() {
        return this.vpcIdList;
    }

}
