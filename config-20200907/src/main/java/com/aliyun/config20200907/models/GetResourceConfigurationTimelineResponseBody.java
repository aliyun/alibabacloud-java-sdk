// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Tags")
        public String tags;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ResourceEventType")
        public String resourceEventType;

        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceCreateTime")
        public String resourceCreateTime;

        @NameInMap("Region")
        public String region;

        @NameInMap("CaptureTime")
        public String captureTime;

        @NameInMap("ConfigurationDiff")
        public String configurationDiff;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Relationship")
        public String relationship;

        @NameInMap("RelationshipDiff")
        public String relationshipDiff;

        public static GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList self = new GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceEventType(String resourceEventType) {
            this.resourceEventType = resourceEventType;
            return this;
        }
        public String getResourceEventType() {
            return this.resourceEventType;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceCreateTime(String resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public String getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
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

    }

    public static class GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("ConfigurationList")
        public java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList;

        public static GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline self = new GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setConfigurationList(java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList) {
            this.configurationList = configurationList;
            return this;
        }
        public java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> getConfigurationList() {
            return this.configurationList;
        }

    }

}
