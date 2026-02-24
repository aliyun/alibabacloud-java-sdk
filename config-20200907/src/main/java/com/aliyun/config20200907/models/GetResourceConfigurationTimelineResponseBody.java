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
     * <p>The configuration history of the resource.</p>
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
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The timestamp when the resource change snapshot was recorded. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961156000</p>
         */
        @NameInMap("CaptureTime")
        public String captureTime;

        /**
         * <p>The details of the resource configuration change.</p>
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
         * <p>Details of related resources, including their region ID, relationship, resource ID, and resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Relationship")
        public String relationship;

        /**
         * <p>The changes to the related resources.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RelationshipDiff")
        public String relationshipDiff;

        /**
         * <p>The timestamp when the resource was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961112000</p>
         */
        @NameInMap("ResourceCreateTime")
        public String resourceCreateTime;

        /**
         * <p>The type of the resource change event. Valid values:</p>
         * <ul>
         * <li><p>DISCOVERED: A resource is discovered by Cloud Config.</p>
         * </li>
         * <li><p>DISCOVERED_REVISED: A resource is discovered by Cloud Config through a periodic reconciliation task.</p>
         * </li>
         * <li><p>MODIFY: A resource is modified.</p>
         * </li>
         * <li><p>MODIFY_REVISED: A resource modification is recorded through a periodic reconciliation task.</p>
         * </li>
         * <li><p>REMOVE: A resource is deleted.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>To ensure data integrity, Cloud Config periodically reconciles resource data. This process can generate resource discovery events, which occur infrequently.</p>
         * </li>
         * <li><p>The time of an event generated by a reconciliation task is the time when the task discovers the change. This is later than the actual time of the change.</p>
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
         * <p>A list of configuration history records for the resource.</p>
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
         * <p>The token that is used to retrieve the next page of results.</p>
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
