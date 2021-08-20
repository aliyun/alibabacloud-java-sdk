// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberWithInheritedResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListRepositoryMemberWithInheritedResponseBodyResult> result;

    public static ListRepositoryMemberWithInheritedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberWithInheritedResponseBody self = new ListRepositoryMemberWithInheritedResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberWithInheritedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryMemberWithInheritedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryMemberWithInheritedResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryMemberWithInheritedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryMemberWithInheritedResponseBody setResult(java.util.List<ListRepositoryMemberWithInheritedResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryMemberWithInheritedResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRepositoryMemberWithInheritedResponseBodyResultInherited extends TeaModel {
        @NameInMap("Type")
        public String type;

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

        public static ListRepositoryMemberWithInheritedResponseBodyResultInherited build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryMemberWithInheritedResponseBodyResultInherited self = new ListRepositoryMemberWithInheritedResponseBodyResultInherited();
            return TeaModel.build(map, self);
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListRepositoryMemberWithInheritedResponseBodyResult extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("State")
        public String state;

        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        @NameInMap("Inherited")
        public ListRepositoryMemberWithInheritedResponseBodyResultInherited inherited;

        public static ListRepositoryMemberWithInheritedResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryMemberWithInheritedResponseBodyResult self = new ListRepositoryMemberWithInheritedResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setInherited(ListRepositoryMemberWithInheritedResponseBodyResultInherited inherited) {
            this.inherited = inherited;
            return this;
        }
        public ListRepositoryMemberWithInheritedResponseBodyResultInherited getInherited() {
            return this.inherited;
        }

    }

}
