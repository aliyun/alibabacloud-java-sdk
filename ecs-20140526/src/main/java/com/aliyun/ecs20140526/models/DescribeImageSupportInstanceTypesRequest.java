// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesRequest extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Filter")
    public java.util.List<DescribeImageSupportInstanceTypesRequestFilter> filter;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeImageSupportInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesRequest self = new DescribeImageSupportInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public DescribeImageSupportInstanceTypesRequest setFilter(java.util.List<DescribeImageSupportInstanceTypesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeImageSupportInstanceTypesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeImageSupportInstanceTypesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSupportInstanceTypesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageSupportInstanceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSupportInstanceTypesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImageSupportInstanceTypesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeImageSupportInstanceTypesRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImageSupportInstanceTypesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesRequestFilter self = new DescribeImageSupportInstanceTypesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageSupportInstanceTypesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
