// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetGroupDetailResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetGroupDetailResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupDetailResponseBody self = new GetGroupDetailResponseBody();
        return TeaModel.build(map, self);
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

    public GetGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupDetailResponseBody setResult(GetGroupDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetGroupDetailResponseBodyResult getResult() {
        return this.result;
    }

    public GetGroupDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGroupDetailResponseBodyResult extends TeaModel {
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

        public static GetGroupDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetGroupDetailResponseBodyResult self = new GetGroupDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetGroupDetailResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetGroupDetailResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGroupDetailResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGroupDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGroupDetailResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
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

        public GetGroupDetailResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetGroupDetailResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public GetGroupDetailResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGroupDetailResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetGroupDetailResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
