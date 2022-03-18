// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoriesResponseBodyResult> result;

    // 调用是否成功
    @NameInMap("success")
    public Boolean success;

    // 总数量
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
        // 代码库Id
        @NameInMap("Id")
        public Long id;

        // 当前用户在该代码库上的权限类型
        @NameInMap("accessLevel")
        public Integer accessLevel;

        // 代码库是否归档
        @NameInMap("archive")
        public Boolean archive;

        // 头像地址
        @NameInMap("avatarUrl")
        public String avatarUrl;

        // 创建时间
        @NameInMap("createdAt")
        public String createdAt;

        // 代码库描述
        @NameInMap("description")
        public String description;

        // 代码库导入状态
        @NameInMap("importStatus")
        public String importStatus;

        // 最后活跃时间
        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        // 代码库名称
        @NameInMap("name")
        public String name;

        // 代码库完整名称（含完整组名称）
        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        // 上级路径的id
        @NameInMap("namespaceId")
        public Long namespaceId;

        // 代码库路径
        @NameInMap("path")
        public String path;

        // 代码库完整路径（含完整组路径）
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        // 是否被收藏
        @NameInMap("star")
        public Boolean star;

        // 被收藏的数量
        @NameInMap("starCount")
        public Long starCount;

        // 更新时间
        @NameInMap("updatedAt")
        public String updatedAt;

        // 可见性;0标识私有的/10标识企业内公开
        @NameInMap("visibilityLevel")
        public String visibilityLevel;

        // 页面访问时的URL
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
