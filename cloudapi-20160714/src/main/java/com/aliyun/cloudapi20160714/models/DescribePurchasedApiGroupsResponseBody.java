// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The attributes of the API group.</p>
     */
    @NameInMap("PurchasedApiGroupAttributes")
    public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes purchasedApiGroupAttributes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36BBBAD4-1CFB-489F-841A-8CA52EEA787E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAID</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>The description of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the API group expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-19T00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>8e91f23f88f94348855b82c9a73209f3</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The maximum number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InvokeTimesMax")
        public Long invokeTimesMax;

        /**
         * <p>The current number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InvokeTimesNow")
        public Long invokeTimesNow;

        /**
         * <p>The time when the API group was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-19T00:00:00</p>
         */
        @NameInMap("PurchasedTime")
        public String purchasedTime;

        /**
         * <p>The ID of the region where the API group is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the API group.</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The API group is normal.</li>
         * <li><strong>DELETE</strong>: The API group is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

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

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
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

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setPurchasedTime(String purchasedTime) {
            this.purchasedTime = purchasedTime;
            return this;
        }
        public String getPurchasedTime() {
            return this.purchasedTime;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
