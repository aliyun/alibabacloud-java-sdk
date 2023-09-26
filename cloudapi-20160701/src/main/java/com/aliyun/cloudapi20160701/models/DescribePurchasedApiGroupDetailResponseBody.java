// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupDetailResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainItems")
    public DescribePurchasedApiGroupDetailResponseBodyDomainItems domainItems;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribePurchasedApiGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupDetailResponseBody self = new DescribePurchasedApiGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupDetailResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribePurchasedApiGroupDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePurchasedApiGroupDetailResponseBody setDomainItems(DescribePurchasedApiGroupDetailResponseBodyDomainItems domainItems) {
        this.domainItems = domainItems;
        return this;
    }
    public DescribePurchasedApiGroupDetailResponseBodyDomainItems getDomainItems() {
        return this.domainItems;
    }

    public DescribePurchasedApiGroupDetailResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedApiGroupDetailResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribePurchasedApiGroupDetailResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribePurchasedApiGroupDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePurchasedApiGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedApiGroupDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        public static DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem self = new DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribePurchasedApiGroupDetailResponseBodyDomainItems extends TeaModel {
        @NameInMap("DomainItem")
        public java.util.List<DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem> domainItem;

        public static DescribePurchasedApiGroupDetailResponseBodyDomainItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupDetailResponseBodyDomainItems self = new DescribePurchasedApiGroupDetailResponseBodyDomainItems();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupDetailResponseBodyDomainItems setDomainItem(java.util.List<DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem> domainItem) {
            this.domainItem = domainItem;
            return this;
        }
        public java.util.List<DescribePurchasedApiGroupDetailResponseBodyDomainItemsDomainItem> getDomainItem() {
            return this.domainItem;
        }

    }

}
