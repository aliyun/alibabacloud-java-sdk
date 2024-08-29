// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED9CD1B3-286C-4E05-A765-5E1E0B9BC2AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration timeline of the resource.</p>
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
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The time when the resource change snapshot was recorded. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961156000</p>
         */
        @NameInMap("CaptureTime")
        public String captureTime;

        /**
         * <p>The details of the resource changes that trigger the compliance evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AccessControlList\&quot;:[null,{\&quot;Grant\&quot;:\&quot;private\&quot;}],\&quot;ServerSideEncryptionRule\&quot;:[null,{\&quot;SSEAlgorithm\&quot;:\&quot;None\&quot;}],\&quot;CreationDate\&quot;:[null,\&quot;2021-06-29T10:05:12.000Z\&quot;],\&quot;Owner\&quot;:[null,{\&quot;DisplayName\&quot;:\&quot;100931896542****\&quot;,\&quot;ID\&quot;:\&quot;100931896542****\&quot;}],\&quot;BucketPolicy\&quot;:[null,{\&quot;LogPrefix\&quot;:\&quot;\&quot;,\&quot;LogBucket\&quot;:\&quot;\&quot;}],\&quot;StorageClass\&quot;:[null,\&quot;Standard\&quot;],\&quot;ExtranetEndpoint\&quot;:[null,\&quot;oss-cn-hangzhou.aliyuncs.com\&quot;],\&quot;DataRedundancyType\&quot;:[null,\&quot;LRS\&quot;],\&quot;AllowEmptyReferer\&quot;:[null,\&quot;true\&quot;],\&quot;IntranetEndpoint\&quot;:[null,\&quot;oss-cn-hangzhou-internal.aliyuncs.com\&quot;],\&quot;Name\&quot;:[null,\&quot;new-bucket\&quot;],\&quot;Location\&quot;:[null,\&quot;oss-cn-hangzhou\&quot;]}</p>
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
         * <p>The details of each resource that is associated with the current resource, including the region ID, resource relationship, resource ID, and resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Relationship")
        public String relationship;

        /**
         * <p>The change records of the resource relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RelationshipDiff")
        public String relationshipDiff;

        /**
         * <p>The time when the resource was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961112000</p>
         */
        @NameInMap("ResourceCreateTime")
        public String resourceCreateTime;

        /**
         * <p>The type of the resource change event. Valid values:</p>
         * <ul>
         * <li>DISCOVERED: A resource is created.</li>
         * <li>DISCOVERED_REVISED: A resource is created by periodic remediation tasks.</li>
         * <li>MODIFY: A resource is modified.</li>
         * <li>MODIFY_REVISED: A resource is modified by periodic remediation tasks.</li>
         * <li>REMOVE: A resource is deleted.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>To ensure the integrity of resources, periodic remediation tasks are run to check data and generate events that indicate the creation of new resources. Such events are infrequent.</p>
         * </li>
         * <li><p>The time when a resource change event is generated by a periodic remediation task is considered as the detection time of Cloud Config. The detection time is later than the time when the resource is modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISCOVERED</p>
         */
        @NameInMap("ResourceEventType")
        public String resourceEventType;

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
         * <p>The configuration changes on the configuration timeline.</p>
         */
        @NameInMap("ConfigurationList")
        public java.util.List<GetResourceConfigurationTimelineResponseBodyResourceConfigurationTimelineConfigurationList> configurationList;

        /**
         * <p>The maximum number of entries returned for a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
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
