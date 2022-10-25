// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryGroupResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateRepositoryGroupResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRepositoryGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryGroupResponseBody self = new CreateRepositoryGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryGroupResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateRepositoryGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRepositoryGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepositoryGroupResponseBody setResult(CreateRepositoryGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRepositoryGroupResponseBodyResult getResult() {
        return this.result;
    }

    public CreateRepositoryGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRepositoryGroupResponseBodyResult extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("Type")
        public String type;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static CreateRepositoryGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryGroupResponseBodyResult self = new CreateRepositoryGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryGroupResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateRepositoryGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRepositoryGroupResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRepositoryGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRepositoryGroupResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public CreateRepositoryGroupResponseBodyResult setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public CreateRepositoryGroupResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public CreateRepositoryGroupResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRepositoryGroupResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public CreateRepositoryGroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateRepositoryGroupResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateRepositoryGroupResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
