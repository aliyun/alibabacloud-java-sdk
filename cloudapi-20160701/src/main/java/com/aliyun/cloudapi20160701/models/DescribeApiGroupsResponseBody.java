// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiGroupsResponseBody extends TeaModel {
    @NameInMap("ApiGroupAttributes")
    public DescribeApiGroupsResponseBodyApiGroupAttributes apiGroupAttributes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApiGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupsResponseBody self = new DescribeApiGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupsResponseBody setApiGroupAttributes(DescribeApiGroupsResponseBodyApiGroupAttributes apiGroupAttributes) {
        this.apiGroupAttributes = apiGroupAttributes;
        return this;
    }
    public DescribeApiGroupsResponseBodyApiGroupAttributes getApiGroupAttributes() {
        return this.apiGroupAttributes;
    }

    public DescribeApiGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute extends TeaModel {
        @NameInMap("BillingStatus")
        public String billingStatus;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HttpsPolicy")
        public String httpsPolicy;

        @NameInMap("IllegalStatus")
        public String illegalStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("TrafficLimit")
        public Integer trafficLimit;

        public static DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute self = new DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setBillingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }
        public String getBillingStatus() {
            return this.billingStatus;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setHttpsPolicy(String httpsPolicy) {
            this.httpsPolicy = httpsPolicy;
            return this;
        }
        public String getHttpsPolicy() {
            return this.httpsPolicy;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setIllegalStatus(String illegalStatus) {
            this.illegalStatus = illegalStatus;
            return this;
        }
        public String getIllegalStatus() {
            return this.illegalStatus;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setTrafficLimit(Integer trafficLimit) {
            this.trafficLimit = trafficLimit;
            return this;
        }
        public Integer getTrafficLimit() {
            return this.trafficLimit;
        }

    }

    public static class DescribeApiGroupsResponseBodyApiGroupAttributes extends TeaModel {
        @NameInMap("ApiGroupAttribute")
        public java.util.List<DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute> apiGroupAttribute;

        public static DescribeApiGroupsResponseBodyApiGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupsResponseBodyApiGroupAttributes self = new DescribeApiGroupsResponseBodyApiGroupAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributes setApiGroupAttribute(java.util.List<DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute> apiGroupAttribute) {
            this.apiGroupAttribute = apiGroupAttribute;
            return this;
        }
        public java.util.List<DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute> getApiGroupAttribute() {
            return this.apiGroupAttribute;
        }

    }

}
