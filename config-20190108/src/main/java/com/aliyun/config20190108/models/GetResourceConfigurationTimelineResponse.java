// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceConfigurationTimeline")
    @Validation(required = true)
    public GetResourceConfigurationTimelineResponseResourceConfigurationTimeline resourceConfigurationTimeline;

    public static GetResourceConfigurationTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationTimelineResponse self = new GetResourceConfigurationTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationTimelineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceConfigurationTimelineResponse setResourceConfigurationTimeline(GetResourceConfigurationTimelineResponseResourceConfigurationTimeline resourceConfigurationTimeline) {
        this.resourceConfigurationTimeline = resourceConfigurationTimeline;
        return this;
    }
    public GetResourceConfigurationTimelineResponseResourceConfigurationTimeline getResourceConfigurationTimeline() {
        return this.resourceConfigurationTimeline;
    }

    public static class GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("AvailabilityZone")
        @Validation(required = true)
        public String availabilityZone;

        @NameInMap("CaptureTime")
        @Validation(required = true)
        public String captureTime;

        @NameInMap("ConfigurationDiff")
        @Validation(required = true)
        public String configurationDiff;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Relationship")
        @Validation(required = true)
        public String relationship;

        @NameInMap("RelationshipDiff")
        @Validation(required = true)
        public String relationshipDiff;

        @NameInMap("ResourceCreateTime")
        @Validation(required = true)
        public String resourceCreateTime;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        public static GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList self = new GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setCaptureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public String getCaptureTime() {
            return this.captureTime;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setConfigurationDiff(String configurationDiff) {
            this.configurationDiff = configurationDiff;
            return this;
        }
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setRelationshipDiff(String relationshipDiff) {
            this.relationshipDiff = relationshipDiff;
            return this;
        }
        public String getRelationshipDiff() {
            return this.relationshipDiff;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setResourceCreateTime(String resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public String getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetResourceConfigurationTimelineResponseResourceConfigurationTimeline extends TeaModel {
        @NameInMap("NextToken")
        @Validation(required = true)
        public String nextToken;

        @NameInMap("Limit")
        @Validation(required = true)
        public Integer limit;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("ConfigurationList")
        @Validation(required = true)
        public java.util.List<GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList> configurationList;

        public static GetResourceConfigurationTimelineResponseResourceConfigurationTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationTimelineResponseResourceConfigurationTimeline self = new GetResourceConfigurationTimelineResponseResourceConfigurationTimeline();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimeline setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimeline setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetResourceConfigurationTimelineResponseResourceConfigurationTimeline setConfigurationList(java.util.List<GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList> configurationList) {
            this.configurationList = configurationList;
            return this;
        }
        public java.util.List<GetResourceConfigurationTimelineResponseResourceConfigurationTimelineConfigurationList> getConfigurationList() {
            return this.configurationList;
        }

    }

}
