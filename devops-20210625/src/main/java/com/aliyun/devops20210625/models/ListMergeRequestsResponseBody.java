// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
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
         * <p>19927</p>
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

    public static class ListMergeRequestsResponseBodyResultLabels extends TeaModel {
        @NameInMap("color")
        public String color;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        public static ListMergeRequestsResponseBodyResultLabels build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultLabels self = new ListMergeRequestsResponseBodyResultLabels();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultLabels setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ListMergeRequestsResponseBodyResultLabels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMergeRequestsResponseBodyResultLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMergeRequestsResponseBodyResultReviewers extends TeaModel {
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

        @NameInMap("hasCommented")
        public Boolean hasCommented;

        @NameInMap("hasReviewed")
        public Boolean hasReviewed;

        /**
         * <strong>example:</strong>
         * <p>43127</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-review-user</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("reviewOpinionStatus")
        public String reviewOpinionStatus;

        @NameInMap("reviewTime")
        public String reviewTime;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>approved</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>root-test-review-user</p>
         */
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

        public ListMergeRequestsResponseBodyResultReviewers setHasCommented(Boolean hasCommented) {
            this.hasCommented = hasCommented;
            return this;
        }
        public Boolean getHasCommented() {
            return this.hasCommented;
        }

        public ListMergeRequestsResponseBodyResultReviewers setHasReviewed(Boolean hasReviewed) {
            this.hasReviewed = hasReviewed;
            return this;
        }
        public Boolean getHasReviewed() {
            return this.hasReviewed;
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

        public ListMergeRequestsResponseBodyResultReviewers setReviewOpinionStatus(String reviewOpinionStatus) {
            this.reviewOpinionStatus = reviewOpinionStatus;
            return this;
        }
        public String getReviewOpinionStatus() {
            return this.reviewOpinionStatus;
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
         * <p>1876119</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-subscriber</p>
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
         * <p>root-test-subscriber</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>WEB</p>
         */
        @NameInMap("creationMethod")
        public String creationMethod;

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
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("iid")
        public Long iid;

        @NameInMap("labels")
        public java.util.List<ListMergeRequestsResponseBodyResultLabels> labels;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("localId")
        public Long localId;

        @NameInMap("mergedRevision")
        public String mergedRevision;

        /**
         * <strong>example:</strong>
         * <p>bca90244c4b749e0b109df52ac0eb570</p>
         */
        @NameInMap("mrBizId")
        public String mrBizId;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("newMergeRequestIdentifier")
        public Boolean newMergeRequestIdentifier;

        /**
         * <strong>example:</strong>
         * <p>UNDER_REVIEW</p>
         */
        @NameInMap("newVersionState")
        public String newVersionState;

        /**
         * <strong>example:</strong>
         * <p>2369234</p>
         */
        @NameInMap("projectId")
        public Long projectId;

        @NameInMap("reviewers")
        public java.util.List<ListMergeRequestsResponseBodyResultReviewers> reviewers;

        /**
         * <strong>example:</strong>
         * <p>test-merge-source-branch</p>
         */
        @NameInMap("sourceBranch")
        public String sourceBranch;

        /**
         * <strong>example:</strong>
         * <p>2876119</p>
         */
        @NameInMap("sourceProjectId")
        public Long sourceProjectId;

        /**
         * <strong>example:</strong>
         * <p>BRANCH</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>git@xxx:xxx/test/test.git</p>
         */
        @NameInMap("sshUrl")
        public String sshUrl;

        /**
         * <strong>example:</strong>
         * <p>opened</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("subscribers")
        public java.util.List<ListMergeRequestsResponseBodyResultSubscribers> subscribers;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportMergeFFOnly")
        public Boolean supportMergeFFOnly;

        /**
         * <strong>example:</strong>
         * <p>test-merge-target-branch</p>
         */
        @NameInMap("targetBranch")
        public String targetBranch;

        /**
         * <strong>example:</strong>
         * <p>2876119</p>
         */
        @NameInMap("targetProjectId")
        public Long targetProjectId;

        /**
         * <strong>example:</strong>
         * <p>BRANCH</p>
         */
        @NameInMap("targetType")
        public String targetType;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("webUrl")
        public String webUrl;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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

        public ListMergeRequestsResponseBodyResult setLabels(java.util.List<ListMergeRequestsResponseBodyResultLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultLabels> getLabels() {
            return this.labels;
        }

        public ListMergeRequestsResponseBodyResult setLocalId(Long localId) {
            this.localId = localId;
            return this;
        }
        public Long getLocalId() {
            return this.localId;
        }

        public ListMergeRequestsResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
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
