// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListRepositoriesResponseBodyResult> result;

    public static ListRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesResponseBody self = new ListRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoriesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListRepositoriesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoriesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoriesResponseBody setResult(java.util.List<ListRepositoriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoriesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRepositoriesResponseBodyResult extends TeaModel {
        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("NamespaceId")
        public Long namespaceId;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("StarCount")
        public Long starCount;

        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DemoProjectStatus")
        public Boolean demoProjectStatus;

        @NameInMap("Star")
        public Boolean star;

        @NameInMap("ImportStatus")
        public String importStatus;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("Path")
        public String path;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ListRepositoriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoriesResponseBodyResult self = new ListRepositoriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoriesResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public ListRepositoriesResponseBodyResult setNamespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        public ListRepositoriesResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoriesResponseBodyResult setStarCount(Long starCount) {
            this.starCount = starCount;
            return this;
        }
        public Long getStarCount() {
            return this.starCount;
        }

        public ListRepositoriesResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public ListRepositoriesResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoriesResponseBodyResult setDemoProjectStatus(Boolean demoProjectStatus) {
            this.demoProjectStatus = demoProjectStatus;
            return this;
        }
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        public ListRepositoriesResponseBodyResult setStar(Boolean star) {
            this.star = star;
            return this;
        }
        public Boolean getStar() {
            return this.star;
        }

        public ListRepositoriesResponseBodyResult setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public ListRepositoriesResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ListRepositoriesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRepositoriesResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListRepositoriesResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListRepositoriesResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoriesResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ListRepositoriesResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListRepositoriesResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListRepositoriesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoriesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
