// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetResourceCategoryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetResourceCategoryResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE43C4CB-8074-5EBD-9806-8CA6D12800B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCategoryResponseBody self = new GetResourceCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceCategoryResponseBody setData(GetResourceCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetResourceCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceCategoryResponseBodyDataResourceCount extends TeaModel {
        /**
         * <p>Number of resources by type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetResourceCategoryResponseBodyDataResourceCount build(java.util.Map<String, ?> map) throws Exception {
            GetResourceCategoryResponseBodyDataResourceCount self = new GetResourceCategoryResponseBodyDataResourceCount();
            return TeaModel.build(map, self);
        }

        public GetResourceCategoryResponseBodyDataResourceCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetResourceCategoryResponseBodyDataResourceCount setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetResourceCategoryResponseBodyData extends TeaModel {
        /**
         * <p>Applicable product type. If empty, matches all products.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>Resource category ID, globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-123***7890</p>
         */
        @NameInMap("ResourceCategoryId")
        public String resourceCategoryId;

        /**
         * <p>Resource name, unique within the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>My***ResourceCategory</p>
         */
        @NameInMap("ResourceCategoryName")
        public String resourceCategoryName;

        /**
         * <p>Resource category type. Valid values:</p>
         * <ul>
         * <li><p>DEFAULT: default group, created by the system, cannot be deleted.</p>
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
         * <p>Number of resources by type.</p>
         */
        @NameInMap("ResourceCount")
        public java.util.List<GetResourceCategoryResponseBodyDataResourceCount> resourceCount;

        /**
         * <p>Resource matcher. If empty, no resources are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;BOOL\&quot;,\&quot;operator\&quot;:\&quot;AND\&quot;,\&quot;values\&quot;:[{\&quot;type\&quot;:\&quot;TAG\&quot;,\&quot;key\&quot;:\&quot;createdBy\&quot;,\&quot;operator\&quot;:\&quot;EQUAL\&quot;,\&quot;values\&quot;:[\&quot;me\&quot;]}]}</p>
         */
        @NameInMap("ResourceMatcher")
        public String resourceMatcher;

        /**
         * <p>Applicable resource type. If empty, matches all resources.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetResourceCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceCategoryResponseBodyData self = new GetResourceCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceCategoryResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetResourceCategoryResponseBodyData setResourceCategoryId(String resourceCategoryId) {
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }
        public String getResourceCategoryId() {
            return this.resourceCategoryId;
        }

        public GetResourceCategoryResponseBodyData setResourceCategoryName(String resourceCategoryName) {
            this.resourceCategoryName = resourceCategoryName;
            return this;
        }
        public String getResourceCategoryName() {
            return this.resourceCategoryName;
        }

        public GetResourceCategoryResponseBodyData setResourceCategoryType(String resourceCategoryType) {
            this.resourceCategoryType = resourceCategoryType;
            return this;
        }
        public String getResourceCategoryType() {
            return this.resourceCategoryType;
        }

        public GetResourceCategoryResponseBodyData setResourceCount(java.util.List<GetResourceCategoryResponseBodyDataResourceCount> resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public java.util.List<GetResourceCategoryResponseBodyDataResourceCount> getResourceCount() {
            return this.resourceCount;
        }

        public GetResourceCategoryResponseBodyData setResourceMatcher(String resourceMatcher) {
            this.resourceMatcher = resourceMatcher;
            return this;
        }
        public String getResourceMatcher() {
            return this.resourceMatcher;
        }

        public GetResourceCategoryResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
