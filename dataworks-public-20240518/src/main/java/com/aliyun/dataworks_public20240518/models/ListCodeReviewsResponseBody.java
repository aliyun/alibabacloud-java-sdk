// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCodeReviewsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListCodeReviewsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCodeReviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCodeReviewsResponseBody self = new ListCodeReviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCodeReviewsResponseBody setPagingInfo(ListCodeReviewsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCodeReviewsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCodeReviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCodeReviewsResponseBodyPagingInfoCodeReviews extends TeaModel {
        /**
         * <p>The node command of the root object.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1793145600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the actual submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>209000000000000002</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The review description provided upon creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Code review</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The account ID of the final approver. This field is empty if no approval decision has been made.</p>
         * 
         * <strong>example:</strong>
         * <p>209000000000000001</p>
         */
        @NameInMap("FinalReviewer")
        public String finalReviewer;

        /**
         * <p>The unique ID of the review.</p>
         * 
         * <strong>example:</strong>
         * <p>review-id</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1793145600000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the root review object.</p>
         * 
         * <strong>example:</strong>
         * <p>8600000000000000001</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The name of the root review object.</p>
         * 
         * <strong>example:</strong>
         * <p>sales_workflow</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The root object type.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowDefinition</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23620</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The approval time. This field is empty if no approval decision has been made.</p>
         * 
         * <strong>example:</strong>
         * <p>1793145660000</p>
         */
        @NameInMap("ReviewTime")
        public Long reviewTime;

        /**
         * <p>The list of account IDs of the specified reviewers.</p>
         */
        @NameInMap("Reviewers")
        public java.util.List<String> reviewers;

        /**
         * <p>The review status.</p>
         * 
         * <strong>example:</strong>
         * <p>Reviewing</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListCodeReviewsResponseBodyPagingInfoCodeReviews build(java.util.Map<String, ?> map) throws Exception {
            ListCodeReviewsResponseBodyPagingInfoCodeReviews self = new ListCodeReviewsResponseBodyPagingInfoCodeReviews();
            return TeaModel.build(map, self);
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setFinalReviewer(String finalReviewer) {
            this.finalReviewer = finalReviewer;
            return this;
        }
        public String getFinalReviewer() {
            return this.finalReviewer;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setReviewTime(Long reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }
        public Long getReviewTime() {
            return this.reviewTime;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

        public ListCodeReviewsResponseBodyPagingInfoCodeReviews setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListCodeReviewsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of code reviews.</p>
         */
        @NameInMap("CodeReviews")
        public java.util.List<ListCodeReviewsResponseBodyPagingInfoCodeReviews> codeReviews;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCodeReviewsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCodeReviewsResponseBodyPagingInfo self = new ListCodeReviewsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCodeReviewsResponseBodyPagingInfo setCodeReviews(java.util.List<ListCodeReviewsResponseBodyPagingInfoCodeReviews> codeReviews) {
            this.codeReviews = codeReviews;
            return this;
        }
        public java.util.List<ListCodeReviewsResponseBodyPagingInfoCodeReviews> getCodeReviews() {
            return this.codeReviews;
        }

        public ListCodeReviewsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCodeReviewsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCodeReviewsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
