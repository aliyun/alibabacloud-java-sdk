// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectsResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public ListDevopsProjectsResponseBodyObject object;

    public static ListDevopsProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectsResponseBody self = new ListDevopsProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsProjectsResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public ListDevopsProjectsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsProjectsResponseBody setObject(ListDevopsProjectsResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public ListDevopsProjectsResponseBodyObject getObject() {
        return this.object;
    }

    public static class ListDevopsProjectsResponseBodyObjectResult extends TeaModel {
        @NameInMap("Logo")
        public String logo;

        @NameInMap("IsStar")
        public Boolean isStar;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("MembersCount")
        public Integer membersCount;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("Created")
        public String created;

        @NameInMap("IsArchived")
        public Boolean isArchived;

        @NameInMap("Name")
        public String name;

        @NameInMap("IsPublic")
        public Boolean isPublic;

        @NameInMap("TasksCount")
        public Integer tasksCount;

        @NameInMap("RoleId")
        public Integer roleId;

        @NameInMap("Id")
        public String id;

        public static ListDevopsProjectsResponseBodyObjectResult build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectsResponseBodyObjectResult self = new ListDevopsProjectsResponseBodyObjectResult();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectsResponseBodyObjectResult setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public ListDevopsProjectsResponseBodyObjectResult setIsStar(Boolean isStar) {
            this.isStar = isStar;
            return this;
        }
        public Boolean getIsStar() {
            return this.isStar;
        }

        public ListDevopsProjectsResponseBodyObjectResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDevopsProjectsResponseBodyObjectResult setMembersCount(Integer membersCount) {
            this.membersCount = membersCount;
            return this;
        }
        public Integer getMembersCount() {
            return this.membersCount;
        }

        public ListDevopsProjectsResponseBodyObjectResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListDevopsProjectsResponseBodyObjectResult setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public ListDevopsProjectsResponseBodyObjectResult setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListDevopsProjectsResponseBodyObjectResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDevopsProjectsResponseBodyObjectResult setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public ListDevopsProjectsResponseBodyObjectResult setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListDevopsProjectsResponseBodyObjectResult setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        public ListDevopsProjectsResponseBodyObjectResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDevopsProjectsResponseBodyObjectResult setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public ListDevopsProjectsResponseBodyObjectResult setTasksCount(Integer tasksCount) {
            this.tasksCount = tasksCount;
            return this;
        }
        public Integer getTasksCount() {
            return this.tasksCount;
        }

        public ListDevopsProjectsResponseBodyObjectResult setRoleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }
        public Integer getRoleId() {
            return this.roleId;
        }

        public ListDevopsProjectsResponseBodyObjectResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListDevopsProjectsResponseBodyObject extends TeaModel {
        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("Result")
        public java.util.List<ListDevopsProjectsResponseBodyObjectResult> result;

        public static ListDevopsProjectsResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectsResponseBodyObject self = new ListDevopsProjectsResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectsResponseBodyObject setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public ListDevopsProjectsResponseBodyObject setResult(java.util.List<ListDevopsProjectsResponseBodyObjectResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListDevopsProjectsResponseBodyObjectResult> getResult() {
            return this.result;
        }

    }

}
