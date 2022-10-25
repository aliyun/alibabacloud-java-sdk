// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AcceptMergeRequestResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AcceptMergeRequestResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static AcceptMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptMergeRequestResponseBody self = new AcceptMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AcceptMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AcceptMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AcceptMergeRequestResponseBody setResult(AcceptMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AcceptMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public AcceptMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers self = new AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExtraUsers")
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        public static AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults self = new AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setExtraUsers(java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

    }

    public static class AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers self = new AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExtraUsers")
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        public static AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults self = new AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setExtraUsers(java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

    }

    public static class AcceptMergeRequestResponseBodyResultApproveCheckResult extends TeaModel {
        @NameInMap("SatisfiedCheckResults")
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults;

        @NameInMap("TotalCheckResult")
        public String totalCheckResult;

        @NameInMap("UnsatisfiedCheckResults")
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults;

        public static AcceptMergeRequestResponseBodyResultApproveCheckResult build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultApproveCheckResult self = new AcceptMergeRequestResponseBodyResultApproveCheckResult();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResult setSatisfiedCheckResults(java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults) {
            this.satisfiedCheckResults = satisfiedCheckResults;
            return this;
        }
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> getSatisfiedCheckResults() {
            return this.satisfiedCheckResults;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResult setTotalCheckResult(String totalCheckResult) {
            this.totalCheckResult = totalCheckResult;
            return this;
        }
        public String getTotalCheckResult() {
            return this.totalCheckResult;
        }

        public AcceptMergeRequestResponseBodyResultApproveCheckResult setUnsatisfiedCheckResults(java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults) {
            this.unsatisfiedCheckResults = unsatisfiedCheckResults;
            return this;
        }
        public java.util.List<AcceptMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> getUnsatisfiedCheckResults() {
            return this.unsatisfiedCheckResults;
        }

    }

    public static class AcceptMergeRequestResponseBodyResultAssigneeList extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static AcceptMergeRequestResponseBodyResultAssigneeList build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultAssigneeList self = new AcceptMergeRequestResponseBodyResultAssigneeList();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultAssigneeList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AcceptMergeRequestResponseBodyResultAssigneeList setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public AcceptMergeRequestResponseBodyResultAssigneeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AcceptMergeRequestResponseBodyResultAssigneeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AcceptMergeRequestResponseBodyResultAuthor extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static AcceptMergeRequestResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResultAuthor self = new AcceptMergeRequestResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AcceptMergeRequestResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public AcceptMergeRequestResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AcceptMergeRequestResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AcceptMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("AcceptedRevision")
        public String acceptedRevision;

        @NameInMap("AheadCommitCount")
        public Integer aheadCommitCount;

        @NameInMap("ApproveCheckResult")
        public AcceptMergeRequestResponseBodyResultApproveCheckResult approveCheckResult;

        @NameInMap("AssigneeList")
        public java.util.List<AcceptMergeRequestResponseBodyResultAssigneeList> assigneeList;

        @NameInMap("Author")
        public AcceptMergeRequestResponseBodyResultAuthor author;

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

        public static AcceptMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AcceptMergeRequestResponseBodyResult self = new AcceptMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AcceptMergeRequestResponseBodyResult setAcceptedRevision(String acceptedRevision) {
            this.acceptedRevision = acceptedRevision;
            return this;
        }
        public String getAcceptedRevision() {
            return this.acceptedRevision;
        }

        public AcceptMergeRequestResponseBodyResult setAheadCommitCount(Integer aheadCommitCount) {
            this.aheadCommitCount = aheadCommitCount;
            return this;
        }
        public Integer getAheadCommitCount() {
            return this.aheadCommitCount;
        }

        public AcceptMergeRequestResponseBodyResult setApproveCheckResult(AcceptMergeRequestResponseBodyResultApproveCheckResult approveCheckResult) {
            this.approveCheckResult = approveCheckResult;
            return this;
        }
        public AcceptMergeRequestResponseBodyResultApproveCheckResult getApproveCheckResult() {
            return this.approveCheckResult;
        }

        public AcceptMergeRequestResponseBodyResult setAssigneeList(java.util.List<AcceptMergeRequestResponseBodyResultAssigneeList> assigneeList) {
            this.assigneeList = assigneeList;
            return this;
        }
        public java.util.List<AcceptMergeRequestResponseBodyResultAssigneeList> getAssigneeList() {
            return this.assigneeList;
        }

        public AcceptMergeRequestResponseBodyResult setAuthor(AcceptMergeRequestResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public AcceptMergeRequestResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public AcceptMergeRequestResponseBodyResult setBehindCommitCount(Integer behindCommitCount) {
            this.behindCommitCount = behindCommitCount;
            return this;
        }
        public Integer getBehindCommitCount() {
            return this.behindCommitCount;
        }

        public AcceptMergeRequestResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public AcceptMergeRequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AcceptMergeRequestResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AcceptMergeRequestResponseBodyResult setMergeError(String mergeError) {
            this.mergeError = mergeError;
            return this;
        }
        public String getMergeError() {
            return this.mergeError;
        }

        public AcceptMergeRequestResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public AcceptMergeRequestResponseBodyResult setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public AcceptMergeRequestResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public AcceptMergeRequestResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public AcceptMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public AcceptMergeRequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public AcceptMergeRequestResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AcceptMergeRequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public AcceptMergeRequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AcceptMergeRequestResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public AcceptMergeRequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
