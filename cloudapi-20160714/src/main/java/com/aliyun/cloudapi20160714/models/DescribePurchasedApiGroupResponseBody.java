// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupResponseBody extends TeaModel {
    /**
     * <p>The description of the API group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of domain names.</p>
     */
    @NameInMap("Domains")
    public DescribePurchasedApiGroupResponseBodyDomains domains;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the API group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The time when the API group was purchased.</p>
     */
    @NameInMap("PurchasedTime")
    public String purchasedTime;

    /**
     * <p>The region where the API group is located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the API group.</p>
     * <br>
     * <p>*   **NORMAL**: The API group is normal.</p>
     * <p>*   **DELETE**: The API group is deleted.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribePurchasedApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupResponseBody self = new DescribePurchasedApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePurchasedApiGroupResponseBody setDomains(DescribePurchasedApiGroupResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribePurchasedApiGroupResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribePurchasedApiGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedApiGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribePurchasedApiGroupResponseBody setPurchasedTime(String purchasedTime) {
        this.purchasedTime = purchasedTime;
        return this;
    }
    public String getPurchasedTime() {
        return this.purchasedTime;
    }

    public DescribePurchasedApiGroupResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePurchasedApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedApiGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribePurchasedApiGroupResponseBodyDomainsDomainItem extends TeaModel {
        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static DescribePurchasedApiGroupResponseBodyDomainsDomainItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupResponseBodyDomainsDomainItem self = new DescribePurchasedApiGroupResponseBodyDomainsDomainItem();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupResponseBodyDomainsDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribePurchasedApiGroupResponseBodyDomains extends TeaModel {
        @NameInMap("DomainItem")
        public java.util.List<DescribePurchasedApiGroupResponseBodyDomainsDomainItem> domainItem;

        public static DescribePurchasedApiGroupResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupResponseBodyDomains self = new DescribePurchasedApiGroupResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupResponseBodyDomains setDomainItem(java.util.List<DescribePurchasedApiGroupResponseBodyDomainsDomainItem> domainItem) {
            this.domainItem = domainItem;
            return this;
        }
        public java.util.List<DescribePurchasedApiGroupResponseBodyDomainsDomainItem> getDomainItem() {
            return this.domainItem;
        }

    }

}
