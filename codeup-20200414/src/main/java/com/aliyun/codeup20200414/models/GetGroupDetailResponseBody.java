// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetGroupDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetGroupDetailResponseBodyResult result;

    public static GetGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupDetailResponseBody self = new GetGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetGroupDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetGroupDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetGroupDetailResponseBody setResult(GetGroupDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetGroupDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetGroupDetailResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static GetGroupDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetGroupDetailResponseBodyResult self = new GetGroupDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetGroupDetailResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGroupDetailResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetGroupDetailResponseBodyResult setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public GetGroupDetailResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetGroupDetailResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public GetGroupDetailResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGroupDetailResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public GetGroupDetailResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public GetGroupDetailResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetGroupDetailResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetGroupDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGroupDetailResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
