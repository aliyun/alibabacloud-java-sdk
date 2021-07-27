// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("resources")
    public java.util.List<ListResourcesResponseBodyResources> resources;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListResourcesResponseBody setResources(java.util.List<ListResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListResourcesResponseBodyResources extends TeaModel {
        @NameInMap("productCode")
        public String productCode;

        @NameInMap("resourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceAttributes")
        public String resourceAttributes;

        public static ListResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResources self = new ListResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResources setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListResourcesResponseBodyResources setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public ListResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesResponseBodyResources setResourceAttributes(String resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public String getResourceAttributes() {
            return this.resourceAttributes;
        }

    }

}
