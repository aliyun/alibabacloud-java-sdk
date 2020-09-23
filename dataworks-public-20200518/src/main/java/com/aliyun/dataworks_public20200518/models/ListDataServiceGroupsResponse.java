// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GroupPagingResult")
    @Validation(required = true)
    public ListDataServiceGroupsResponseGroupPagingResult groupPagingResult;

    public static ListDataServiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceGroupsResponse self = new ListDataServiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceGroupsResponse setGroupPagingResult(ListDataServiceGroupsResponseGroupPagingResult groupPagingResult) {
        this.groupPagingResult = groupPagingResult;
        return this;
    }
    public ListDataServiceGroupsResponseGroupPagingResult getGroupPagingResult() {
        return this.groupPagingResult;
    }

    public static class ListDataServiceGroupsResponseGroupPagingResultGroups extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("ApiGatewayGroupId")
        @Validation(required = true)
        public String apiGatewayGroupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListDataServiceGroupsResponseGroupPagingResultGroups build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceGroupsResponseGroupPagingResultGroups self = new ListDataServiceGroupsResponseGroupPagingResultGroups();
            return TeaModel.build(map, self);
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setApiGatewayGroupId(String apiGatewayGroupId) {
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }
        public String getApiGatewayGroupId() {
            return this.apiGatewayGroupId;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceGroupsResponseGroupPagingResultGroups setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListDataServiceGroupsResponseGroupPagingResult extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Groups")
        @Validation(required = true)
        public java.util.List<ListDataServiceGroupsResponseGroupPagingResultGroups> groups;

        public static ListDataServiceGroupsResponseGroupPagingResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceGroupsResponseGroupPagingResult self = new ListDataServiceGroupsResponseGroupPagingResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceGroupsResponseGroupPagingResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceGroupsResponseGroupPagingResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceGroupsResponseGroupPagingResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceGroupsResponseGroupPagingResult setGroups(java.util.List<ListDataServiceGroupsResponseGroupPagingResultGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<ListDataServiceGroupsResponseGroupPagingResultGroups> getGroups() {
            return this.groups;
        }

    }

}
