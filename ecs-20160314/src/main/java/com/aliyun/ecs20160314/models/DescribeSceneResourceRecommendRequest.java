// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeSceneResourceRecommendRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductId")
    public Integer productId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneId")
    public Integer sceneId;

    public static DescribeSceneResourceRecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneResourceRecommendRequest self = new DescribeSceneResourceRecommendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneResourceRecommendRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSceneResourceRecommendRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSceneResourceRecommendRequest setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public Integer getProductId() {
        return this.productId;
    }

    public DescribeSceneResourceRecommendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSceneResourceRecommendRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeSceneResourceRecommendRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSceneResourceRecommendRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSceneResourceRecommendRequest setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Integer getSceneId() {
        return this.sceneId;
    }

}
