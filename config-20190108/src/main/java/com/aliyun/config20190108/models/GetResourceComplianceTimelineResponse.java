// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetResourceComplianceTimelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceComplianceTimeline")
    @Validation(required = true)
    public GetResourceComplianceTimelineResponseResourceComplianceTimeline resourceComplianceTimeline;

    public static GetResourceComplianceTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceTimelineResponse self = new GetResourceComplianceTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceTimelineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceComplianceTimelineResponse setResourceComplianceTimeline(GetResourceComplianceTimelineResponseResourceComplianceTimeline resourceComplianceTimeline) {
        this.resourceComplianceTimeline = resourceComplianceTimeline;
        return this;
    }
    public GetResourceComplianceTimelineResponseResourceComplianceTimeline getResourceComplianceTimeline() {
        return this.resourceComplianceTimeline;
    }

    public static class GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("AvailabilityZone")
        @Validation(required = true)
        public String availabilityZone;

        @NameInMap("CaptureTime")
        @Validation(required = true)
        public Long captureTime;

        @NameInMap("Configuration")
        @Validation(required = true)
        public String configuration;

        @NameInMap("ConfigurationDiff")
        @Validation(required = true)
        public String configurationDiff;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ResourceCreateTime")
        @Validation(required = true)
        public Long resourceCreateTime;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("ResourceStatus")
        @Validation(required = true)
        public String resourceStatus;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        public static GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList self = new GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setCaptureTime(Long captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public Long getCaptureTime() {
            return this.captureTime;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setConfigurationDiff(String configurationDiff) {
            this.configurationDiff = configurationDiff;
            return this;
        }
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setResourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetResourceComplianceTimelineResponseResourceComplianceTimeline extends TeaModel {
        @NameInMap("Limit")
        @Validation(required = true)
        public Integer limit;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("NextToken")
        @Validation(required = true)
        public String nextToken;

        @NameInMap("ComplianceList")
        @Validation(required = true)
        public java.util.List<GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList> complianceList;

        public static GetResourceComplianceTimelineResponseResourceComplianceTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceTimelineResponseResourceComplianceTimeline self = new GetResourceComplianceTimelineResponseResourceComplianceTimeline();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimeline setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimeline setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public GetResourceComplianceTimelineResponseResourceComplianceTimeline setComplianceList(java.util.List<GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList> complianceList) {
            this.complianceList = complianceList;
            return this;
        }
        public java.util.List<GetResourceComplianceTimelineResponseResourceComplianceTimelineComplianceList> getComplianceList() {
            return this.complianceList;
        }

    }

}
