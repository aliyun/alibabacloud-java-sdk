// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineResponseBody extends TeaModel {
    /**
     * <p>The configuration changes on the configuration timeline.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("ResourceConfigurationTimeline")
    public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline resourceConfigurationTimeline;

    public static GetResourceConfigurationTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationTimelineResponseBody self = new GetResourceConfigurationTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceConfigurationTimelineResponseBody setResourceConfigurationTimeline(GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline resourceConfigurationTimeline) {
        this.resourceConfigurationTimeline = resourceConfigurationTimeline;
        return this;
    }
    public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline getResourceConfigurationTimeline() {
        return this.resourceConfigurationTimeline;
    }

    public static class GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList extends TeaModel {
        /**
         * <p>The timestamp when the resource was created. Unit: milliseconds.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The timestamp when the resource change snapshot was recorded. Unit: milliseconds.</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The details of each resource that is associated with the current resource, including the region ID, resource relationship, resource ID, and resource type.</p>
         */
        @NameInMap("CaptureTime")
        public String captureTime;

        /**
         * <p>The change records of the resource relationship.</p>
         */
        @NameInMap("ConfigurationDiff")
        public String configurationDiff;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("Relationship")
        public String relationship;

        @NameInMap("RelationshipDiff")
        public String relationshipDiff;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceCreateTime")
        public String resourceCreateTime;

        /**
         * <p>The ID of the region in which the resource resides.</p>
         */
        @NameInMap("ResourceEventType")
        public String resourceEventType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The details of the resource change that triggered the compliance evaluation.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList self = new GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setCaptureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public String getCaptureTime() {
            return this.captureTime;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setConfigurationDiff(String configurationDiff) {
            this.configurationDiff = configurationDiff;
            return this;
        }
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setRelationshipDiff(String relationshipDiff) {
            this.relationshipDiff = relationshipDiff;
            return this;
        }
        public String getRelationshipDiff() {
            return this.relationshipDiff;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceCreateTime(String resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public String getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceEventType(String resourceEventType) {
            this.resourceEventType = resourceEventType;
            return this;
        }
        public String getResourceEventType() {
            return this.resourceEventType;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline extends TeaModel {
        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ConfigurationList")
        public java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList;

        /**
         * <p>The type of the resource change event involved. Valid values:</p>
         * <br>
         * <p>*   DISCOVERED: A resource is created.</p>
         * <p>*   DISCOVERED_REVISED: A resource is created by periodic remediation tasks.</p>
         * <p>*   MODIFY: A resource is modified.</p>
         * <p>*   MODIFY_REVISED: A resource is modified by periodic remediation tasks.</p>
         * <p>*   REMOVE: A resource is deleted.</p>
         * <br>
         * <p>> </p>
         * <p>*   To ensure the integrity of resources, periodic remediation tasks are executed to check data and generate events that indicate the creation of new resources. Such events are infrequent.</p>
         * <p>*   The time when a resource change event is generated by a periodic remediation task is considered as the detection time of Cloud Config. The detection time is later than the time when the resource is modified.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline self = new GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setConfigurationList(java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList) {
            this.configurationList = configurationList;
            return this;
        }
        public java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> getConfigurationList() {
            return this.configurationList;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
