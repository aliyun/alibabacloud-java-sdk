// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetricDetailsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGEaXR18y1rqykZHIqRuBejOqED4S3Xne33c7zbn****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC9BD94C-D20C-4D27-88D4-89E8D75C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the non-compliant resources.</p>
     */
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
         * <p>The name of the resource attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>DisplayName</p>
         */
        @NameInMap("PropertyName")
        public String propertyName;

        /**
         * <p>The value of the resource attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
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
         * <p>The compliance status of the resource. Valid values:</p>
         * <ul>
         * <li>NonCompliant: non-compliant.</li>
         * <li>Excluded: ignored.</li>
         * <li>PendingExclusion: to be ignored.</li>
         * <li>PendingInclusion: to be unignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NonCompliant</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The check results further analyzed by auxiliary decision-making.</p>
         * <blockquote>
         * <p> This parameter is returned only when the check item supports the auxiliary decision-making feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RecentUnloginRamUser</p>
         */
        @NameInMap("ResourceClassification")
        public String resourceClassification;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>26435103783237****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>176618589410****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The attributes of the resource.</p>
         */
        @NameInMap("ResourceProperties")
        public java.util.List<ListEvaluationMetricDetailsResponseBodyResourcesResourceProperties> resourceProperties;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListEvaluationMetricDetailsResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetricDetailsResponseBodyResources self = new ListEvaluationMetricDetailsResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetricDetailsResponseBodyResources setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
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
