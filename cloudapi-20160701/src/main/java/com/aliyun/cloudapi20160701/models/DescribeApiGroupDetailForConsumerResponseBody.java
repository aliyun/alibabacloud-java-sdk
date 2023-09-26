// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailForConsumerResponseBody extends TeaModel {
    @NameInMap("BillingStatus")
    public String billingStatus;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainItems")
    public DescribeApiGroupDetailForConsumerResponseBodyDomainItems domainItems;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IllegalStatus")
    public String illegalStatus;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("Purchased")
    public String purchased;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("TrafficLimit")
    public Integer trafficLimit;

    public static DescribeApiGroupDetailForConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailForConsumerResponseBody self = new DescribeApiGroupDetailForConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailForConsumerResponseBody setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }
    public String getBillingStatus() {
        return this.billingStatus;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setDomainItems(DescribeApiGroupDetailForConsumerResponseBodyDomainItems domainItems) {
        this.domainItems = domainItems;
        return this;
    }
    public DescribeApiGroupDetailForConsumerResponseBodyDomainItems getDomainItems() {
        return this.domainItems;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setIllegalStatus(String illegalStatus) {
        this.illegalStatus = illegalStatus;
        return this;
    }
    public String getIllegalStatus() {
        return this.illegalStatus;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setPurchased(String purchased) {
        this.purchased = purchased;
        return this;
    }
    public String getPurchased() {
        return this.purchased;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeApiGroupDetailForConsumerResponseBody setTrafficLimit(Integer trafficLimit) {
        this.trafficLimit = trafficLimit;
        return this;
    }
    public Integer getTrafficLimit() {
        return this.trafficLimit;
    }

    public static class DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("CertificateName")
        public String certificateName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameResolution")
        public String domainNameResolution;

        @NameInMap("DomainStatus")
        public String domainStatus;

        public static DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem self = new DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem setDomainNameResolution(String domainNameResolution) {
            this.domainNameResolution = domainNameResolution;
            return this;
        }
        public String getDomainNameResolution() {
            return this.domainNameResolution;
        }

        public DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

    }

    public static class DescribeApiGroupDetailForConsumerResponseBodyDomainItems extends TeaModel {
        @NameInMap("DomainItem")
        public java.util.List<DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem> domainItem;

        public static DescribeApiGroupDetailForConsumerResponseBodyDomainItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailForConsumerResponseBodyDomainItems self = new DescribeApiGroupDetailForConsumerResponseBodyDomainItems();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailForConsumerResponseBodyDomainItems setDomainItem(java.util.List<DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem> domainItem) {
            this.domainItem = domainItem;
            return this;
        }
        public java.util.List<DescribeApiGroupDetailForConsumerResponseBodyDomainItemsDomainItem> getDomainItem() {
            return this.domainItem;
        }

    }

}
