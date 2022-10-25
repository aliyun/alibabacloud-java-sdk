// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateMergeRequestResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestResponseBody self = new UpdateMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMergeRequestResponseBody setResult(UpdateMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers self = new UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExtraUsers")
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        public static UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults self = new UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setExtraUsers(java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

    }

    public static class UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers self = new UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExtraUsers")
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        public static UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults self = new UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setExtraUsers(java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

    }

    public static class UpdateMergeRequestResponseBodyResultApproveCheckResult extends TeaModel {
        @NameInMap("SatisfiedCheckResults")
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults;

        @NameInMap("TotalCheckResult")
        public String totalCheckResult;

        @NameInMap("UnsatisfiedCheckResults")
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults;

        public static UpdateMergeRequestResponseBodyResultApproveCheckResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultApproveCheckResult self = new UpdateMergeRequestResponseBodyResultApproveCheckResult();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResult setSatisfiedCheckResults(java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults) {
            this.satisfiedCheckResults = satisfiedCheckResults;
            return this;
        }
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> getSatisfiedCheckResults() {
            return this.satisfiedCheckResults;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResult setTotalCheckResult(String totalCheckResult) {
            this.totalCheckResult = totalCheckResult;
            return this;
        }
        public String getTotalCheckResult() {
            return this.totalCheckResult;
        }

        public UpdateMergeRequestResponseBodyResultApproveCheckResult setUnsatisfiedCheckResults(java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults) {
            this.unsatisfiedCheckResults = unsatisfiedCheckResults;
            return this;
        }
        public java.util.List<UpdateMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> getUnsatisfiedCheckResults() {
            return this.unsatisfiedCheckResults;
        }

    }

    public static class UpdateMergeRequestResponseBodyResultAssigneeList extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static UpdateMergeRequestResponseBodyResultAssigneeList build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultAssigneeList self = new UpdateMergeRequestResponseBodyResultAssigneeList();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultAssigneeList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateMergeRequestResponseBodyResultAssigneeList setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public UpdateMergeRequestResponseBodyResultAssigneeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateMergeRequestResponseBodyResultAssigneeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMergeRequestResponseBodyResultAuthor extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static UpdateMergeRequestResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResultAuthor self = new UpdateMergeRequestResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateMergeRequestResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public UpdateMergeRequestResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateMergeRequestResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("AcceptedRevision")
        public String acceptedRevision;

        @NameInMap("AheadCommitCount")
        public Integer aheadCommitCount;

        @NameInMap("ApproveCheckResult")
        public UpdateMergeRequestResponseBodyResultApproveCheckResult approveCheckResult;

        @NameInMap("AssigneeList")
        public java.util.List<UpdateMergeRequestResponseBodyResultAssigneeList> assigneeList;

        @NameInMap("Author")
        public UpdateMergeRequestResponseBodyResultAuthor author;

        @NameInMap("BehindCommitCount")
        public Integer behindCommitCount;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MergeError")
        public String mergeError;

        @NameInMap("MergeStatus")
        public String mergeStatus;

        @NameInMap("MergeType")
        public String mergeType;

        @NameInMap("MergedRevision")
        public String mergedRevision;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("State")
        public String state;

        @NameInMap("TargetBranch")
        public String targetBranch;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("WebUrl")
        public String webUrl;

        public static UpdateMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResult self = new UpdateMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResult setAcceptedRevision(String acceptedRevision) {
            this.acceptedRevision = acceptedRevision;
            return this;
        }
        public String getAcceptedRevision() {
            return this.acceptedRevision;
        }

        public UpdateMergeRequestResponseBodyResult setAheadCommitCount(Integer aheadCommitCount) {
            this.aheadCommitCount = aheadCommitCount;
            return this;
        }
        public Integer getAheadCommitCount() {
            return this.aheadCommitCount;
        }

        public UpdateMergeRequestResponseBodyResult setApproveCheckResult(UpdateMergeRequestResponseBodyResultApproveCheckResult approveCheckResult) {
            this.approveCheckResult = approveCheckResult;
            return this;
        }
        public UpdateMergeRequestResponseBodyResultApproveCheckResult getApproveCheckResult() {
            return this.approveCheckResult;
        }

        public UpdateMergeRequestResponseBodyResult setAssigneeList(java.util.List<UpdateMergeRequestResponseBodyResultAssigneeList> assigneeList) {
            this.assigneeList = assigneeList;
            return this;
        }
        public java.util.List<UpdateMergeRequestResponseBodyResultAssigneeList> getAssigneeList() {
            return this.assigneeList;
        }

        public UpdateMergeRequestResponseBodyResult setAuthor(UpdateMergeRequestResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public UpdateMergeRequestResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public UpdateMergeRequestResponseBodyResult setBehindCommitCount(Integer behindCommitCount) {
            this.behindCommitCount = behindCommitCount;
            return this;
        }
        public Integer getBehindCommitCount() {
            return this.behindCommitCount;
        }

        public UpdateMergeRequestResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateMergeRequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMergeRequestResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateMergeRequestResponseBodyResult setMergeError(String mergeError) {
            this.mergeError = mergeError;
            return this;
        }
        public String getMergeError() {
            return this.mergeError;
        }

        public UpdateMergeRequestResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public UpdateMergeRequestResponseBodyResult setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public UpdateMergeRequestResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public UpdateMergeRequestResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public UpdateMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateMergeRequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public UpdateMergeRequestResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateMergeRequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public UpdateMergeRequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateMergeRequestResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateMergeRequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
