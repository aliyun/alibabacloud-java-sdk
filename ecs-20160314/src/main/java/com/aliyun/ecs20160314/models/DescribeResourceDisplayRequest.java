// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceDisplayRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("FirstBizLevel")
    public String firstBizLevel;

    @NameInMap("InstanceCategoryType")
    public java.util.List<String> instanceCategoryType;

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

    @NameInMap("SecondBizLevel")
    public String secondBizLevel;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("TemplateTag")
    public java.util.List<TemplateTag> templateTag;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeResourceDisplayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDisplayRequest self = new DescribeResourceDisplayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDisplayRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeResourceDisplayRequest setFirstBizLevel(String firstBizLevel) {
        this.firstBizLevel = firstBizLevel;
        return this;
    }
    public String getFirstBizLevel() {
        return this.firstBizLevel;
    }

    public DescribeResourceDisplayRequest setInstanceCategoryType(java.util.List<String> instanceCategoryType) {
        this.instanceCategoryType = instanceCategoryType;
        return this;
    }
    public java.util.List<String> getInstanceCategoryType() {
        return this.instanceCategoryType;
    }

    public DescribeResourceDisplayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeResourceDisplayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceDisplayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceDisplayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceDisplayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceDisplayRequest setSecondBizLevel(String secondBizLevel) {
        this.secondBizLevel = secondBizLevel;
        return this;
    }
    public String getSecondBizLevel() {
        return this.secondBizLevel;
    }

    public DescribeResourceDisplayRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeResourceDisplayRequest setTemplateTag(java.util.List<TemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<TemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public DescribeResourceDisplayRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class TemplateTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TemplateTag build(java.util.Map<String, ?> map) throws Exception {
            TemplateTag self = new TemplateTag();
            return TeaModel.build(map, self);
        }

        public TemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
