// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterEcrAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>461EC1B5-04A8-4706-8764-8F5BCEF48A6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of ECR connection information.</p>
     */
    @NameInMap("TransitRouterAttachments")
    public java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments;

    public static ListTransitRouterEcrAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterEcrAttachmentsResponseBody self = new ListTransitRouterEcrAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterEcrAttachmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterEcrAttachmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterEcrAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterEcrAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterEcrAttachmentsResponseBody setTransitRouterAttachments(java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments) {
        this.transitRouterAttachments = transitRouterAttachments;
        return this;
    }
    public java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static class ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags self = new ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        /**
         * <p>Indicates whether the Enterprise Edition transit router automatically publishes route entries to the ECR instance.</p>
         * <p>The value is <strong>true</strong> only, which indicates that route entries are automatically published.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-j3jzhw1zpau2km****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the ECR connection was created.</p>
         * <p>The time is displayed in the ISO 8601 standard in UTC. Format: YYYY-MM-DDThh:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T02:14Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance ID of the associated Express Connect Router (ECR).</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-n78omt2qsko06y****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the ECR instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("EcrOwnerId")
        public Long ecrOwnerId;

        /**
         * <p>The payer of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>PayByCenOwner</strong>: The connection fee and data processing fee of the ECR instance are paid by the account that owns the transit router instance.</li>
         * <li><strong>PayByResourceOwner</strong>: The connection fee and data processing fee of the ECR instance are paid by the account that owns the ECR instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The resource type of the connection.</p>
         * <p>The value is <strong>ECR</strong> only, which indicates an Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ECR</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the ECR connection.</p>
         * <ul>
         * <li><strong>Attached</strong>: attached.</li>
         * <li><strong>Attaching</strong>: being attached.</li>
         * <li><strong>Detaching</strong>: being detached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        /**
         * <p>The description of the ECR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        /**
         * <p>The ECR connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-nls9fzkfat8934****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The name of the ECR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        /**
         * <p>The Enterprise Edition transit router instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The region ID of the transit router.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the region information corresponding to the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("TransitRouterRegionId")
        public String transitRouterRegionId;

        public static ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments self = new ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setEcrOwnerId(Long ecrOwnerId) {
            this.ecrOwnerId = ecrOwnerId;
            return this;
        }
        public Long getEcrOwnerId() {
            return this.ecrOwnerId;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setTags(java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags> getTags() {
            return this.tags;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterRegionId(String transitRouterRegionId) {
            this.transitRouterRegionId = transitRouterRegionId;
            return this;
        }
        public String getTransitRouterRegionId() {
            return this.transitRouterRegionId;
        }

    }

}
