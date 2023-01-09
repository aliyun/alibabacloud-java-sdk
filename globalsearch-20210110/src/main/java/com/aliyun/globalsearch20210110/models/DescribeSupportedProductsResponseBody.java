// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeSupportedProductsResponseBody extends TeaModel {
    @NameInMap("Products")
    public DescribeSupportedProductsResponseBodyProducts products;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupportedProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedProductsResponseBody self = new DescribeSupportedProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedProductsResponseBody setProducts(DescribeSupportedProductsResponseBodyProducts products) {
        this.products = products;
        return this;
    }
    public DescribeSupportedProductsResponseBodyProducts getProducts() {
        return this.products;
    }

    public DescribeSupportedProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SupportReleased")
        public String supportReleased;

        public static DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType self = new DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType setSupportReleased(String supportReleased) {
            this.supportReleased = supportReleased;
            return this;
        }
        public String getSupportReleased() {
            return this.supportReleased;
        }

    }

    public static class DescribeSupportedProductsResponseBodyProductsProductResourceTypes extends TeaModel {
        @NameInMap("ResourceType")
        public java.util.List<DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType> resourceType;

        public static DescribeSupportedProductsResponseBodyProductsProductResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedProductsResponseBodyProductsProductResourceTypes self = new DescribeSupportedProductsResponseBodyProductsProductResourceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedProductsResponseBodyProductsProductResourceTypes setResourceType(java.util.List<DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public java.util.List<DescribeSupportedProductsResponseBodyProductsProductResourceTypesResourceType> getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeSupportedProductsResponseBodyProductsProduct extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Product")
        public String product;

        @NameInMap("ResourceTypes")
        public DescribeSupportedProductsResponseBodyProductsProductResourceTypes resourceTypes;

        public static DescribeSupportedProductsResponseBodyProductsProduct build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedProductsResponseBodyProductsProduct self = new DescribeSupportedProductsResponseBodyProductsProduct();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedProductsResponseBodyProductsProduct setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSupportedProductsResponseBodyProductsProduct setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeSupportedProductsResponseBodyProductsProduct setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeSupportedProductsResponseBodyProductsProduct setResourceTypes(DescribeSupportedProductsResponseBodyProductsProductResourceTypes resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public DescribeSupportedProductsResponseBodyProductsProductResourceTypes getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class DescribeSupportedProductsResponseBodyProducts extends TeaModel {
        @NameInMap("Product")
        public java.util.List<DescribeSupportedProductsResponseBodyProductsProduct> product;

        public static DescribeSupportedProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedProductsResponseBodyProducts self = new DescribeSupportedProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedProductsResponseBodyProducts setProduct(java.util.List<DescribeSupportedProductsResponseBodyProductsProduct> product) {
            this.product = product;
            return this;
        }
        public java.util.List<DescribeSupportedProductsResponseBodyProductsProduct> getProduct() {
            return this.product;
        }

    }

}
