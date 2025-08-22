// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9bcaac3c-420d-4303-87ab-7638c07b0a0b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceType")
    public GetResourceTypeResponseBodyResourceType resourceType;

    public static GetResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponseBody self = new GetResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeResponseBody setResourceType(GetResourceTypeResponseBodyResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public GetResourceTypeResponseBodyResourceType getResourceType() {
        return this.resourceType;
    }

    public static class GetResourceTypeResponseBodyResourceTypeOperations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CreateVSwitch</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>2016-04-28</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <strong>example:</strong>
         * <p>Write</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <p>serviceCode</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        @NameInMap("serviceCode")
        public String serviceCode;

        public static GetResourceTypeResponseBodyResourceTypeOperations build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeOperations self = new GetResourceTypeResponseBodyResourceTypeOperations();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeOperations setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetResourceTypeResponseBodyResourceTypeOperations setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetResourceTypeResponseBodyResourceTypeOperations setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetResourceTypeResponseBodyResourceTypeOperations setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

    }

    public static class GetResourceTypeResponseBodyResourceType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("operations")
        public java.util.List<GetResourceTypeResponseBodyResourceTypeOperations> operations;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("product")
        public String product;

        @NameInMap("productName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("productNameEn")
        public String productNameEn;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

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
         * <p>1.227.0</p>
         */
        @NameInMap("statusStartVersion")
        public String statusStartVersion;

        /**
         * <strong>example:</strong>
         * <p>network</p>
         */
        @NameInMap("subcategory")
        public String subcategory;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportExported")
        public Boolean supportExported;

        /**
         * <strong>example:</strong>
         * <p>1.227.0</p>
         */
        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        /**
         * <strong>example:</strong>
         * <p>alicloud_vpc</p>
         */
        @NameInMap("terraformResourceType")
        public String terraformResourceType;

        @NameInMap("title")
        public String title;

        public static GetResourceTypeResponseBodyResourceType build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceType self = new GetResourceTypeResponseBodyResourceType();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceTypeResponseBodyResourceType setOperations(java.util.List<GetResourceTypeResponseBodyResourceTypeOperations> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<GetResourceTypeResponseBodyResourceTypeOperations> getOperations() {
            return this.operations;
        }

        public GetResourceTypeResponseBodyResourceType setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetResourceTypeResponseBodyResourceType setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetResourceTypeResponseBodyResourceType setProductNameEn(String productNameEn) {
            this.productNameEn = productNameEn;
            return this;
        }
        public String getProductNameEn() {
            return this.productNameEn;
        }

        public GetResourceTypeResponseBodyResourceType setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public GetResourceTypeResponseBodyResourceType setResourceDetailPageUrl(String resourceDetailPageUrl) {
            this.resourceDetailPageUrl = resourceDetailPageUrl;
            return this;
        }
        public String getResourceDetailPageUrl() {
            return this.resourceDetailPageUrl;
        }

        public GetResourceTypeResponseBodyResourceType setResourceListPageUrl(String resourceListPageUrl) {
            this.resourceListPageUrl = resourceListPageUrl;
            return this;
        }
        public String getResourceListPageUrl() {
            return this.resourceListPageUrl;
        }

        public GetResourceTypeResponseBodyResourceType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceTypeResponseBodyResourceType setStatusStartVersion(String statusStartVersion) {
            this.statusStartVersion = statusStartVersion;
            return this;
        }
        public String getStatusStartVersion() {
            return this.statusStartVersion;
        }

        public GetResourceTypeResponseBodyResourceType setSubcategory(String subcategory) {
            this.subcategory = subcategory;
            return this;
        }
        public String getSubcategory() {
            return this.subcategory;
        }

        public GetResourceTypeResponseBodyResourceType setSupportExported(Boolean supportExported) {
            this.supportExported = supportExported;
            return this;
        }
        public Boolean getSupportExported() {
            return this.supportExported;
        }

        public GetResourceTypeResponseBodyResourceType setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public GetResourceTypeResponseBodyResourceType setTerraformResourceType(String terraformResourceType) {
            this.terraformResourceType = terraformResourceType;
            return this;
        }
        public String getTerraformResourceType() {
            return this.terraformResourceType;
        }

        public GetResourceTypeResponseBodyResourceType setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
