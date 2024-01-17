// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailResponseBody extends TeaModel {
    @NameInMap("BillingStatus")
    public String billingStatus;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainItems")
    public DescribeApiGroupDetailResponseBodyDomainItems domainItems;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IllegalStatus")
    public String illegalStatus;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

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

    public static DescribeApiGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailResponseBody self = new DescribeApiGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailResponseBody setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }
    public String getBillingStatus() {
        return this.billingStatus;
    }

    public DescribeApiGroupDetailResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiGroupDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiGroupDetailResponseBody setDomainItems(DescribeApiGroupDetailResponseBodyDomainItems domainItems) {
        this.domainItems = domainItems;
        return this;
    }
    public DescribeApiGroupDetailResponseBodyDomainItems getDomainItems() {
        return this.domainItems;
    }

    public DescribeApiGroupDetailResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupDetailResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiGroupDetailResponseBody setIllegalStatus(String illegalStatus) {
        this.illegalStatus = illegalStatus;
        return this;
    }
    public String getIllegalStatus() {
        return this.illegalStatus;
    }

    public DescribeApiGroupDetailResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiGroupDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGroupDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApiGroupDetailResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeApiGroupDetailResponseBody setTrafficLimit(Integer trafficLimit) {
        this.trafficLimit = trafficLimit;
        return this;
    }
    public Integer getTrafficLimit() {
        return this.trafficLimit;
    }

    public static class DescribeApiGroupDetailResponseBodyDomainItemsDomainItem extends TeaModel {
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

        public static DescribeApiGroupDetailResponseBodyDomainItemsDomainItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailResponseBodyDomainItemsDomainItem self = new DescribeApiGroupDetailResponseBodyDomainItemsDomainItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainNameResolution(String domainNameResolution) {
            this.domainNameResolution = domainNameResolution;
            return this;
        }
        public String getDomainNameResolution() {
            return this.domainNameResolution;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

    }

    public static class DescribeApiGroupDetailResponseBodyDomainItems extends TeaModel {
        @NameInMap("DomainItem")
        public java.util.List<DescribeApiGroupDetailResponseBodyDomainItemsDomainItem> domainItem;

        public static DescribeApiGroupDetailResponseBodyDomainItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailResponseBodyDomainItems self = new DescribeApiGroupDetailResponseBodyDomainItems();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailResponseBodyDomainItems setDomainItem(java.util.List<DescribeApiGroupDetailResponseBodyDomainItemsDomainItem> domainItem) {
            this.domainItem = domainItem;
            return this;
        }
        public java.util.List<DescribeApiGroupDetailResponseBodyDomainItemsDomainItem> getDomainItem() {
            return this.domainItem;
        }

    }

}
