// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateMergeRequestResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateMergeRequestResponseBodyResult result;

    public static CreateMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestResponseBody self = new CreateMergeRequestResponseBody();
        return TeaModel.build(map, self);
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

    public CreateMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMergeRequestResponseBody setResult(CreateMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateMergeRequestResponseBodyResultAssigneeList extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public String id;

        public static CreateMergeRequestResponseBodyResultAssigneeList build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultAssigneeList self = new CreateMergeRequestResponseBodyResultAssigneeList();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultAssigneeList setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public CreateMergeRequestResponseBodyResultAssigneeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultAssigneeList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultAssigneeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateMergeRequestResponseBodyResultAuthor extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static CreateMergeRequestResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultAuthor self = new CreateMergeRequestResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public CreateMergeRequestResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers self = new CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("ExtraUsers")
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        public static CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults self = new CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setExtraUsers(java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

    }

    public static class CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers self = new CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("ExtraUsers")
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        public static CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults self = new CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setExtraUsers(java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

    }

    public static class CreateMergeRequestResponseBodyResultApproveCheckResult extends TeaModel {
        @NameInMap("TotalCheckResult")
        public String totalCheckResult;

        @NameInMap("SatisfiedCheckResults")
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults;

        @NameInMap("UnsatisfiedCheckResults")
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults;

        public static CreateMergeRequestResponseBodyResultApproveCheckResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResultApproveCheckResult self = new CreateMergeRequestResponseBodyResultApproveCheckResult();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResult setTotalCheckResult(String totalCheckResult) {
            this.totalCheckResult = totalCheckResult;
            return this;
        }
        public String getTotalCheckResult() {
            return this.totalCheckResult;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResult setSatisfiedCheckResults(java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults) {
            this.satisfiedCheckResults = satisfiedCheckResults;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> getSatisfiedCheckResults() {
            return this.satisfiedCheckResults;
        }

        public CreateMergeRequestResponseBodyResultApproveCheckResult setUnsatisfiedCheckResults(java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults) {
            this.unsatisfiedCheckResults = unsatisfiedCheckResults;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> getUnsatisfiedCheckResults() {
            return this.unsatisfiedCheckResults;
        }

    }

    public static class CreateMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("BehindCommitCount")
        public Integer behindCommitCount;

        @NameInMap("State")
        public String state;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("AcceptedRevision")
        public String acceptedRevision;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("MergeType")
        public String mergeType;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("TargetBranch")
        public String targetBranch;

        @NameInMap("AheadCommitCount")
        public Integer aheadCommitCount;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("MergeError")
        public String mergeError;

        @NameInMap("MergedRevision")
        public String mergedRevision;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MergeStatus")
        public String mergeStatus;

        @NameInMap("AssigneeList")
        public java.util.List<CreateMergeRequestResponseBodyResultAssigneeList> assigneeList;

        @NameInMap("Author")
        public CreateMergeRequestResponseBodyResultAuthor author;

        @NameInMap("ApproveCheckResult")
        public CreateMergeRequestResponseBodyResultApproveCheckResult approveCheckResult;

        public static CreateMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestResponseBodyResult self = new CreateMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestResponseBodyResult setBehindCommitCount(Integer behindCommitCount) {
            this.behindCommitCount = behindCommitCount;
            return this;
        }
        public Integer getBehindCommitCount() {
            return this.behindCommitCount;
        }

        public CreateMergeRequestResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateMergeRequestResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateMergeRequestResponseBodyResult setAcceptedRevision(String acceptedRevision) {
            this.acceptedRevision = acceptedRevision;
            return this;
        }
        public String getAcceptedRevision() {
            return this.acceptedRevision;
        }

        public CreateMergeRequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public CreateMergeRequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateMergeRequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMergeRequestResponseBodyResult setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public CreateMergeRequestResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public CreateMergeRequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public CreateMergeRequestResponseBodyResult setAheadCommitCount(Integer aheadCommitCount) {
            this.aheadCommitCount = aheadCommitCount;
            return this;
        }
        public Integer getAheadCommitCount() {
            return this.aheadCommitCount;
        }

        public CreateMergeRequestResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateMergeRequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateMergeRequestResponseBodyResult setMergeError(String mergeError) {
            this.mergeError = mergeError;
            return this;
        }
        public String getMergeError() {
            return this.mergeError;
        }

        public CreateMergeRequestResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public CreateMergeRequestResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateMergeRequestResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public CreateMergeRequestResponseBodyResult setAssigneeList(java.util.List<CreateMergeRequestResponseBodyResultAssigneeList> assigneeList) {
            this.assigneeList = assigneeList;
            return this;
        }
        public java.util.List<CreateMergeRequestResponseBodyResultAssigneeList> getAssigneeList() {
            return this.assigneeList;
        }

        public CreateMergeRequestResponseBodyResult setAuthor(CreateMergeRequestResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public CreateMergeRequestResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public CreateMergeRequestResponseBodyResult setApproveCheckResult(CreateMergeRequestResponseBodyResultApproveCheckResult approveCheckResult) {
            this.approveCheckResult = approveCheckResult;
            return this;
        }
        public CreateMergeRequestResponseBodyResultApproveCheckResult getApproveCheckResult() {
            return this.approveCheckResult;
        }

    }

}
