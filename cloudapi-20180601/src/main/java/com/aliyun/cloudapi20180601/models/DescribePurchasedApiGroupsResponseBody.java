// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PurchasedApiGroupAttributes")
    public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes purchasedApiGroupAttributes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePurchasedApiGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupsResponseBody self = new DescribePurchasedApiGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePurchasedApiGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedApiGroupsResponseBody setPurchasedApiGroupAttributes(DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes purchasedApiGroupAttributes) {
        this.purchasedApiGroupAttributes = purchasedApiGroupAttributes;
        return this;
    }
    public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes getPurchasedApiGroupAttributes() {
        return this.purchasedApiGroupAttributes;
    }

    public DescribePurchasedApiGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedApiGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute extends TeaModel {
        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("GroupDescription")
        public String groupDescription;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("InvokeTimesMax")
        public Long invokeTimesMax;

        @NameInMap("InvokeTimesNow")
        public Long invokeTimesNow;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute self = new DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setGroupDescription(String groupDescription) {
            this.groupDescription = groupDescription;
            return this;
        }
        public String getGroupDescription() {
            return this.groupDescription;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setInvokeTimesMax(Long invokeTimesMax) {
            this.invokeTimesMax = invokeTimesMax;
            return this;
        }
        public Long getInvokeTimesMax() {
            return this.invokeTimesMax;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setInvokeTimesNow(Long invokeTimesNow) {
            this.invokeTimesNow = invokeTimesNow;
            return this;
        }
        public Long getInvokeTimesNow() {
            return this.invokeTimesNow;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes extends TeaModel {
        @NameInMap("PurchasedApiGroupAttribute")
        public java.util.List<DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute> purchasedApiGroupAttribute;

        public static DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes self = new DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes setPurchasedApiGroupAttribute(java.util.List<DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute> purchasedApiGroupAttribute) {
            this.purchasedApiGroupAttribute = purchasedApiGroupAttribute;
            return this;
        }
        public java.util.List<DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute> getPurchasedApiGroupAttribute() {
            return this.purchasedApiGroupAttribute;
        }

    }

}
