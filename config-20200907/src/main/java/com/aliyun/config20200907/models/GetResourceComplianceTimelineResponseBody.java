// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceTimelineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D53A78F-1EB8-4264-A554-72F07E34FAE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The compliance evaluation history of the resource.</p>
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
         * <p>The timestamp when the compliance evaluation of the resource was recorded. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625200295276</p>
         */
        @NameInMap("CaptureTime")
        public Long captureTime;

        /**
         * <p>The list of rules associated with the resource and the compliance details of the rules.</p>
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
         * <p>The region ID.</p>
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
         * <p>The resource status. The resource status is defined by each Alibaba Cloud service. This parameter can be empty. For example:</p>
         * <ul>
         * <li><p>If the resource type is \<code>ACS::ECS::Instance\\</code>, this parameter can be \<code>Running\\</code> or \<code>Stopped\\</code> because ECS instances are stateful.</p>
         * </li>
         * <li><p>If the resource type is \<code>ACS::OSS::Bucket\\</code>, this parameter is empty because OSS buckets are stateless.</p>
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
         * <p>The resource tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;\&quot;hc\&quot;\&quot;:[\&quot;\&quot;value2\&quot;\&quot;]}</p>
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
         * <p>The list of compliance evaluation history records.</p>
         */
        @NameInMap("ComplianceList")
        public java.util.List<GetResourceComplianceTimelineResponseBodyResourceComplianceTimelineComplianceList> complianceList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that you use to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>5OVS5J4I1/UKTkHV5oNs****</p>
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
