// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceTimelineResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the compliance timeline.</p>
     */
    @NameInMap("ResourceComplianceTimeline")
    public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline resourceComplianceTimeline;

    public static GetAggregateResourceComplianceTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceTimelineResponseBody self = new GetAggregateResourceComplianceTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggregateResourceComplianceTimelineResponseBody setResourceComplianceTimeline(GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline resourceComplianceTimeline) {
        this.resourceComplianceTimeline = resourceComplianceTimeline;
        return this;
    }
    public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline getResourceComplianceTimeline() {
        return this.resourceComplianceTimeline;
    }

    public static class GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the zone in which the resource resides.</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The timestamp when the compliance evaluation was recorded. Unit: milliseconds.</p>
         */
        @NameInMap("CaptureTime")
        public Long captureTime;

        /**
         * <p>The information about the rules that evaluated the resource and the compliance evaluation result.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The details of the resource change that triggered the compliance evaluation.</p>
         */
        @NameInMap("ConfigurationDiff")
        public String configurationDiff;

        /**
         * <p>The ID of the region in which the resource resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created. Unit: milliseconds.</p>
         */
        @NameInMap("ResourceCreateTime")
        public Long resourceCreateTime;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The status of the resource. The parameter value varies based on the resource type and may be left empty. Examples:</p>
         * <br>
         * <p>*   If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</p>
         * <p>*   If the ResourceType parameter is set to ACS::OSS::Bucket, the resource is an OSS bucket that does not have a specific state. In this case, this parameter is left empty.</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList self = new GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setCaptureTime(Long captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public Long getCaptureTime() {
            return this.captureTime;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setConfigurationDiff(String configurationDiff) {
            this.configurationDiff = configurationDiff;
            return this;
        }
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline extends TeaModel {
        /**
         * <p>The compliance evaluation records on the compliance timeline.</p>
         */
        @NameInMap("ComplianceList")
        public java.util.List<GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> complianceList;

        /**
         * <p>The maximum number of entries returned for a single request.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to initiate the next request.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline self = new GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline setComplianceList(java.util.List<GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> complianceList) {
            this.complianceList = complianceList;
            return this;
        }
        public java.util.List<GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> getComplianceList() {
            return this.complianceList;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
