// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListResourceCategoriesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListResourceCategoriesResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE43C4CB-8074-5EBD-9806-8CA6D12800B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListResourceCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceCategoriesResponseBody self = new ListResourceCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceCategoriesResponseBody setData(ListResourceCategoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListResourceCategoriesResponseBodyData getData() {
        return this.data;
    }

    public ListResourceCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourceCategoriesResponseBodyDataContentResourceCount extends TeaModel {
        /**
         * <p>The number of resources of each type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListResourceCategoriesResponseBodyDataContentResourceCount build(java.util.Map<String, ?> map) throws Exception {
            ListResourceCategoriesResponseBodyDataContentResourceCount self = new ListResourceCategoriesResponseBodyDataContentResourceCount();
            return TeaModel.build(map, self);
        }

        public ListResourceCategoriesResponseBodyDataContentResourceCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListResourceCategoriesResponseBodyDataContentResourceCount setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListResourceCategoriesResponseBodyDataContent extends TeaModel {
        /**
         * <p>The applicable product type. If this parameter is empty, all products are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The resource category ID, which is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-123***7890</p>
         */
        @NameInMap("ResourceCategoryId")
        public String resourceCategoryId;

        /**
         * <p>The resource name, which is unique within the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>My***ResourceCategory</p>
         */
        @NameInMap("ResourceCategoryName")
        public String resourceCategoryName;

        /**
         * <p>The resource category type. Valid values:</p>
         * <ul>
         * <li><p>DEFAULT: default group created by the system, cannot be deleted.</p>
         * </li>
         * <li><p>CUSTOM: custom group, can be deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("ResourceCategoryType")
        public String resourceCategoryType;

        /**
         * <p>The number of resources of each type.</p>
         */
        @NameInMap("ResourceCount")
        public java.util.List<ListResourceCategoriesResponseBodyDataContentResourceCount> resourceCount;

        /**
         * <p>The resource matcher. If this parameter is empty, no resources are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;BOOL\&quot;,\&quot;operator\&quot;:\&quot;AND\&quot;,\&quot;values\&quot;:[{\&quot;type\&quot;:\&quot;TAG\&quot;,\&quot;key\&quot;:\&quot;createdBy\&quot;,\&quot;operator\&quot;:\&quot;EQUAL\&quot;,\&quot;values\&quot;:[\&quot;me\&quot;]}]}</p>
         */
        @NameInMap("ResourceMatcher")
        public String resourceMatcher;

        /**
         * <p>The applicable resource type. If this parameter is empty, all resources are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListResourceCategoriesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListResourceCategoriesResponseBodyDataContent self = new ListResourceCategoriesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListResourceCategoriesResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListResourceCategoriesResponseBodyDataContent setResourceCategoryId(String resourceCategoryId) {
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }
        public String getResourceCategoryId() {
            return this.resourceCategoryId;
        }

        public ListResourceCategoriesResponseBodyDataContent setResourceCategoryName(String resourceCategoryName) {
            this.resourceCategoryName = resourceCategoryName;
            return this;
        }
        public String getResourceCategoryName() {
            return this.resourceCategoryName;
        }

        public ListResourceCategoriesResponseBodyDataContent setResourceCategoryType(String resourceCategoryType) {
            this.resourceCategoryType = resourceCategoryType;
            return this;
        }
        public String getResourceCategoryType() {
            return this.resourceCategoryType;
        }

        public ListResourceCategoriesResponseBodyDataContent setResourceCount(java.util.List<ListResourceCategoriesResponseBodyDataContentResourceCount> resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public java.util.List<ListResourceCategoriesResponseBodyDataContentResourceCount> getResourceCount() {
            return this.resourceCount;
        }

        public ListResourceCategoriesResponseBodyDataContent setResourceMatcher(String resourceMatcher) {
            this.resourceMatcher = resourceMatcher;
            return this;
        }
        public String getResourceMatcher() {
            return this.resourceMatcher;
        }

        public ListResourceCategoriesResponseBodyDataContent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListResourceCategoriesResponseBodyData extends TeaModel {
        /**
         * <p>The collection of records returned in this request.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListResourceCategoriesResponseBodyDataContent> content;

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>Indicates the position where the current call returns data from. An empty value indicates that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>eKDyCM0zFQ5op7jVMWmNNA==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of data entries under the current request conditions. This parameter is optional and can be left unspecified by default.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListResourceCategoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceCategoriesResponseBodyData self = new ListResourceCategoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourceCategoriesResponseBodyData setContent(java.util.List<ListResourceCategoriesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListResourceCategoriesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListResourceCategoriesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListResourceCategoriesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListResourceCategoriesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
