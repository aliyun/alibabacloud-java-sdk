// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupsResponseBody extends TeaModel {
    /**
     * <p>The returned group set.</p>
     */
    @NameInMap("ApiGroupAttributes")
    public DescribeApiGroupsResponseBodyApiGroupAttributes apiGroupAttributes;

    /**
     * <p>The number of pages to return the results on.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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

    public static class DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo self = new DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo> tagInfo;

        public static DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags self = new DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags setTagInfo(java.util.List<DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute extends TeaModel {
        /**
         * <p>The basepath.</p>
         */
        @NameInMap("BasePath")
        public String basePath;

        /**
         * <p>The billing status of the API group. Valid values:</p>
         * <br>
         * <p>*   **NORMAL**: The instance is normal.</p>
         * <p>*   **LOCKED**: The API group is locked due to overdue payments.</p>
         */
        @NameInMap("BillingStatus")
        public String billingStatus;

        /**
         * <p>The creation time (UTC) of the API group.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>Group Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The HTTPS security policy</p>
         */
        @NameInMap("HttpsPolicy")
        public String httpsPolicy;

        /**
         * <p>The validity status of the API group. Valid values:</p>
         * <br>
         * <p>*   **NORMAL**: The instance is normal.</p>
         * <p>*   **LOCKED**: The API group is locked because it is not valid.</p>
         */
        @NameInMap("IllegalStatus")
        public String illegalStatus;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The last modification time (UTC) of the API group.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The region to which the API group belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The second-level domain name that corresponds to the API group and is used by the CNAME of the custom domain name.</p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags tags;

        /**
         * <p>The upper QPS limit of the API group. The default value is 500. You can increase the upper limit by submitting an application.</p>
         */
        @NameInMap("TrafficLimit")
        public Integer trafficLimit;

        public static DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute self = new DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
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

        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttribute setTags(DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeApiGroupsResponseBodyApiGroupAttributesApiGroupAttributeTags getTags() {
            return this.tags;
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
