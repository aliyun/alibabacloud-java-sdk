// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("Resources")
    public java.util.List<ListResourcesResponseBodyResources> resources;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("tagKey")
        public String tagKey;

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
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("dependsOnResourceIds")
        public java.util.List<String> dependsOnResourceIds;

        @NameInMap("productCode")
        public String productCode;

        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("propertyVariables")
        public java.util.Map<String, ?> propertyVariables;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("resourceArn")
        public String resourceArn;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceName")
        public String resourceName;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListResourcesResponseBodyResourcesTags> tags;

        @NameInMap("terraformArn")
        public String terraformArn;

        @NameInMap("terraformCode")
        public String terraformCode;

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
