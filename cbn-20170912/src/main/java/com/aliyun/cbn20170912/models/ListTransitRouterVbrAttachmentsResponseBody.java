// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVbrAttachmentsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public static class ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        @NameInMap("VbrId")
        public String vbrId;

        @NameInMap("VbrOwnerId")
        public Long vbrOwnerId;

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

        public ListTransitRouterVbrAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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
