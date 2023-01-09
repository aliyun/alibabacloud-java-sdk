// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeResourceRecommendFiltersResponseBody extends TeaModel {
    @NameInMap("RecommendFilters")
    public DescribeResourceRecommendFiltersResponseBodyRecommendFilters recommendFilters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceRecommendFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceRecommendFiltersResponseBody self = new DescribeResourceRecommendFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceRecommendFiltersResponseBody setRecommendFilters(DescribeResourceRecommendFiltersResponseBodyRecommendFilters recommendFilters) {
        this.recommendFilters = recommendFilters;
        return this;
    }
    public DescribeResourceRecommendFiltersResponseBodyRecommendFilters getRecommendFilters() {
        return this.recommendFilters;
    }

    public DescribeResourceRecommendFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValue")
        public String attributeValue;

        @NameInMap("Product")
        public String product;

        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter self = new DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter();
            return TeaModel.build(map, self);
        }

        public DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeResourceRecommendFiltersResponseBodyRecommendFilters extends TeaModel {
        @NameInMap("RecommendFilter")
        public java.util.List<DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter> recommendFilter;

        public static DescribeResourceRecommendFiltersResponseBodyRecommendFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceRecommendFiltersResponseBodyRecommendFilters self = new DescribeResourceRecommendFiltersResponseBodyRecommendFilters();
            return TeaModel.build(map, self);
        }

        public DescribeResourceRecommendFiltersResponseBodyRecommendFilters setRecommendFilter(java.util.List<DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter> recommendFilter) {
            this.recommendFilter = recommendFilter;
            return this;
        }
        public java.util.List<DescribeResourceRecommendFiltersResponseBodyRecommendFiltersRecommendFilter> getRecommendFilter() {
            return this.recommendFilter;
        }

    }

}
