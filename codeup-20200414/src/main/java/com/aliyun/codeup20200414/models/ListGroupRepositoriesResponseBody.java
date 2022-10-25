// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListGroupRepositoriesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListGroupRepositoriesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListGroupRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRepositoriesResponseBody self = new ListGroupRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupRepositoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGroupRepositoriesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGroupRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupRepositoriesResponseBody setResult(java.util.List<ListGroupRepositoriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListGroupRepositoriesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListGroupRepositoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGroupRepositoriesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListGroupRepositoriesResponseBodyResult extends TeaModel {
        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("HttpCloneUrl")
        public String httpCloneUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImportStatus")
        public String importStatus;

        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("NamespaceId")
        public Long namespaceId;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("SshCloneUrl")
        public String sshCloneUrl;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("VisibilityLevel")
        public Integer visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static ListGroupRepositoriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListGroupRepositoriesResponseBodyResult self = new ListGroupRepositoriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListGroupRepositoriesResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public ListGroupRepositoriesResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListGroupRepositoriesResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListGroupRepositoriesResponseBodyResult setHttpCloneUrl(String httpCloneUrl) {
            this.httpCloneUrl = httpCloneUrl;
            return this;
        }
        public String getHttpCloneUrl() {
            return this.httpCloneUrl;
        }

        public ListGroupRepositoriesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGroupRepositoriesResponseBodyResult setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public ListGroupRepositoriesResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public ListGroupRepositoriesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupRepositoriesResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListGroupRepositoriesResponseBodyResult setNamespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        public ListGroupRepositoriesResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGroupRepositoriesResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListGroupRepositoriesResponseBodyResult setSshCloneUrl(String sshCloneUrl) {
            this.sshCloneUrl = sshCloneUrl;
            return this;
        }
        public String getSshCloneUrl() {
            return this.sshCloneUrl;
        }

        public ListGroupRepositoriesResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListGroupRepositoriesResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ListGroupRepositoriesResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
