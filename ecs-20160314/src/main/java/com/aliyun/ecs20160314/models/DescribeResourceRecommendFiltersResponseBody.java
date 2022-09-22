// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceRecommendFiltersResponseBody extends TeaModel {
    @NameInMap("RecommendFilters")
    public RecommendFilters recommendFilters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceRecommendFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceRecommendFiltersResponseBody self = new DescribeResourceRecommendFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceRecommendFiltersResponseBody setRecommendFilters(RecommendFilters recommendFilters) {
        this.recommendFilters = recommendFilters;
        return this;
    }
    public RecommendFilters getRecommendFilters() {
        return this.recommendFilters;
    }

    public DescribeResourceRecommendFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecommendFilter extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValue")
        public String attributeValue;

        @NameInMap("Product")
        public String product;

        @NameInMap("ResourceType")
        public String resourceType;

        public static RecommendFilter build(java.util.Map<String, ?> map) throws Exception {
            RecommendFilter self = new RecommendFilter();
            return TeaModel.build(map, self);
        }

        public RecommendFilter setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public RecommendFilter setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public RecommendFilter setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public RecommendFilter setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class RecommendFilters extends TeaModel {
        @NameInMap("RecommendFilter")
        public java.util.List<RecommendFilter> recommendFilter;

        public static RecommendFilters build(java.util.Map<String, ?> map) throws Exception {
            RecommendFilters self = new RecommendFilters();
            return TeaModel.build(map, self);
        }

        public RecommendFilters setRecommendFilter(java.util.List<RecommendFilter> recommendFilter) {
            this.recommendFilter = recommendFilter;
            return this;
        }
        public java.util.List<RecommendFilter> getRecommendFilter() {
            return this.recommendFilter;
        }

    }

}
