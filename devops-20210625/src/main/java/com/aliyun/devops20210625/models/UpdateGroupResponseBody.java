// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateGroupResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponseBody self = new UpdateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGroupResponseBody setResult(UpdateGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateGroupResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateGroupResponseBodyResult extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("description")
        public String description;

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

        @NameInMap("type")
        public String type;

        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        @NameInMap("webUrl")
        public String webUrl;

        public static UpdateGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseBodyResult self = new UpdateGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateGroupResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateGroupResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateGroupResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGroupResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public UpdateGroupResponseBodyResult setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public UpdateGroupResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UpdateGroupResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateGroupResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public UpdateGroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGroupResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public UpdateGroupResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
