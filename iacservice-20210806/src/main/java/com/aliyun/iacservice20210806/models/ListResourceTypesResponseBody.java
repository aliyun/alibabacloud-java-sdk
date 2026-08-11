// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page. Valid values: 0 to 200. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9bcaac3c-420d-4303-87ab-7638c07b0a0b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of resources.</p>
     */
    @NameInMap("resourceTypes")
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>93</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceTypes(java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public ListResourceTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceTypesResponseBodyResourceTypes extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Route Table</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>专有网络VPC</p>
         */
        @NameInMap("productName")
        public String productName;

        /**
         * <p>The URL of the resource details page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://vpc.console.aliyun.com/vpc/$%7BRegionId%7D/route-tables/$%7BRouteTableId%7D">https://vpc.console.aliyun.com/vpc/${RegionId}/route-tables/${RouteTableId}</a></p>
         */
        @NameInMap("resourceDetailPageUrl")
        public String resourceDetailPageUrl;

        /**
         * <p>The URL of the resources page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://vpc.console.aliyun.com/vpc/$%7BRegionId%7D/route-tables">https://vpc.console.aliyun.com/vpc/${RegionId}/route-tables</a></p>
         */
        @NameInMap("resourceListPageUrl")
        public String resourceListPageUrl;

        /**
         * <p>The Alibaba Cloud resource type in the format of ALIYUN::\<cloud service>::\<resource type>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::VPC</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The version from which the resource status takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("statusStartVersion")
        public String statusStartVersion;

        /**
         * <p>The product subcategory in Terraform.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("subcategory")
        public String subcategory;

        /**
         * <p>Specifies whether Terraformer is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportTerraformer")
        public String supportTerraformer;

        /**
         * <p>The Terraform Provider version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.248.0</p>
         */
        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        /**
         * <p>The resource type in Terraform.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_route_table</p>
         */
        @NameInMap("terraformResourceType")
        public String terraformResourceType;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Route Table</p>
         */
        @NameInMap("title")
        public String title;

        public static ListResourceTypesResponseBodyResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypes self = new ListResourceTypesResponseBodyResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypesResponseBodyResourceTypes setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListResourceTypesResponseBodyResourceTypes setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceDetailPageUrl(String resourceDetailPageUrl) {
            this.resourceDetailPageUrl = resourceDetailPageUrl;
            return this;
        }
        public String getResourceDetailPageUrl() {
            return this.resourceDetailPageUrl;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceListPageUrl(String resourceListPageUrl) {
            this.resourceListPageUrl = resourceListPageUrl;
            return this;
        }
        public String getResourceListPageUrl() {
            return this.resourceListPageUrl;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypesResponseBodyResourceTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceTypesResponseBodyResourceTypes setStatusStartVersion(String statusStartVersion) {
            this.statusStartVersion = statusStartVersion;
            return this;
        }
        public String getStatusStartVersion() {
            return this.statusStartVersion;
        }

        public ListResourceTypesResponseBodyResourceTypes setSubcategory(String subcategory) {
            this.subcategory = subcategory;
            return this;
        }
        public String getSubcategory() {
            return this.subcategory;
        }

        public ListResourceTypesResponseBodyResourceTypes setSupportTerraformer(String supportTerraformer) {
            this.supportTerraformer = supportTerraformer;
            return this;
        }
        public String getSupportTerraformer() {
            return this.supportTerraformer;
        }

        public ListResourceTypesResponseBodyResourceTypes setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public ListResourceTypesResponseBodyResourceTypes setTerraformResourceType(String terraformResourceType) {
            this.terraformResourceType = terraformResourceType;
            return this;
        }
        public String getTerraformResourceType() {
            return this.terraformResourceType;
        }

        public ListResourceTypesResponseBodyResourceTypes setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
