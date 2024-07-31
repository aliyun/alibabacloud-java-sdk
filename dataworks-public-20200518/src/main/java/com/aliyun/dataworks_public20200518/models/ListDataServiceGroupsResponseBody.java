// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceGroupsResponseBody extends TeaModel {
    /**
     * <p>The paging result for the business processes.</p>
     */
    @NameInMap("GroupPagingResult")
    public ListDataServiceGroupsResponseBodyGroupPagingResult groupPagingResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataServiceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceGroupsResponseBody self = new ListDataServiceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceGroupsResponseBody setGroupPagingResult(ListDataServiceGroupsResponseBodyGroupPagingResult groupPagingResult) {
        this.groupPagingResult = groupPagingResult;
        return this;
    }
    public ListDataServiceGroupsResponseBodyGroupPagingResult getGroupPagingResult() {
        return this.groupPagingResult;
    }

    public ListDataServiceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataServiceGroupsResponseBodyGroupPagingResultGroups extends TeaModel {
        /**
         * <p>The ID of the API Gateway group to which the workflow is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>100abc</p>
         */
        @NameInMap("ApiGatewayGroupId")
        public String apiGatewayGroupId;

        /**
         * <p>The time when the business process was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-24T18:37:51+0800</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The user identifier (UID) of the creator of the business process. The value of this parameter may be empty for creators of some existing business processes.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The business process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_123abc</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the business process was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-24T18:37:51+0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10003</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataServiceGroupsResponseBodyGroupPagingResultGroups build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceGroupsResponseBodyGroupPagingResultGroups self = new ListDataServiceGroupsResponseBodyGroupPagingResultGroups();
            return TeaModel.build(map, self);
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setApiGatewayGroupId(String apiGatewayGroupId) {
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }
        public String getApiGatewayGroupId() {
            return this.apiGatewayGroupId;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResultGroups setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataServiceGroupsResponseBodyGroupPagingResult extends TeaModel {
        /**
         * <p>The business processes.</p>
         */
        @NameInMap("Groups")
        public java.util.List<ListDataServiceGroupsResponseBodyGroupPagingResultGroups> groups;

        /**
         * <p>The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceGroupsResponseBodyGroupPagingResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceGroupsResponseBodyGroupPagingResult self = new ListDataServiceGroupsResponseBodyGroupPagingResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResult setGroups(java.util.List<ListDataServiceGroupsResponseBodyGroupPagingResultGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<ListDataServiceGroupsResponseBodyGroupPagingResultGroups> getGroups() {
            return this.groups;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceGroupsResponseBodyGroupPagingResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
