// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterEcrAttachmentsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EcrId")
        public String ecrId;

        @NameInMap("EcrOwnerId")
        public Long ecrOwnerId;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListTransitRouterEcrAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

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
