// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Domains")
    public DescribePurchasedApiGroupResponseBodyDomains domains;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PurchasedTime")
    public String purchasedTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

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
