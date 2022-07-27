// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public Integer errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoriesResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesResponseBody self = new ListRepositoriesResponseBody();
        return TeaModel.build(map, self);
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

    public ListRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoriesResponseBody setResult(java.util.List<ListRepositoriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoriesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoriesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoriesResponseBodyResult extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("archive")
        public Boolean archive;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("importStatus")
        public String importStatus;

        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("namespaceId")
        public Long namespaceId;

        @NameInMap("path")
        public String path;

        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("star")
        public Boolean star;

        @NameInMap("starCount")
        public Long starCount;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("visibilityLevel")
        public String visibilityLevel;

        @NameInMap("webUrl")
        public String webUrl;

        public static ListRepositoriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoriesResponseBodyResult self = new ListRepositoriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoriesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoriesResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListRepositoriesResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public ListRepositoriesResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoriesResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoriesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRepositoriesResponseBodyResult setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public ListRepositoriesResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public ListRepositoriesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoriesResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListRepositoriesResponseBodyResult setNamespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        public ListRepositoriesResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoriesResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListRepositoriesResponseBodyResult setStar(Boolean star) {
            this.star = star;
            return this;
        }
        public Boolean getStar() {
            return this.star;
        }

        public ListRepositoriesResponseBodyResult setStarCount(Long starCount) {
            this.starCount = starCount;
            return this;
        }
        public Long getStarCount() {
            return this.starCount;
        }

        public ListRepositoriesResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListRepositoriesResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ListRepositoriesResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
