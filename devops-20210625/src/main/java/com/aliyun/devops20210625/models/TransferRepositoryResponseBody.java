// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TransferRepositoryResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public TransferRepositoryResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static TransferRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferRepositoryResponseBody self = new TransferRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TransferRepositoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TransferRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferRepositoryResponseBody setResult(TransferRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public TransferRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public TransferRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TransferRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("archived")
        public Boolean archived;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("creatorId")
        public Long creatorId;

        @NameInMap("demoProject")
        public Boolean demoProject;

        @NameInMap("description")
        public String description;

        @NameInMap("encrypted")
        public Boolean encrypted;

        @NameInMap("id")
        public Long id;

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

        @NameInMap("starCount")
        public Long starCount;

        @NameInMap("starred")
        public Boolean starred;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        @NameInMap("webUrl")
        public String webUrl;

        public static TransferRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            TransferRepositoryResponseBodyResult self = new TransferRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public TransferRepositoryResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public TransferRepositoryResponseBodyResult setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public TransferRepositoryResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public TransferRepositoryResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public TransferRepositoryResponseBodyResult setDemoProject(Boolean demoProject) {
            this.demoProject = demoProject;
            return this;
        }
        public Boolean getDemoProject() {
            return this.demoProject;
        }

        public TransferRepositoryResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TransferRepositoryResponseBodyResult setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public TransferRepositoryResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TransferRepositoryResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public TransferRepositoryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TransferRepositoryResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public TransferRepositoryResponseBodyResult setNamespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        public TransferRepositoryResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public TransferRepositoryResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public TransferRepositoryResponseBodyResult setStarCount(Long starCount) {
            this.starCount = starCount;
            return this;
        }
        public Long getStarCount() {
            return this.starCount;
        }

        public TransferRepositoryResponseBodyResult setStarred(Boolean starred) {
            this.starred = starred;
            return this;
        }
        public Boolean getStarred() {
            return this.starred;
        }

        public TransferRepositoryResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public TransferRepositoryResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public TransferRepositoryResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
