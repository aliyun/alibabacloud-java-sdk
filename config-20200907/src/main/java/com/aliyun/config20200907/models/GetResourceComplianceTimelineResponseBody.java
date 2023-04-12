// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceTimelineResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the compliance timeline.</p>
     */
    @NameInMap("ResourceComplianceTimeline")
    public GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline resourceComplianceTimeline;

    public static GetResourceComplianceTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceTimelineResponseBody self = new GetResourceComplianceTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceComplianceTimelineResponseBody setResourceComplianceTimeline(GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline resourceComplianceTimeline) {
        this.resourceComplianceTimeline = resourceComplianceTimeline;
        return this;
    }
    public GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline getResourceComplianceTimeline() {
        return this.resourceComplianceTimeline;
    }

    public static class GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The zone where the resource resides.</p>
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
         * <p>The details of the configuration change that triggered the compliance evaluation.</p>
         */
        @NameInMap("ConfigurationDiff")
        public String configurationDiff;

        /**
         * <p>The ID of the region where the resource resides.</p>
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
         * <p>The status of the resource. The parameter value varies with the resource type and may be left empty. Examples:</p>
         * <br>
         * <p>*   If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, valid values of this parameter include Running and Stopped.</p>
         * <p>*   If the ResourceType parameter is set to ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that does not have a specific state. In this case, this parameter is left empty.</p>
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

        public static GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList self = new GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setCaptureTime(Long captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public Long getCaptureTime() {
            return this.captureTime;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setConfigurationDiff(String configurationDiff) {
            this.configurationDiff = configurationDiff;
            return this;
        }
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline extends TeaModel {
        /**
         * <p>The compliance evaluation records on the compliance timeline.</p>
         */
        @NameInMap("ComplianceList")
        public java.util.List<GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> complianceList;

        /**
         * <p>The maximum number of entries that can be returned for a single request.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to initiate the next request.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline self = new GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline setComplianceList(java.util.List<GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> complianceList) {
            this.complianceList = complianceList;
            return this;
        }
        public java.util.List<GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> getComplianceList() {
            return this.complianceList;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public GetResourceComplianceTimelineResponseBodyResourceComplianceTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
