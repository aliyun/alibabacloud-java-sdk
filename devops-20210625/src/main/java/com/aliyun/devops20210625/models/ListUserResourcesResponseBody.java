// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>A35869D5-BB29-5F84-A4DD-B09985EA2AFA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListUserResourcesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListUserResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserResourcesResponseBody self = new ListUserResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserResourcesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserResourcesResponseBody setResult(java.util.List<ListUserResourcesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserResourcesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListUserResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserResourcesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListUserResourcesResponseBodyResultGroupInfosGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>35268</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ownerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>1183319</p>
         */
        @NameInMap("parentId")
        public Long parentId;

        /**
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>test-org/test-group</p>
         */
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        public static ListUserResourcesResponseBodyResultGroupInfosGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultGroupInfosGroupInfo self = new ListUserResourcesResponseBodyResultGroupInfosGroupInfo();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class ListUserResourcesResponseBodyResultGroupInfosGroupRole extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("cnRoleName")
        public String cnRoleName;

        /**
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("enRoleName")
        public String enRoleName;

        /**
         * <strong>example:</strong>
         * <p>35268</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>Namespace</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListUserResourcesResponseBodyResultGroupInfosGroupRole build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultGroupInfosGroupRole self = new ListUserResourcesResponseBodyResultGroupInfosGroupRole();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupRole setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupRole setCnRoleName(String cnRoleName) {
            this.cnRoleName = cnRoleName;
            return this;
        }
        public String getCnRoleName() {
            return this.cnRoleName;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupRole setEnRoleName(String enRoleName) {
            this.enRoleName = enRoleName;
            return this;
        }
        public String getEnRoleName() {
            return this.enRoleName;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupRole setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListUserResourcesResponseBodyResultGroupInfosGroupRole setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class ListUserResourcesResponseBodyResultGroupInfos extends TeaModel {
        @NameInMap("groupInfo")
        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo groupInfo;

        @NameInMap("groupRole")
        public ListUserResourcesResponseBodyResultGroupInfosGroupRole groupRole;

        public static ListUserResourcesResponseBodyResultGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultGroupInfos self = new ListUserResourcesResponseBodyResultGroupInfos();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultGroupInfos setGroupInfo(ListUserResourcesResponseBodyResultGroupInfosGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public ListUserResourcesResponseBodyResultGroupInfosGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public ListUserResourcesResponseBodyResultGroupInfos setGroupRole(ListUserResourcesResponseBodyResultGroupInfosGroupRole groupRole) {
            this.groupRole = groupRole;
            return this;
        }
        public ListUserResourcesResponseBodyResultGroupInfosGroupRole getGroupRole() {
            return this.groupRole;
        }

    }

    public static class ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("accessLevel")
        public Integer accessLevel;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("archived")
        public Boolean archived;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>12679</p>
         */
        @NameInMap("creatorId")
        public Long creatorId;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("encrypted")
        public Boolean encrypted;

        /**
         * <strong>example:</strong>
         * <p>37229</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        /**
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>600002</p>
         */
        @NameInMap("namespaceId")
        public Long namespaceId;

        /**
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>test-org/test-group/test-repo</p>
         */
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        public static ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo self = new ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setNamespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("accessLevel")
        public Integer accessLevel;

        @NameInMap("cnRoleName")
        public String cnRoleName;

        /**
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("enRoleName")
        public String enRoleName;

        /**
         * <strong>example:</strong>
         * <p>37229</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole self = new ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole setCnRoleName(String cnRoleName) {
            this.cnRoleName = cnRoleName;
            return this;
        }
        public String getCnRoleName() {
            return this.cnRoleName;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole setEnRoleName(String enRoleName) {
            this.enRoleName = enRoleName;
            return this;
        }
        public String getEnRoleName() {
            return this.enRoleName;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class ListUserResourcesResponseBodyResultRepositoryInfos extends TeaModel {
        @NameInMap("repositoryInfo")
        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo repositoryInfo;

        @NameInMap("repositoryRole")
        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole repositoryRole;

        public static ListUserResourcesResponseBodyResultRepositoryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultRepositoryInfos self = new ListUserResourcesResponseBodyResultRepositoryInfos();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultRepositoryInfos setRepositoryInfo(ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo repositoryInfo) {
            this.repositoryInfo = repositoryInfo;
            return this;
        }
        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryInfo getRepositoryInfo() {
            return this.repositoryInfo;
        }

        public ListUserResourcesResponseBodyResultRepositoryInfos setRepositoryRole(ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole repositoryRole) {
            this.repositoryRole = repositoryRole;
            return this;
        }
        public ListUserResourcesResponseBodyResultRepositoryInfosRepositoryRole getRepositoryRole() {
            return this.repositoryRole;
        }

    }

    public static class ListUserResourcesResponseBodyResultUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>19230</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("username")
        public String username;

        public static ListUserResourcesResponseBodyResultUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResultUserInfo self = new ListUserResourcesResponseBodyResultUserInfo();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResultUserInfo setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListUserResourcesResponseBodyResultUserInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUserResourcesResponseBodyResultUserInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserResourcesResponseBodyResultUserInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserResourcesResponseBodyResultUserInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListUserResourcesResponseBodyResultUserInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListUserResourcesResponseBodyResult extends TeaModel {
        @NameInMap("groupInfos")
        public java.util.List<ListUserResourcesResponseBodyResultGroupInfos> groupInfos;

        @NameInMap("repositoryInfos")
        public java.util.List<ListUserResourcesResponseBodyResultRepositoryInfos> repositoryInfos;

        @NameInMap("userInfo")
        public ListUserResourcesResponseBodyResultUserInfo userInfo;

        public static ListUserResourcesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserResourcesResponseBodyResult self = new ListUserResourcesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserResourcesResponseBodyResult setGroupInfos(java.util.List<ListUserResourcesResponseBodyResultGroupInfos> groupInfos) {
            this.groupInfos = groupInfos;
            return this;
        }
        public java.util.List<ListUserResourcesResponseBodyResultGroupInfos> getGroupInfos() {
            return this.groupInfos;
        }

        public ListUserResourcesResponseBodyResult setRepositoryInfos(java.util.List<ListUserResourcesResponseBodyResultRepositoryInfos> repositoryInfos) {
            this.repositoryInfos = repositoryInfos;
            return this;
        }
        public java.util.List<ListUserResourcesResponseBodyResultRepositoryInfos> getRepositoryInfos() {
            return this.repositoryInfos;
        }

        public ListUserResourcesResponseBodyResult setUserInfo(ListUserResourcesResponseBodyResultUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public ListUserResourcesResponseBodyResultUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

}
