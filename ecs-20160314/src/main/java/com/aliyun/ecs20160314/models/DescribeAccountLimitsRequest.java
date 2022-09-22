// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAccountLimitsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<Filter> filter;

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

    public static DescribeAccountLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountLimitsRequest self = new DescribeAccountLimitsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountLimitsRequest setFilter(java.util.List<Filter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    public DescribeAccountLimitsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAccountLimitsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAccountLimitsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccountLimitsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAccountLimitsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class Filter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static Filter build(java.util.Map<String, ?> map) throws Exception {
            Filter self = new Filter();
            return TeaModel.build(map, self);
        }

        public Filter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Filter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
