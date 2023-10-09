// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which the resource is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource. A resource ID complies with the following rules:</p>
     * <br>
     * <p>*   The resource ID of an instance is the value of the instanceId parameter.</p>
     * <p>*   The resource ID of a topic is the value of the Kafka_alikafka_instanceId_topic parameter.</p>
     * <p>*   The resource ID of a group is the value of the Kafka_alikafka_instanceId_consumerGroup parameter.</p>
     * <br>
     * <p>For example, the resources whose tags you want to query include the alikafka_post-cn-v0h1fgs2xxxx instance, the test-topic topic, and the test-consumer-group group. In this case, their resource IDs are alikafka_post-cn-v0h1fgs2xxxx, Kafka_alikafka_post-cn-v0h1fgs2xxxx_test-topic, and Kafka_alikafka_post-cn-v0h1fgs2xxxx_test-consumer-group.</p>
     * <br>
     * <p>>  You must set at least one of the **ResourceId** and **Tag** parameters to query the tags of a specified resource. Otherwise, the request fails.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource whose tags you want to query. The value is an enumerated value. Valid values:</p>
     * <br>
     * <p>*   **INSTANCE**</p>
     * <p>*   **TOPIC**</p>
     * <p>*   **CONSUMERGROUP**</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(java.util.List<ListTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If this parameter is not configured, all tag keys are matched.</p>
         * <p>*   The tag key can be up to 128 characters in length. The tag value cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If the Key parameter is not configured, you cannot configure this parameter. If this parameter is not configured, all tag values are matched.</p>
         * <p>*   The tag value can be 1 to 128 characters in length. The tag value cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
