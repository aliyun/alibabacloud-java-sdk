// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>9bcaac3c-420d-4303-87ab-7638c07b0a0b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceTypes")
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes;

    /**
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
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("product")
        public String product;

        @NameInMap("productName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://vpc.console.aliyun.com/vpc/$%7BRegionId%7D/route-tables/$%7BRouteTableId%7D">https://vpc.console.aliyun.com/vpc/${RegionId}/route-tables/${RouteTableId}</a></p>
         */
        @NameInMap("resourceDetailPageUrl")
        public String resourceDetailPageUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://vpc.console.aliyun.com/vpc/$%7BRegionId%7D/route-tables">https://vpc.console.aliyun.com/vpc/${RegionId}/route-tables</a></p>
         */
        @NameInMap("resourceListPageUrl")
        public String resourceListPageUrl;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("statusStartVersion")
        public String statusStartVersion;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("subcategory")
        public String subcategory;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportTerraformer")
        public String supportTerraformer;

        /**
         * <strong>example:</strong>
         * <p>1.248.0</p>
         */
        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        /**
         * <strong>example:</strong>
         * <p>alicloud_route_table</p>
         */
        @NameInMap("terraformResourceType")
        public String terraformResourceType;

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
