// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryGroupsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryGroupsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListRepositoryGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryGroupsResponseBody self = new ListRepositoryGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryGroupsResponseBody setResult(java.util.List<ListRepositoryGroupsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryGroupsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryGroupsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryGroupsResponseBodyResult extends TeaModel {
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("groupCount")
        public Long groupCount;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("ownerId")
        public Long ownerId;

        @NameInMap("parentId")
        public Long parentId;

        @NameInMap("path")
        public String path;

        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("projectCount")
        public Long projectCount;

        @NameInMap("type")
        public String type;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        @NameInMap("webUrl")
        public String webUrl;

        public static ListRepositoryGroupsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryGroupsResponseBodyResult self = new ListRepositoryGroupsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryGroupsResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListRepositoryGroupsResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryGroupsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryGroupsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRepositoryGroupsResponseBodyResult setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public ListRepositoryGroupsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryGroupsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryGroupsResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListRepositoryGroupsResponseBodyResult setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListRepositoryGroupsResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListRepositoryGroupsResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoryGroupsResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListRepositoryGroupsResponseBodyResult setProjectCount(Long projectCount) {
            this.projectCount = projectCount;
            return this;
        }
        public Long getProjectCount() {
            return this.projectCount;
        }

        public ListRepositoryGroupsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRepositoryGroupsResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListRepositoryGroupsResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ListRepositoryGroupsResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
