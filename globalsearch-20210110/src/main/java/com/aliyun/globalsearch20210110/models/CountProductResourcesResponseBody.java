// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class CountProductResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public CountProductResourcesResponseBodyResources resources;

    public static CountProductResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountProductResourcesResponseBody self = new CountProductResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public CountProductResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountProductResourcesResponseBody setResources(CountProductResourcesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public CountProductResourcesResponseBodyResources getResources() {
        return this.resources;
    }

    public static class CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Keys")
        public String keys;

        public static CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation build(java.util.Map<String, ?> map) throws Exception {
            CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation self = new CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation();
            return TeaModel.build(map, self);
        }

        public CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation setKeys(String keys) {
            this.keys = keys;
            return this;
        }
        public String getKeys() {
            return this.keys;
        }

    }

    public static class CountProductResourcesResponseBodyResourcesResourceAggregations extends TeaModel {
        @NameInMap("Aggregation")
        public java.util.List<CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation> aggregation;

        public static CountProductResourcesResponseBodyResourcesResourceAggregations build(java.util.Map<String, ?> map) throws Exception {
            CountProductResourcesResponseBodyResourcesResourceAggregations self = new CountProductResourcesResponseBodyResourcesResourceAggregations();
            return TeaModel.build(map, self);
        }

        public CountProductResourcesResponseBodyResourcesResourceAggregations setAggregation(java.util.List<CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation> aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public java.util.List<CountProductResourcesResponseBodyResourcesResourceAggregationsAggregation> getAggregation() {
            return this.aggregation;
        }

    }

    public static class CountProductResourcesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Aggregations")
        public CountProductResourcesResponseBodyResourcesResourceAggregations aggregations;

        @NameInMap("Product")
        public String product;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Total")
        public String total;

        public static CountProductResourcesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            CountProductResourcesResponseBodyResourcesResource self = new CountProductResourcesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public CountProductResourcesResponseBodyResourcesResource setAggregations(CountProductResourcesResponseBodyResourcesResourceAggregations aggregations) {
            this.aggregations = aggregations;
            return this;
        }
        public CountProductResourcesResponseBodyResourcesResourceAggregations getAggregations() {
            return this.aggregations;
        }

        public CountProductResourcesResponseBodyResourcesResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public CountProductResourcesResponseBodyResourcesResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CountProductResourcesResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CountProductResourcesResponseBodyResourcesResource setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

    public static class CountProductResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<CountProductResourcesResponseBodyResourcesResource> resource;

        public static CountProductResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            CountProductResourcesResponseBodyResources self = new CountProductResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public CountProductResourcesResponseBodyResources setResource(java.util.List<CountProductResourcesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<CountProductResourcesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
