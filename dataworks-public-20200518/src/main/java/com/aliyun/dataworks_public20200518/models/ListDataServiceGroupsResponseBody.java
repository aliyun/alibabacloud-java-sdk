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
     * <p>The ID of the request.</p>
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
         * <p>The ID of the API group that is associated with the business process in the API Gateway console.</p>
         */
        @NameInMap("ApiGatewayGroupId")
        public String apiGatewayGroupId;

        /**
         * <p>The time when the business process was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The user identifier (UID) of the creator of the business process. The value of this parameter may be empty for creators of some existing business processes.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the business process.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the business process.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the business process.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the business process was modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the tenant.</p>
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
         * <p>The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
