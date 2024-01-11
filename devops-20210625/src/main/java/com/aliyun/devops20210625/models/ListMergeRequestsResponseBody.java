// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListMergeRequestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestsResponseBody self = new ListMergeRequestsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestsResponseBody setResult(java.util.List<ListMergeRequestsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListMergeRequestsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMergeRequestsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMergeRequestsResponseBodyResultAuthor extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static ListMergeRequestsResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultAuthor self = new ListMergeRequestsResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestsResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestsResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestsResponseBodyResultReviewers extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("reviewTime")
        public String reviewTime;

        @NameInMap("state")
        public String state;

        @NameInMap("status")
        public String status;

        @NameInMap("username")
        public String username;

        public static ListMergeRequestsResponseBodyResultReviewers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultReviewers self = new ListMergeRequestsResponseBodyResultReviewers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultReviewers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultReviewers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestsResponseBodyResultReviewers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultReviewers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultReviewers setReviewTime(String reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }
        public String getReviewTime() {
            return this.reviewTime;
        }

        public ListMergeRequestsResponseBodyResultReviewers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestsResponseBodyResultReviewers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMergeRequestsResponseBodyResultReviewers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestsResponseBodyResultSubscribers extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static ListMergeRequestsResponseBodyResultSubscribers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultSubscribers self = new ListMergeRequestsResponseBodyResultSubscribers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultSubscribers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultSubscribers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestsResponseBodyResultSubscribers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultSubscribers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultSubscribers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestsResponseBodyResultSubscribers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestsResponseBodyResult extends TeaModel {
        @NameInMap("author")
        public ListMergeRequestsResponseBodyResultAuthor author;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("creationMethod")
        public String creationMethod;

        @NameInMap("description")
        public String description;

        @NameInMap("detailUrl")
        public String detailUrl;

        @NameInMap("id")
        public Long id;

        @NameInMap("iid")
        public Long iid;

        @NameInMap("localId")
        public Long localId;

        @NameInMap("mrBizId")
        public String mrBizId;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("newMergeRequestIdentifier")
        public Boolean newMergeRequestIdentifier;

        @NameInMap("newVersionState")
        public String newVersionState;

        @NameInMap("projectId")
        public Long projectId;

        @NameInMap("reviewers")
        public java.util.List<ListMergeRequestsResponseBodyResultReviewers> reviewers;

        @NameInMap("sourceBranch")
        public String sourceBranch;

        @NameInMap("sourceProjectId")
        public Long sourceProjectId;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("sshUrl")
        public String sshUrl;

        @NameInMap("state")
        public String state;

        @NameInMap("subscribers")
        public java.util.List<ListMergeRequestsResponseBodyResultSubscribers> subscribers;

        @NameInMap("supportMergeFFOnly")
        public Boolean supportMergeFFOnly;

        @NameInMap("targetBranch")
        public String targetBranch;

        @NameInMap("targetProjectId")
        public Long targetProjectId;

        @NameInMap("targetType")
        public String targetType;

        @NameInMap("title")
        public String title;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("webUrl")
        public String webUrl;

        @NameInMap("workInProgress")
        public Boolean workInProgress;

        public static ListMergeRequestsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResult self = new ListMergeRequestsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResult setAuthor(ListMergeRequestsResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestsResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public ListMergeRequestsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestsResponseBodyResult setCreationMethod(String creationMethod) {
            this.creationMethod = creationMethod;
            return this;
        }
        public String getCreationMethod() {
            return this.creationMethod;
        }

        public ListMergeRequestsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMergeRequestsResponseBodyResult setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public ListMergeRequestsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResult setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public ListMergeRequestsResponseBodyResult setLocalId(Long localId) {
            this.localId = localId;
            return this;
        }
        public Long getLocalId() {
            return this.localId;
        }

        public ListMergeRequestsResponseBodyResult setMrBizId(String mrBizId) {
            this.mrBizId = mrBizId;
            return this;
        }
        public String getMrBizId() {
            return this.mrBizId;
        }

        public ListMergeRequestsResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListMergeRequestsResponseBodyResult setNewMergeRequestIdentifier(Boolean newMergeRequestIdentifier) {
            this.newMergeRequestIdentifier = newMergeRequestIdentifier;
            return this;
        }
        public Boolean getNewMergeRequestIdentifier() {
            return this.newMergeRequestIdentifier;
        }

        public ListMergeRequestsResponseBodyResult setNewVersionState(String newVersionState) {
            this.newVersionState = newVersionState;
            return this;
        }
        public String getNewVersionState() {
            return this.newVersionState;
        }

        public ListMergeRequestsResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListMergeRequestsResponseBodyResult setReviewers(java.util.List<ListMergeRequestsResponseBodyResultReviewers> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultReviewers> getReviewers() {
            return this.reviewers;
        }

        public ListMergeRequestsResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public ListMergeRequestsResponseBodyResult setSourceProjectId(Long sourceProjectId) {
            this.sourceProjectId = sourceProjectId;
            return this;
        }
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        public ListMergeRequestsResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListMergeRequestsResponseBodyResult setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public ListMergeRequestsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestsResponseBodyResult setSubscribers(java.util.List<ListMergeRequestsResponseBodyResultSubscribers> subscribers) {
            this.subscribers = subscribers;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultSubscribers> getSubscribers() {
            return this.subscribers;
        }

        public ListMergeRequestsResponseBodyResult setSupportMergeFFOnly(Boolean supportMergeFFOnly) {
            this.supportMergeFFOnly = supportMergeFFOnly;
            return this;
        }
        public Boolean getSupportMergeFFOnly() {
            return this.supportMergeFFOnly;
        }

        public ListMergeRequestsResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public ListMergeRequestsResponseBodyResult setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public ListMergeRequestsResponseBodyResult setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListMergeRequestsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMergeRequestsResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListMergeRequestsResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ListMergeRequestsResponseBodyResult setWorkInProgress(Boolean workInProgress) {
            this.workInProgress = workInProgress;
            return this;
        }
        public Boolean getWorkInProgress() {
            return this.workInProgress;
        }

    }

}
