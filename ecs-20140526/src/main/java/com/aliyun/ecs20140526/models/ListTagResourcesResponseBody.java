// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>484256DA-D816-44D2-9D86-B6EE4D5BA78C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource and its tags, including the resource ID, the resource type, and the keys and values of the tags.</p>
     */
    @NameInMap("TagResources")
    public ListTagResourcesResponseBodyTagResources tagResources;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(ListTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public ListTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1j6qtvdm8w0z1o****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>instance: ECS instance</li>
         * <li>disk: disk</li>
         * <li>snapshot: snapshot</li>
         * <li>image: image</li>
         * <li>securitygroup: security group</li>
         * <li>volume: storage volume</li>
         * <li>eni: ENI</li>
         * <li>ddh: dedicated host</li>
         * <li>ddhcluster: dedicated host cluster</li>
         * <li>keypair: SSH key pair</li>
         * <li>launchtemplate: launch template</li>
         * <li>reservedinstance: reserved instance</li>
         * <li>snapshotpolicy: automatic snapshot policy</li>
         * <li>elasticityassurance: elasticity assurance</li>
         * <li>capacityreservation: capacity reservation</li>
         * <li>command: Cloud Assistant command</li>
         * <li>invocation: Cloud Assistant command execution result</li>
         * <li>activation: activation code for a Cloud Assistant managed instance</li>
         * <li>managedinstance: Cloud Assistant managed instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResourcesTagResource self = new ListTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setTagResource(java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
