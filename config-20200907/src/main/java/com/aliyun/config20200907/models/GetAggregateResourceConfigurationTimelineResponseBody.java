// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceConfigurationTimelineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED9CD1B3-286C-4E05-A765-5E1E0B9BC2AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration history of the resource.</p>
     */
    @NameInMap("ResourceConfigurationTimeline")
    public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline resourceConfigurationTimeline;

    public static GetAggregateResourceConfigurationTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceConfigurationTimelineResponseBody self = new GetAggregateResourceConfigurationTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceConfigurationTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggregateResourceConfigurationTimelineResponseBody setResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline resourceConfigurationTimeline) {
        this.resourceConfigurationTimeline = resourceConfigurationTimeline;
        return this;
    }
    public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline getResourceConfigurationTimeline() {
        return this.resourceConfigurationTimeline;
    }

    public static class GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The time when the resource change snapshot was recorded. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961156000</p>
         */
        @NameInMap("CaptureTime")
        public String captureTime;

        /**
         * <p>The details of the resource changes that triggered the evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AccessControlList\&quot;:[null,{\&quot;Grant\&quot;:\&quot;private\&quot;}],\&quot;ServerSideEncryptionRule\&quot;:[null,{\&quot;SSEAlgorithm\&quot;:\&quot;None\&quot;}],\&quot;CreationDate\&quot;:[null,\&quot;2021-06-29T10:05:12.000Z\&quot;],\&quot;Owner\&quot;:[null,{\&quot;DisplayName\&quot;:\&quot;100931896542****\&quot;,\&quot;ID\&quot;:\&quot;100931896542****\&quot;}],\&quot;BucketPolicy\&quot;:[null,{\&quot;LogPrefix\&quot;:\&quot;\&quot;,\&quot;LogBucket\&quot;:\&quot;\&quot;}],\&quot;StorageClass\&quot;:[null,\&quot;Standard\&quot;],\&quot;ExtranetEndpoint\&quot;:[null,\&quot;oss-cn-hangzhou.aliyuncs.com\&quot;],\&quot;DataRedundancyType\&quot;:[null,\&quot;LRS\&quot;],\&quot;AllowEmptyReferer\&quot;:[null,\&quot;true\&quot;],\&quot;IntranetEndpoint\&quot;:[null,\&quot;oss-cn-hangzhou-internal.aliyuncs.com\&quot;],\&quot;Name\&quot;:[null,\&quot;new-bucket\&quot;],\&quot;Location\&quot;:[null,\&quot;oss-cn-hangzhou\&quot;]}</p>
         */
        @NameInMap("ConfigurationDiff")
        public String configurationDiff;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the resource was created. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961112000</p>
         */
        @NameInMap("ResourceCreateTime")
        public String resourceCreateTime;

        /**
         * <p>The type of the resource change event. Valid values:</p>
         * <ul>
         * <li><p>DISCOVERED: The resource is discovered by Cloud Config.</p>
         * </li>
         * <li><p>DISCOVERED_REVISED: The resource is discovered by Cloud Config through a periodic remediation task.</p>
         * </li>
         * <li><p>MODIFY: The resource is modified.</p>
         * </li>
         * <li><p>MODIFY_REVISED: The resource is modified, as detected by a periodic remediation task.</p>
         * </li>
         * <li><p>REMOVE: The resource is deleted.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>To ensure data integrity, Cloud Config periodically runs remediation tasks to align data. This process may generate resource discovery events. These events occur infrequently.</p>
         * </li>
         * <li><p>The time when a resource event is generated by a periodic remediation task is the discovery time of the task. This time is later than the actual time of the resource change.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DISCOVERED</p>
         */
        @NameInMap("ResourceEventType")
        public String resourceEventType;

        /**
         * <p>The ID of the resource.</p>
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

        public static GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList self = new GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setCaptureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public String getCaptureTime() {
            return this.captureTime;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setConfigurationDiff(String configurationDiff) {
            this.configurationDiff = configurationDiff;
            return this;
        }
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceCreateTime(String resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public String getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceEventType(String resourceEventType) {
            this.resourceEventType = resourceEventType;
            return this;
        }
        public String getResourceEventType() {
            return this.resourceEventType;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline extends TeaModel {
        /**
         * <p>A list of configuration changes.</p>
         */
        @NameInMap("ConfigurationList")
        public java.util.List<GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList;

        /**
         * <p>The maximum number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline self = new GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setConfigurationList(java.util.List<GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList) {
            this.configurationList = configurationList;
            return this;
        }
        public java.util.List<GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> getConfigurationList() {
            return this.configurationList;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public GetAggregateResourceConfigurationTimelineResponseBodyResourceConfigurationTimeline setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
