// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceTimelineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D53A78F-1EB8-4264-A554-72F07E34FAE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The compliance timeline of the resource.</p>
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
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The zone where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-f</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The timestamp when the compliance evaluation was recorded. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625200295276</p>
         */
        @NameInMap("CaptureTime")
        public Long captureTime;

        /**
         * <p>A list of rules associated with the resource and their compliance details.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Compliance\&quot;:{\&quot;complianceType\&quot;:\&quot;COMPLIANT\&quot;,\&quot;count\&quot;:1},\&quot;ConfigRuleList\&quot;:[{\&quot;accountId\&quot;:100931896542****,\&quot;configRuleId\&quot;:\&quot;cr-9524626622af003d****\&quot;,\&quot;configRuleArn\&quot;:\&quot;acs:config::100931896542****:rule/cr-9524626622af003d****\&quot;,\&quot;configRuleName\&quot;:\&quot;OSS存储空间ACL禁止公共读写\&quot;,\&quot;complianceType\&quot;:\&quot;COMPLIANT\&quot;,\&quot;riskLevel\&quot;:1,\&quot;annotation\&quot;:\&quot;\&quot;,\&quot;invokingEventMessageType\&quot;:\&quot;ScheduledNotification\&quot;}]}</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The details of the resource change that triggered this evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;OSS存储空间ACL禁止公共读写\&quot;:[{\&quot;accountId\&quot;:100931896542****,\&quot;configRuleId\&quot;:\&quot;cr-965f626622af003d****\&quot;,\&quot;configRuleArn\&quot;:\&quot;acs:config::100931896542****:rule/cr-965f626622af003d****\&quot;,\&quot;configRuleName\&quot;:\&quot;OSS存储空间ACL禁止公共读写\&quot;,\&quot;complianceType\&quot;:\&quot;COMPLIANT\&quot;,\&quot;riskLevel\&quot;:1,\&quot;annotation\&quot;:\&quot;\&quot;,\&quot;invokingEventMessageType\&quot;:\&quot;ScheduledNotification\&quot;},{}]}</p>
         */
        @NameInMap("ConfigurationDiff")
        public String configurationDiff;

        /**
         * <p>The ID of the region where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961112000</p>
         */
        @NameInMap("ResourceCreateTime")
        public Long resourceCreateTime;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>new-bucket</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>new-bucket</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The status of the resource. The status of a resource is defined by the corresponding Alibaba Cloud service. This parameter can be empty. For example:</p>
         * <ul>
         * <li><p>If the resource type is ACS::ECS::Instance, this parameter can be Running or Stopped because an ECS instance is stateful.</p>
         * </li>
         * <li><p>If the resource type is ACS::OSS::Bucket, this parameter is empty because an OSS bucket is stateless.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::OSS::Bucket</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;\&quot;hc\&quot;\&quot;:[\&quot;\&quot;value2\&quot;\&quot;]}</p>
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
         * <p>A list of compliance timeline entries.</p>
         */
        @NameInMap("ComplianceList")
        public java.util.List<GetAggregateResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> complianceList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>5OVS5J4I1/UKTkHV5oNs****</p>
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
