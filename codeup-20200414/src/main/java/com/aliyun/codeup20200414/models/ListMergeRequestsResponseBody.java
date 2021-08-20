// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListMergeRequestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public java.util.List<ListMergeRequestsResponseBodyResult> result;

    public static ListMergeRequestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestsResponseBody self = new ListMergeRequestsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListMergeRequestsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMergeRequestsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestsResponseBody setResult(java.util.List<ListMergeRequestsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListMergeRequestsResponseBodyResultAssigneeList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListMergeRequestsResponseBodyResultAssigneeList build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultAssigneeList self = new ListMergeRequestsResponseBodyResultAssigneeList();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers self = new ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("ExtraUsers")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults self = new ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setExtraUsers(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers self = new ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("ExtraUsers")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults self = new ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setExtraUsers(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResult extends TeaModel {
        @NameInMap("TotalCheckResult")
        public String totalCheckResult;

        @NameInMap("SatisfiedCheckResults")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults;

        @NameInMap("UnsatisfiedCheckResults")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults;

        public static ListMergeRequestsResponseBodyResultApproveCheckResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResult self = new ListMergeRequestsResponseBodyResultApproveCheckResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResult setTotalCheckResult(String totalCheckResult) {
            this.totalCheckResult = totalCheckResult;
            return this;
        }
        public String getTotalCheckResult() {
            return this.totalCheckResult;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResult setSatisfiedCheckResults(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults) {
            this.satisfiedCheckResults = satisfiedCheckResults;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults> getSatisfiedCheckResults() {
            return this.satisfiedCheckResults;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResult setUnsatisfiedCheckResults(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults) {
            this.unsatisfiedCheckResults = unsatisfiedCheckResults;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> getUnsatisfiedCheckResults() {
            return this.unsatisfiedCheckResults;
        }

    }

    public static class ListMergeRequestsResponseBodyResultAuthor extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static ListMergeRequestsResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultAuthor self = new ListMergeRequestsResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListMergeRequestsResponseBodyResult extends TeaModel {
        @NameInMap("IsSupportMerge")
        public Boolean isSupportMerge;

        @NameInMap("State")
        public String state;

        @NameInMap("BehindCommitCount")
        public Integer behindCommitCount;

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

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("MergeType")
        public String mergeType;

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
        public java.util.List<ListMergeRequestsResponseBodyResultAssigneeList> assigneeList;

        @NameInMap("ApproveCheckResult")
        public ListMergeRequestsResponseBodyResultApproveCheckResult approveCheckResult;

        @NameInMap("Author")
        public ListMergeRequestsResponseBodyResultAuthor author;

        public static ListMergeRequestsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResult self = new ListMergeRequestsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResult setIsSupportMerge(Boolean isSupportMerge) {
            this.isSupportMerge = isSupportMerge;
            return this;
        }
        public Boolean getIsSupportMerge() {
            return this.isSupportMerge;
        }

        public ListMergeRequestsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestsResponseBodyResult setBehindCommitCount(Integer behindCommitCount) {
            this.behindCommitCount = behindCommitCount;
            return this;
        }
        public Integer getBehindCommitCount() {
            return this.behindCommitCount;
        }

        public ListMergeRequestsResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListMergeRequestsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestsResponseBodyResult setAcceptedRevision(String acceptedRevision) {
            this.acceptedRevision = acceptedRevision;
            return this;
        }
        public String getAcceptedRevision() {
            return this.acceptedRevision;
        }

        public ListMergeRequestsResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public ListMergeRequestsResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ListMergeRequestsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMergeRequestsResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListMergeRequestsResponseBodyResult setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public ListMergeRequestsResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public ListMergeRequestsResponseBodyResult setAheadCommitCount(Integer aheadCommitCount) {
            this.aheadCommitCount = aheadCommitCount;
            return this;
        }
        public Integer getAheadCommitCount() {
            return this.aheadCommitCount;
        }

        public ListMergeRequestsResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListMergeRequestsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMergeRequestsResponseBodyResult setMergeError(String mergeError) {
            this.mergeError = mergeError;
            return this;
        }
        public String getMergeError() {
            return this.mergeError;
        }

        public ListMergeRequestsResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public ListMergeRequestsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public ListMergeRequestsResponseBodyResult setAssigneeList(java.util.List<ListMergeRequestsResponseBodyResultAssigneeList> assigneeList) {
            this.assigneeList = assigneeList;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultAssigneeList> getAssigneeList() {
            return this.assigneeList;
        }

        public ListMergeRequestsResponseBodyResult setApproveCheckResult(ListMergeRequestsResponseBodyResultApproveCheckResult approveCheckResult) {
            this.approveCheckResult = approveCheckResult;
            return this;
        }
        public ListMergeRequestsResponseBodyResultApproveCheckResult getApproveCheckResult() {
            return this.approveCheckResult;
        }

        public ListMergeRequestsResponseBodyResult setAuthor(ListMergeRequestsResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestsResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

    }

}
