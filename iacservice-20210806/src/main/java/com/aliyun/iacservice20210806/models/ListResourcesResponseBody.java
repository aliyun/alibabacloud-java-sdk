// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("Resources")
    public java.util.List<ListResourcesResponseBodyResources> resources;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>67585D9B-EFA5-5E51-BAB1-8FF07DA1B36F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setResources(java.util.List<ListResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public ListResourcesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourcesResponseBodyResourcesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListResourcesResponseBodyResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesTags self = new ListResourcesResponseBodyResourcesTags();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListResourcesResponseBodyResourcesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListResourcesResponseBodyResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>365845</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>2024-05-03T02:22:59Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("dependsOnResourceIds")
        public java.util.List<String> dependsOnResourceIds;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("productCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("propertyVariables")
        public java.util.Map<String, ?> propertyVariables;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>acs:vpc:cn-hangzhou:12345:test</p>
         */
        @NameInMap("resourceArn")
        public String resourceArn;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzyqyghofqbxy</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>i-efegsewrttfd</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        @NameInMap("resourcePageUrl")
        public String resourcePageUrl;

        /**
         * <strong>example:</strong>
         * <p>Task</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListResourcesResponseBodyResourcesTags> tags;

        /**
         * <p>terraform arn</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_vpc</p>
         */
        @NameInMap("terraformArn")
        public String terraformArn;

        /**
         * <p>terraform code</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_vpc</p>
         */
        @NameInMap("terraformCode")
        public String terraformCode;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResources self = new ListResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResources setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourcesResponseBodyResources setDependsOnResourceIds(java.util.List<String> dependsOnResourceIds) {
            this.dependsOnResourceIds = dependsOnResourceIds;
            return this;
        }
        public java.util.List<String> getDependsOnResourceIds() {
            return this.dependsOnResourceIds;
        }

        public ListResourcesResponseBodyResources setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListResourcesResponseBodyResources setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ListResourcesResponseBodyResources setPropertyVariables(java.util.Map<String, ?> propertyVariables) {
            this.propertyVariables = propertyVariables;
            return this;
        }
        public java.util.Map<String, ?> getPropertyVariables() {
            return this.propertyVariables;
        }

        public ListResourcesResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourcesResponseBodyResources setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public ListResourcesResponseBodyResources setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListResourcesResponseBodyResources setResourcePageUrl(String resourcePageUrl) {
            this.resourcePageUrl = resourcePageUrl;
            return this;
        }
        public String getResourcePageUrl() {
            return this.resourcePageUrl;
        }

        public ListResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesResponseBodyResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourcesResponseBodyResources setTags(java.util.List<ListResourcesResponseBodyResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyResourcesTags> getTags() {
            return this.tags;
        }

        public ListResourcesResponseBodyResources setTerraformArn(String terraformArn) {
            this.terraformArn = terraformArn;
            return this;
        }
        public String getTerraformArn() {
            return this.terraformArn;
        }

        public ListResourcesResponseBodyResources setTerraformCode(String terraformCode) {
            this.terraformCode = terraformCode;
            return this;
        }
        public String getTerraformCode() {
            return this.terraformCode;
        }

        public ListResourcesResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
