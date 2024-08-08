// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetricDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAGEaXR18y1rqykZHIqRuBejOqED4S3Xne33c7zbn****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AC9BD94C-D20C-4D27-88D4-89E8D75C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListEvaluationMetricDetailsResponseBodyResources> resources;

    public static ListEvaluationMetricDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationMetricDetailsResponseBody self = new ListEvaluationMetricDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluationMetricDetailsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluationMetricDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluationMetricDetailsResponseBody setResources(java.util.List<ListEvaluationMetricDetailsResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListEvaluationMetricDetailsResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DisplayName</p>
         */
        @NameInMap("PropertyName")
        public String propertyName;

        @NameInMap("PropertyValue")
        public String propertyValue;

        public static ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties self = new ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class ListEvaluationMetricDetailsResponseBodyResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>RecentUnloginRamUser</p>
         */
        @NameInMap("ResourceClassification")
        public String resourceClassification;

        /**
         * <strong>example:</strong>
         * <p>26435103783237****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        @NameInMap("ResourceProperties")
        public java.util.List<ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties> resourceProperties;

        /**
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListEvaluationMetricDetailsResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetricDetailsResponseBodyResources self = new ListEvaluationMetricDetailsResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetricDetailsResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEvaluationMetricDetailsResponseBodyResources setResourceClassification(String resourceClassification) {
            this.resourceClassification = resourceClassification;
            return this;
        }
        public String getResourceClassification() {
            return this.resourceClassification;
        }

        public ListEvaluationMetricDetailsResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListEvaluationMetricDetailsResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListEvaluationMetricDetailsResponseBodyResources setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListEvaluationMetricDetailsResponseBodyResources setResourceProperties(java.util.List<ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties> resourceProperties) {
            this.resourceProperties = resourceProperties;
            return this;
        }
        public java.util.List<ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties> getResourceProperties() {
            return this.resourceProperties;
        }

        public ListEvaluationMetricDetailsResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
