// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class MergeMergeRequestResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public MergeMergeRequestResponseBodyResult result;

    public static MergeMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeMergeRequestResponseBody self = new MergeMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MergeMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MergeMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MergeMergeRequestResponseBody setResult(MergeMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public MergeMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public static class MergeMergeRequestResponseBodyResultAssigneeList extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public String id;

        public static MergeMergeRequestResponseBodyResultAssigneeList build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultAssigneeList self = new MergeMergeRequestResponseBodyResultAssigneeList();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultAssigneeList setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public MergeMergeRequestResponseBodyResultAssigneeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MergeMergeRequestResponseBodyResultAssigneeList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public MergeMergeRequestResponseBodyResultAssigneeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class MergeMergeRequestResponseBodyResultAuthor extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static MergeMergeRequestResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultAuthor self = new MergeMergeRequestResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public MergeMergeRequestResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MergeMergeRequestResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public MergeMergeRequestResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers self = new MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("ExtraUsers")
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        public static MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults self = new MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setExtraUsers(java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

    }

    public static class MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers self = new MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("ExtraUsers")
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        public static MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults self = new MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setExtraUsers(java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

    }

    public static class MergeMergeRequestResponseBodyResultApproveCheckResult extends TeaModel {
        @NameInMap("TotalCheckResult")
        public String totalCheckResult;

        @NameInMap("SatisfiedCheckResults")
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults;

        @NameInMap("UnsatisfiedCheckResults")
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults;

        public static MergeMergeRequestResponseBodyResultApproveCheckResult build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResultApproveCheckResult self = new MergeMergeRequestResponseBodyResultApproveCheckResult();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResult setTotalCheckResult(String totalCheckResult) {
            this.totalCheckResult = totalCheckResult;
            return this;
        }
        public String getTotalCheckResult() {
            return this.totalCheckResult;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResult setSatisfiedCheckResults(java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults) {
            this.satisfiedCheckResults = satisfiedCheckResults;
            return this;
        }
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultSatisfiedCheckResults> getSatisfiedCheckResults() {
            return this.satisfiedCheckResults;
        }

        public MergeMergeRequestResponseBodyResultApproveCheckResult setUnsatisfiedCheckResults(java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults) {
            this.unsatisfiedCheckResults = unsatisfiedCheckResults;
            return this;
        }
        public java.util.List<MergeMergeRequestResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> getUnsatisfiedCheckResults() {
            return this.unsatisfiedCheckResults;
        }

    }

    public static class MergeMergeRequestResponseBodyResult extends TeaModel {
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
        public java.util.List<MergeMergeRequestResponseBodyResultAssigneeList> assigneeList;

        @NameInMap("Author")
        public MergeMergeRequestResponseBodyResultAuthor author;

        @NameInMap("ApproveCheckResult")
        public MergeMergeRequestResponseBodyResultApproveCheckResult approveCheckResult;

        public static MergeMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResult self = new MergeMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResult setBehindCommitCount(Integer behindCommitCount) {
            this.behindCommitCount = behindCommitCount;
            return this;
        }
        public Integer getBehindCommitCount() {
            return this.behindCommitCount;
        }

        public MergeMergeRequestResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public MergeMergeRequestResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public MergeMergeRequestResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public MergeMergeRequestResponseBodyResult setAcceptedRevision(String acceptedRevision) {
            this.acceptedRevision = acceptedRevision;
            return this;
        }
        public String getAcceptedRevision() {
            return this.acceptedRevision;
        }

        public MergeMergeRequestResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public MergeMergeRequestResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public MergeMergeRequestResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MergeMergeRequestResponseBodyResult setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public MergeMergeRequestResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public MergeMergeRequestResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public MergeMergeRequestResponseBodyResult setAheadCommitCount(Integer aheadCommitCount) {
            this.aheadCommitCount = aheadCommitCount;
            return this;
        }
        public Integer getAheadCommitCount() {
            return this.aheadCommitCount;
        }

        public MergeMergeRequestResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public MergeMergeRequestResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public MergeMergeRequestResponseBodyResult setMergeError(String mergeError) {
            this.mergeError = mergeError;
            return this;
        }
        public String getMergeError() {
            return this.mergeError;
        }

        public MergeMergeRequestResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public MergeMergeRequestResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public MergeMergeRequestResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public MergeMergeRequestResponseBodyResult setAssigneeList(java.util.List<MergeMergeRequestResponseBodyResultAssigneeList> assigneeList) {
            this.assigneeList = assigneeList;
            return this;
        }
        public java.util.List<MergeMergeRequestResponseBodyResultAssigneeList> getAssigneeList() {
            return this.assigneeList;
        }

        public MergeMergeRequestResponseBodyResult setAuthor(MergeMergeRequestResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public MergeMergeRequestResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public MergeMergeRequestResponseBodyResult setApproveCheckResult(MergeMergeRequestResponseBodyResultApproveCheckResult approveCheckResult) {
            this.approveCheckResult = approveCheckResult;
            return this;
        }
        public MergeMergeRequestResponseBodyResultApproveCheckResult getApproveCheckResult() {
            return this.approveCheckResult;
        }

    }

}
