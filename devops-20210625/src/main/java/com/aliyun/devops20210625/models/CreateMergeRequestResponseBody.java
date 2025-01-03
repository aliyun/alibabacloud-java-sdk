// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateMergeRequestResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateMergeRequestResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestResponseBody self = new CreateMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMergeRequestResponseBody setResult(CreateMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public CreateMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMergeRequestResponseBodyResultAuthor extends TeaModel {
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
         * <p>test-codeup-nickname</p>
         */
        @NameInMap("username")
        public String username;

        public static CreateMergeRequestResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultAuthor self = new CreateMergeRequestResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateMergeRequestResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateMergeRequestResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateMergeRequestResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateMergeRequestResponseBodyResultReviewers extends TeaModel {
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
         * <p>false</p>
         */
        @NameInMap("hasReviewed")
        public Boolean hasReviewed;

        /**
         * <strong>example:</strong>
         * <p>7905</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("reviewOpinionStatus")
        public String reviewOpinionStatus;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>root-codeup</p>
         */
        @NameInMap("username")
        public String username;

        public static CreateMergeRequestResponseBodyResultReviewers build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultReviewers self = new CreateMergeRequestResponseBodyResultReviewers();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultReviewers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultReviewers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateMergeRequestResponseBodyResultReviewers setHasReviewed(Boolean hasReviewed) {
            this.hasReviewed = hasReviewed;
            return this;
        }
        public Boolean getHasReviewed() {
            return this.hasReviewed;
        }

        public CreateMergeRequestResponseBodyResultReviewers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateMergeRequestResponseBodyResultReviewers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultReviewers setReviewOpinionStatus(String reviewOpinionStatus) {
            this.reviewOpinionStatus = reviewOpinionStatus;
            return this;
        }
        public String getReviewOpinionStatus() {
            return this.reviewOpinionStatus;
        }

        public CreateMergeRequestResponseBodyResultReviewers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateMergeRequestResponseBodyResultReviewers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateMergeRequestResponseBodyResultSubscribers extends TeaModel {
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
         * <p>10092</p>
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
         * <p>root-test-codeup</p>
         */
        @NameInMap("username")
        public String username;

        public static CreateMergeRequestResponseBodyResultSubscribers build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultSubscribers self = new CreateMergeRequestResponseBodyResultSubscribers();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultSubscribers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultSubscribers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateMergeRequestResponseBodyResultSubscribers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateMergeRequestResponseBodyResultSubscribers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultSubscribers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateMergeRequestResponseBodyResultSubscribers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateMergeRequestResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ahead")
        public Integer ahead;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("allRequirementsPass")
        public Boolean allRequirementsPass;

        @NameInMap("author")
        public CreateMergeRequestResponseBodyResultAuthor author;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("behind")
        public Integer behind;

        /**
         * <strong>example:</strong>
         * <p>WEB</p>
         */
        @NameInMap("createFrom")
        public String createFrom;

        /**
         * <strong>example:</strong>
         * <p>2023-06-02T03:41:22Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("detailUrl")
        public String detailUrl;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("localId")
        public Long localId;

        /**
         * <strong>example:</strong>
         * <p>bca90244c4b749e0b109df52ac0eb570</p>
         */
        @NameInMap("mrBizId")
        public String mrBizId;

        /**
         * <strong>example:</strong>
         * <p>CODE_REVIEW</p>
         */
        @NameInMap("mrType")
        public String mrType;

        /**
         * <strong>example:</strong>
         * <p>2369234</p>
         */
        @NameInMap("projectId")
        public Long projectId;

        @NameInMap("reviewers")
        public java.util.List<CreateMergeRequestResponseBodyResultReviewers> reviewers;

        /**
         * <strong>example:</strong>
         * <p>sourceBranch</p>
         */
        @NameInMap("sourceBranch")
        public String sourceBranch;

        /**
         * <strong>example:</strong>
         * <p>2369234</p>
         */
        @NameInMap("sourceProjectId")
        public Long sourceProjectId;

        /**
         * <strong>example:</strong>
         * <p>UNDER_REVIEW</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("subscribers")
        public java.util.List<CreateMergeRequestResponseBodyResultSubscribers> subscribers;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportMergeFastForwardOnly")
        public Boolean supportMergeFastForwardOnly;

        /**
         * <strong>example:</strong>
         * <p>targetBranch</p>
         */
        @NameInMap("targetBranch")
        public String targetBranch;

        /**
         * <strong>example:</strong>
         * <p>2369234</p>
         */
        @NameInMap("targetProjectId")
        public Long targetProjectId;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2023-06-02T03:41:22Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://codeup.aliyun.com/xxx/test/test">https://codeup.aliyun.com/xxx/test/test</a></p>
         */
        @NameInMap("webUrl")
        public String webUrl;

        public static CreateMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResult self = new CreateMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResult setAhead(Integer ahead) {
            this.ahead = ahead;
            return this;
        }
        public Integer getAhead() {
            return this.ahead;
        }

        public CreateMergeRequestResponseBodyResult setAllRequirementsPass(Boolean allRequirementsPass) {
            this.allRequirementsPass = allRequirementsPass;
            return this;
        }
        public Boolean getAllRequirementsPass() {
            return this.allRequirementsPass;
        }

        public CreateMergeRequestResponseBodyResult setAuthor(CreateMergeRequestResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public CreateMergeRequestResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public CreateMergeRequestResponseBodyResult setBehind(Integer behind) {
            this.behind = behind;
            return this;
        }
        public Integer getBehind() {
            return this.behind;
        }

        public CreateMergeRequestResponseBodyResult setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public CreateMergeRequestResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateMergeRequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMergeRequestResponseBodyResult setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public CreateMergeRequestResponseBodyResult setLocalId(Long localId) {
            this.localId = localId;
            return this;
        }
        public Long getLocalId() {
            return this.localId;
        }

        public CreateMergeRequestResponseBodyResult setMrBizId(String mrBizId) {
            this.mrBizId = mrBizId;
            return this;
        }
        public String getMrBizId() {
            return this.mrBizId;
        }

        public CreateMergeRequestResponseBodyResult setMrType(String mrType) {
            this.mrType = mrType;
            return this;
        }
        public String getMrType() {
            return this.mrType;
        }

        public CreateMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateMergeRequestResponseBodyResult setReviewers(java.util.List<CreateMergeRequestResponseBodyResultReviewers> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultReviewers> getReviewers() {
            return this.reviewers;
        }

        public CreateMergeRequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public CreateMergeRequestResponseBodyResult setSourceProjectId(Long sourceProjectId) {
            this.sourceProjectId = sourceProjectId;
            return this;
        }
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        public CreateMergeRequestResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateMergeRequestResponseBodyResult setSubscribers(java.util.List<CreateMergeRequestResponseBodyResultSubscribers> subscribers) {
            this.subscribers = subscribers;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultSubscribers> getSubscribers() {
            return this.subscribers;
        }

        public CreateMergeRequestResponseBodyResult setSupportMergeFastForwardOnly(Boolean supportMergeFastForwardOnly) {
            this.supportMergeFastForwardOnly = supportMergeFastForwardOnly;
            return this;
        }
        public Boolean getSupportMergeFastForwardOnly() {
            return this.supportMergeFastForwardOnly;
        }

        public CreateMergeRequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public CreateMergeRequestResponseBodyResult setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public CreateMergeRequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateMergeRequestResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateMergeRequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
