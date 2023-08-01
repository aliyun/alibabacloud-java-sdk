// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberWithInheritedResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryMemberWithInheritedResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListRepositoryMemberWithInheritedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberWithInheritedResponseBody self = new ListRepositoryMemberWithInheritedResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberWithInheritedResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public ListRepositoryMemberWithInheritedResponseBody setResult(java.util.List<ListRepositoryMemberWithInheritedResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryMemberWithInheritedResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryMemberWithInheritedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRepositoryMemberWithInheritedResponseBodyResultInherited extends TeaModel {
        /**
         * <p>id</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("path")
        public String path;

        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("type")
        public String type;

        @NameInMap("visibilityLevel")
        public String visibilityLevel;

        public static ListRepositoryMemberWithInheritedResponseBodyResultInherited build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryMemberWithInheritedResponseBodyResultInherited self = new ListRepositoryMemberWithInheritedResponseBodyResultInherited();
            return TeaModel.build(map, self);
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResultInherited setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class ListRepositoryMemberWithInheritedResponseBodyResult extends TeaModel {
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("inherited")
        public ListRepositoryMemberWithInheritedResponseBodyResultInherited inherited;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static ListRepositoryMemberWithInheritedResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryMemberWithInheritedResponseBodyResult self = new ListRepositoryMemberWithInheritedResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setInherited(ListRepositoryMemberWithInheritedResponseBodyResultInherited inherited) {
            this.inherited = inherited;
            return this;
        }
        public ListRepositoryMemberWithInheritedResponseBodyResultInherited getInherited() {
            return this.inherited;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRepositoryMemberWithInheritedResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
