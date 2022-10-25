// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListMergeRequestsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListMergeRequestsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
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

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers self = new ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExtraUsers")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults self = new ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
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

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setExtraUsers(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers self = new ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExtraUsers")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers;

        @NameInMap("SatisfiedItems")
        public java.util.List<String> satisfiedItems;

        @NameInMap("UnsatisfiedItems")
        public java.util.List<String> unsatisfiedItems;

        public static ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults self = new ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
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

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setExtraUsers(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> extraUsers) {
            this.extraUsers = extraUsers;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResultsExtraUsers> getExtraUsers() {
            return this.extraUsers;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setSatisfiedItems(java.util.List<String> satisfiedItems) {
            this.satisfiedItems = satisfiedItems;
            return this;
        }
        public java.util.List<String> getSatisfiedItems() {
            return this.satisfiedItems;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults setUnsatisfiedItems(java.util.List<String> unsatisfiedItems) {
            this.unsatisfiedItems = unsatisfiedItems;
            return this;
        }
        public java.util.List<String> getUnsatisfiedItems() {
            return this.unsatisfiedItems;
        }

    }

    public static class ListMergeRequestsResponseBodyResultApproveCheckResult extends TeaModel {
        @NameInMap("SatisfiedCheckResults")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults;

        @NameInMap("TotalCheckResult")
        public String totalCheckResult;

        @NameInMap("UnsatisfiedCheckResults")
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults;

        public static ListMergeRequestsResponseBodyResultApproveCheckResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultApproveCheckResult self = new ListMergeRequestsResponseBodyResultApproveCheckResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResult setSatisfiedCheckResults(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults> satisfiedCheckResults) {
            this.satisfiedCheckResults = satisfiedCheckResults;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultSatisfiedCheckResults> getSatisfiedCheckResults() {
            return this.satisfiedCheckResults;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResult setTotalCheckResult(String totalCheckResult) {
            this.totalCheckResult = totalCheckResult;
            return this;
        }
        public String getTotalCheckResult() {
            return this.totalCheckResult;
        }

        public ListMergeRequestsResponseBodyResultApproveCheckResult setUnsatisfiedCheckResults(java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> unsatisfiedCheckResults) {
            this.unsatisfiedCheckResults = unsatisfiedCheckResults;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultApproveCheckResultUnsatisfiedCheckResults> getUnsatisfiedCheckResults() {
            return this.unsatisfiedCheckResults;
        }

    }

    public static class ListMergeRequestsResponseBodyResultAssigneeList extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static ListMergeRequestsResponseBodyResultAssigneeList build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResultAssigneeList self = new ListMergeRequestsResponseBodyResultAssigneeList();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestsResponseBodyResultAssigneeList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListMergeRequestsResponseBodyResultAuthor extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

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

        public ListMergeRequestsResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
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

    }

    public static class ListMergeRequestsResponseBodyResult extends TeaModel {
        @NameInMap("AcceptedRevision")
        public String acceptedRevision;

        @NameInMap("AheadCommitCount")
        public Integer aheadCommitCount;

        @NameInMap("ApproveCheckResult")
        public ListMergeRequestsResponseBodyResultApproveCheckResult approveCheckResult;

        @NameInMap("AssigneeList")
        public java.util.List<ListMergeRequestsResponseBodyResultAssigneeList> assigneeList;

        @NameInMap("Author")
        public ListMergeRequestsResponseBodyResultAuthor author;

        @NameInMap("BehindCommitCount")
        public Integer behindCommitCount;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsSupportMerge")
        public Boolean isSupportMerge;

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

        public static ListMergeRequestsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestsResponseBodyResult self = new ListMergeRequestsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestsResponseBodyResult setAcceptedRevision(String acceptedRevision) {
            this.acceptedRevision = acceptedRevision;
            return this;
        }
        public String getAcceptedRevision() {
            return this.acceptedRevision;
        }

        public ListMergeRequestsResponseBodyResult setAheadCommitCount(Integer aheadCommitCount) {
            this.aheadCommitCount = aheadCommitCount;
            return this;
        }
        public Integer getAheadCommitCount() {
            return this.aheadCommitCount;
        }

        public ListMergeRequestsResponseBodyResult setApproveCheckResult(ListMergeRequestsResponseBodyResultApproveCheckResult approveCheckResult) {
            this.approveCheckResult = approveCheckResult;
            return this;
        }
        public ListMergeRequestsResponseBodyResultApproveCheckResult getApproveCheckResult() {
            return this.approveCheckResult;
        }

        public ListMergeRequestsResponseBodyResult setAssigneeList(java.util.List<ListMergeRequestsResponseBodyResultAssigneeList> assigneeList) {
            this.assigneeList = assigneeList;
            return this;
        }
        public java.util.List<ListMergeRequestsResponseBodyResultAssigneeList> getAssigneeList() {
            return this.assigneeList;
        }

        public ListMergeRequestsResponseBodyResult setAuthor(ListMergeRequestsResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestsResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public ListMergeRequestsResponseBodyResult setBehindCommitCount(Integer behindCommitCount) {
            this.behindCommitCount = behindCommitCount;
            return this;
        }
        public Integer getBehindCommitCount() {
            return this.behindCommitCount;
        }

        public ListMergeRequestsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMergeRequestsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestsResponseBodyResult setIsSupportMerge(Boolean isSupportMerge) {
            this.isSupportMerge = isSupportMerge;
            return this;
        }
        public Boolean getIsSupportMerge() {
            return this.isSupportMerge;
        }

        public ListMergeRequestsResponseBodyResult setMergeError(String mergeError) {
            this.mergeError = mergeError;
            return this;
        }
        public String getMergeError() {
            return this.mergeError;
        }

        public ListMergeRequestsResponseBodyResult setMergeStatus(String mergeStatus) {
            this.mergeStatus = mergeStatus;
            return this;
        }
        public String getMergeStatus() {
            return this.mergeStatus;
        }

        public ListMergeRequestsResponseBodyResult setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public ListMergeRequestsResponseBodyResult setMergedRevision(String mergedRevision) {
            this.mergedRevision = mergedRevision;
            return this;
        }
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        public ListMergeRequestsResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListMergeRequestsResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListMergeRequestsResponseBodyResult setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public ListMergeRequestsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestsResponseBodyResult setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
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

    }

}
