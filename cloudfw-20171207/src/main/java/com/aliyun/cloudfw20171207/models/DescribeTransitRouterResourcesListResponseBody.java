// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterResourcesListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A61A2516-0A22-5B3F-986B-3D4BF2A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterAttachedResources")
    public java.util.List<DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources> transitRouterAttachedResources;

    public static DescribeTransitRouterResourcesListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterResourcesListResponseBody self = new DescribeTransitRouterResourcesListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterResourcesListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitRouterResourcesListResponseBody setTransitRouterAttachedResources(java.util.List<DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources> transitRouterAttachedResources) {
        this.transitRouterAttachedResources = transitRouterAttachedResources;
        return this;
    }
    public java.util.List<DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources> getTransitRouterAttachedResources() {
        return this.transitRouterAttachedResources;
    }

    public static class DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eas-r-8k1a6jjofkp0cq****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources self = new DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeTransitRouterResourcesListResponseBodyTransitRouterAttachedResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
