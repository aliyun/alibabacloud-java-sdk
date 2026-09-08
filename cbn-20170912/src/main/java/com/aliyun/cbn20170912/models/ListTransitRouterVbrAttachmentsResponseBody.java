// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVbrAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no subsequent query is to be sent, you do not need to specify this parameter.</li>
     * <li>If a subsequent query is to be sent, set the value to the NextToken value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F42D9616-29EB-4E75-8CA8-9654D4E07501</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of VBR connections.</p>
     */
    @NameInMap("TransitRouterAttachments")
    public java.util.List<ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments;

    public static ListTransitRouterVbrAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVbrAttachmentsResponseBody self = new ListTransitRouterVbrAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVbrAttachmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterVbrAttachmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterVbrAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterVbrAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterVbrAttachmentsResponseBody setTransitRouterAttachments(java.util.List<ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments) {
        this.transitRouterAttachments = transitRouterAttachments;
        return this;
    }
    public java.util.List<ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static class ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags extends TeaModel {
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
         * <p>value_A1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags self = new ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        /**
         * <p>Indicates whether the Enterprise Edition forward routing automatically publishes route entries to the VBR instance. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: The Enterprise Edition forward routing does not automatically publish route entries to the VBR instance.</li>
         * <li><strong>true</strong>: The Enterprise Edition forward routing automatically publishes route entries to the VBR instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The time when the VBR connection was created.</p>
         * <p>The time is displayed in the ISO 8601 standard in UTC. Format: YYYY-MM-DDThh:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T15:20Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The cloud service that manages the VBR connection. This parameter is returned only when the VBR connection is managed by a cloud service. The standard code of the cloud service is returned. If the VBR connection is managed by you, this parameter is not returned.</p>
         */
        @NameInMap("ManagedService")
        public String managedService;

        /**
         * <p>The payer of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>PayByCenOwner</strong>: The connection fee and data processing fee of the VBR instance are paid by the account to which the transit router instance belongs.</li>
         * <li><strong>PayByResourceOwner</strong>: The connection fee and data processing fee of the VBR instance are paid by the account to which the VBR instance belongs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The type of resource to which the connection belongs.</p>
         * <p>The value is <strong>VBR</strong>, which indicates a virtual border router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the VBR connection. Valid values:</p>
         * <ul>
         * <li><strong>Attached</strong>: The VBR connection is attached.</li>
         * <li><strong>Attaching</strong>: The VBR connection is being attached.</li>
         * <li><strong>Detaching</strong>: The VBR connection is being detached.</li>
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
        public java.util.List<ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        /**
         * <p>The description of the VBR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        /**
         * <p>The ID of the VBR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-oyf70wfuorwx87****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The name of the VBR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>testa</p>
         */
        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        /**
         * <p>The Enterprise Edition forward routing instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The VBR instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp1svadp4lq38janc****</p>
         */
        @NameInMap("VbrId")
        public String vbrId;

        /**
         * <p>The ID of the account to which the VBR instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1688111111111111</p>
         */
        @NameInMap("VbrOwnerId")
        public Long vbrOwnerId;

        /**
         * <p>The region ID of the VBR instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VbrRegionId")
        public String vbrRegionId;

        public static ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments self = new ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setManagedService(String managedService) {
            this.managedService = managedService;
            return this;
        }
        public String getManagedService() {
            return this.managedService;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setTags(java.util.List<ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachmentsTags> getTags() {
            return this.tags;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setVbrOwnerId(Long vbrOwnerId) {
            this.vbrOwnerId = vbrOwnerId;
            return this;
        }
        public Long getVbrOwnerId() {
            return this.vbrOwnerId;
        }

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setVbrRegionId(String vbrRegionId) {
            this.vbrRegionId = vbrRegionId;
            return this;
        }
        public String getVbrRegionId() {
            return this.vbrRegionId;
        }

    }

}
