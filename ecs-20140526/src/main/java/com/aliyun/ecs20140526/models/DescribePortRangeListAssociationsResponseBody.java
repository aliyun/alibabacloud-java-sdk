// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListAssociationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PortRangeListAssociations")
    public java.util.List<DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations> portRangeListAssociations;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortRangeListAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListAssociationsResponseBody self = new DescribePortRangeListAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePortRangeListAssociationsResponseBody setPortRangeListAssociations(java.util.List<DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations> portRangeListAssociations) {
        this.portRangeListAssociations = portRangeListAssociations;
        return this;
    }
    public java.util.List<DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations> getPortRangeListAssociations() {
        return this.portRangeListAssociations;
    }

    public DescribePortRangeListAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sg-2zefu72****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>SecurityGroup</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations build(java.util.Map<String, ?> map) throws Exception {
            DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations self = new DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations();
            return TeaModel.build(map, self);
        }

        public DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribePortRangeListAssociationsResponseBodyPortRangeListAssociations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
