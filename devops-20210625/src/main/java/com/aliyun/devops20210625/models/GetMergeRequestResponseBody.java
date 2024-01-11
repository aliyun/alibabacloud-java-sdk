// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetMergeRequestResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestResponseBody self = new GetMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMergeRequestResponseBody setResult(GetMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public GetMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMergeRequestResponseBodyResultAuthor extends TeaModel {
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

        public static GetMergeRequestResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestResponseBodyResultAuthor self = new GetMergeRequestResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetMergeRequestResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetMergeRequestResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMergeRequestResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMergeRequestResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMergeRequestResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetMergeRequestResponseBodyResultReviewers extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("hasReviewed")
        public Boolean hasReviewed;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("reviewOpinionStatus")
        public String reviewOpinionStatus;

        @NameInMap("reviewTime")
        public String reviewTime;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static GetMergeRequestResponseBodyResultReviewers build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestResponseBodyResultReviewers self = new GetMergeRequestResponseBodyResultReviewers();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestResponseBodyResultReviewers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetMergeRequestResponseBodyResultReviewers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetMergeRequestResponseBodyResultReviewers setHasReviewed(Boolean hasReviewed) {
            this.hasReviewed = hasReviewed;
            return this;
        }
        public Boolean getHasReviewed() {
            return this.hasReviewed;
        }

        public GetMergeRequestResponseBodyResultReviewers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMergeRequestResponseBodyResultReviewers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMergeRequestResponseBodyResultReviewers setReviewOpinionStatus(String reviewOpinionStatus) {
            this.reviewOpinionStatus = reviewOpinionStatus;
            return this;
        }
        public String getReviewOpinionStatus() {
            return this.reviewOpinionStatus;
        }

        public GetMergeRequestResponseBodyResultReviewers setReviewTime(String reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }
        public String getReviewTime() {
            return this.reviewTime;
        }

        public GetMergeRequestResponseBodyResultReviewers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMergeRequestResponseBodyResultReviewers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetMergeRequestResponseBodyResultSubscribers extends TeaModel {
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

        public static GetMergeRequestResponseBodyResultSubscribers build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestResponseBodyResultSubscribers self = new GetMergeRequestResponseBodyResultSubscribers();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestResponseBodyResultSubscribers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetMergeRequestResponseBodyResultSubscribers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetMergeRequestResponseBodyResultSubscribers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMergeRequestResponseBodyResultSubscribers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMergeRequestResponseBodyResultSubscribers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMergeRequestResponseBodyResultSubscribers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetMergeRequestResponseBodyResultTodoListRequirementCheckItems extends TeaModel {
        @NameInMap("itemType")
        public String itemType;

        @NameInMap("pass")
        public Boolean pass;

        public static GetMergeRequestResponseBodyResultTodoListRequirementCheckItems build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestResponseBodyResultTodoListRequirementCheckItems self = new GetMergeRequestResponseBodyResultTodoListRequirementCheckItems();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestResponseBodyResultTodoListRequirementCheckItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public GetMergeRequestResponseBodyResultTodoListRequirementCheckItems setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

    }

    public static class GetMergeRequestResponseBodyResultTodoList extends TeaModel {
        @NameInMap("requirementCheckItems")
        public java.util.List<GetMergeRequestResponseBodyResultTodoListRequirementCheckItems> requirementCheckItems;

        public static GetMergeRequestResponseBodyResultTodoList build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestResponseBodyResultTodoList self = new GetMergeRequestResponseBodyResultTodoList();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestResponseBodyResultTodoList setRequirementCheckItems(java.util.List<GetMergeRequestResponseBodyResultTodoListRequirementCheckItems> requirementCheckItems) {
            this.requirementCheckItems = requirementCheckItems;
            return this;
        }
        public java.util.List<GetMergeRequestResponseBodyResultTodoListRequirementCheckItems> getRequirementCheckItems() {
            return this.requirementCheckItems;
        }

    }

    public static class GetMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("ahead")
        public Integer ahead;

        @NameInMap("allRequirementsPass")
        public Boolean allRequirementsPass;

        @NameInMap("author")
        public GetMergeRequestResponseBodyResultAuthor author;

        @NameInMap("behind")
        public Integer behind;

        @NameInMap("createFrom")
        public String createFrom;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("detailUrl")
        public String detailUrl;

        @NameInMap("localId")
        public Long localId;

        @NameInMap("mrBizId")
        public String mrBizId;

        @NameInMap("mrType")
        public String mrType;

        @NameInMap("projectId")
        public Long projectId;

        @NameInMap("reviewers")
        public java.util.List<GetMergeRequestResponseBodyResultReviewers> reviewers;

        @NameInMap("sourceBranch")
        public String sourceBranch;

        @NameInMap("sourceProjectId")
        public Long sourceProjectId;

        @NameInMap("status")
        public String status;

        @NameInMap("subscribers")
        public java.util.List<GetMergeRequestResponseBodyResultSubscribers> subscribers;

        @NameInMap("supportMergeFastForwardOnly")
        public Boolean supportMergeFastForwardOnly;

        @NameInMap("targetBranch")
        public String targetBranch;

        @NameInMap("targetProjectId")
        public Long targetProjectId;

        @NameInMap("targetProjectNameWithNamespace")
        public String targetProjectNameWithNamespace;

        @NameInMap("targetProjectPathWithNamespace")
        public String targetProjectPathWithNamespace;

        @NameInMap("title")
        public String title;

        @NameInMap("todoList")
        public GetMergeRequestResponseBodyResultTodoList todoList;

        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("webUrl")
        public String webUrl;

        public static GetMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestResponseBodyResult self = new GetMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestResponseBodyResult setAhead(Integer ahead) {
            this.ahead = ahead;
            return this;
        }
        public Integer getAhead() {
            return this.ahead;
        }

        public GetMergeRequestResponseBodyResult setAllRequirementsPass(Boolean allRequirementsPass) {
            this.allRequirementsPass = allRequirementsPass;
            return this;
        }
        public Boolean getAllRequirementsPass() {
            return this.allRequirementsPass;
        }

        public GetMergeRequestResponseBodyResult setAuthor(GetMergeRequestResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public GetMergeRequestResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public GetMergeRequestResponseBodyResult setBehind(Integer behind) {
            this.behind = behind;
            return this;
        }
        public Integer getBehind() {
            return this.behind;
        }

        public GetMergeRequestResponseBodyResult setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public GetMergeRequestResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMergeRequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMergeRequestResponseBodyResult setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public GetMergeRequestResponseBodyResult setLocalId(Long localId) {
            this.localId = localId;
            return this;
        }
        public Long getLocalId() {
            return this.localId;
        }

        public GetMergeRequestResponseBodyResult setMrBizId(String mrBizId) {
            this.mrBizId = mrBizId;
            return this;
        }
        public String getMrBizId() {
            return this.mrBizId;
        }

        public GetMergeRequestResponseBodyResult setMrType(String mrType) {
            this.mrType = mrType;
            return this;
        }
        public String getMrType() {
            return this.mrType;
        }

        public GetMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMergeRequestResponseBodyResult setReviewers(java.util.List<GetMergeRequestResponseBodyResultReviewers> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<GetMergeRequestResponseBodyResultReviewers> getReviewers() {
            return this.reviewers;
        }

        public GetMergeRequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public GetMergeRequestResponseBodyResult setSourceProjectId(Long sourceProjectId) {
            this.sourceProjectId = sourceProjectId;
            return this;
        }
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        public GetMergeRequestResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMergeRequestResponseBodyResult setSubscribers(java.util.List<GetMergeRequestResponseBodyResultSubscribers> subscribers) {
            this.subscribers = subscribers;
            return this;
        }
        public java.util.List<GetMergeRequestResponseBodyResultSubscribers> getSubscribers() {
            return this.subscribers;
        }

        public GetMergeRequestResponseBodyResult setSupportMergeFastForwardOnly(Boolean supportMergeFastForwardOnly) {
            this.supportMergeFastForwardOnly = supportMergeFastForwardOnly;
            return this;
        }
        public Boolean getSupportMergeFastForwardOnly() {
            return this.supportMergeFastForwardOnly;
        }

        public GetMergeRequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public GetMergeRequestResponseBodyResult setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public GetMergeRequestResponseBodyResult setTargetProjectNameWithNamespace(String targetProjectNameWithNamespace) {
            this.targetProjectNameWithNamespace = targetProjectNameWithNamespace;
            return this;
        }
        public String getTargetProjectNameWithNamespace() {
            return this.targetProjectNameWithNamespace;
        }

        public GetMergeRequestResponseBodyResult setTargetProjectPathWithNamespace(String targetProjectPathWithNamespace) {
            this.targetProjectPathWithNamespace = targetProjectPathWithNamespace;
            return this;
        }
        public String getTargetProjectPathWithNamespace() {
            return this.targetProjectPathWithNamespace;
        }

        public GetMergeRequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMergeRequestResponseBodyResult setTodoList(GetMergeRequestResponseBodyResultTodoList todoList) {
            this.todoList = todoList;
            return this;
        }
        public GetMergeRequestResponseBodyResultTodoList getTodoList() {
            return this.todoList;
        }

        public GetMergeRequestResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetMergeRequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
