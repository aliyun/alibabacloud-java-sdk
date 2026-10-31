// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRectifyFlowResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The rectification details.</p>
     */
    @NameInMap("Data")
    public GetRectifyFlowResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRectifyFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRectifyFlowResponseBody self = new GetRectifyFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRectifyFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRectifyFlowResponseBody setData(GetRectifyFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRectifyFlowResponseBodyData getData() {
        return this.data;
    }

    public GetRectifyFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRectifyFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRectifyFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRectifyFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRectifyFlowResponseBodyDataIssuesDataOwners extends TeaModel {
        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetRectifyFlowResponseBodyDataIssuesDataOwners build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowResponseBodyDataIssuesDataOwners self = new GetRectifyFlowResponseBodyDataIssuesDataOwners();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowResponseBodyDataIssuesDataOwners setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataOwners setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetRectifyFlowResponseBodyDataIssuesDataProblem extends TeaModel {
        /**
         * <p>The ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The ID of the parent object.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParentObjectId")
        public String parentObjectId;

        /**
         * <p>The contact email for the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123@test.com">123@test.com</a></p>
         */
        @NameInMap("ProblemContactMail")
        public String problemContactMail;

        /**
         * <p>Other contact information for the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProblemContactOther")
        public String problemContactOther;

        /**
         * <p>The contact phone number for the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProblemContactPhone")
        public String problemContactPhone;

        /**
         * <p>The description of the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProblemDesc")
        public String problemDesc;

        /**
         * <p>The submission method of the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>OPENAPI</p>
         */
        @NameInMap("ProblemSubmitType")
        public String problemSubmitType;

        /**
         * <p>The user who submitted the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("ProblemSubmitter")
        public String problemSubmitter;

        /**
         * <p>The name of the user who submitted the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProblemSubmitterUserName")
        public String problemSubmitterUserName;

        /**
         * <p>The type of the governance issue.</p>
         */
        @NameInMap("ProblemTypes")
        public java.util.List<String> problemTypes;

        public static GetRectifyFlowResponseBodyDataIssuesDataProblem build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowResponseBodyDataIssuesDataProblem self = new GetRectifyFlowResponseBodyDataIssuesDataProblem();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setParentObjectId(String parentObjectId) {
            this.parentObjectId = parentObjectId;
            return this;
        }
        public String getParentObjectId() {
            return this.parentObjectId;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemContactMail(String problemContactMail) {
            this.problemContactMail = problemContactMail;
            return this;
        }
        public String getProblemContactMail() {
            return this.problemContactMail;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemContactOther(String problemContactOther) {
            this.problemContactOther = problemContactOther;
            return this;
        }
        public String getProblemContactOther() {
            return this.problemContactOther;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemContactPhone(String problemContactPhone) {
            this.problemContactPhone = problemContactPhone;
            return this;
        }
        public String getProblemContactPhone() {
            return this.problemContactPhone;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemDesc(String problemDesc) {
            this.problemDesc = problemDesc;
            return this;
        }
        public String getProblemDesc() {
            return this.problemDesc;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemSubmitType(String problemSubmitType) {
            this.problemSubmitType = problemSubmitType;
            return this;
        }
        public String getProblemSubmitType() {
            return this.problemSubmitType;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemSubmitter(String problemSubmitter) {
            this.problemSubmitter = problemSubmitter;
            return this;
        }
        public String getProblemSubmitter() {
            return this.problemSubmitter;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemSubmitterUserName(String problemSubmitterUserName) {
            this.problemSubmitterUserName = problemSubmitterUserName;
            return this;
        }
        public String getProblemSubmitterUserName() {
            return this.problemSubmitterUserName;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataProblem setProblemTypes(java.util.List<String> problemTypes) {
            this.problemTypes = problemTypes;
            return this;
        }
        public java.util.List<String> getProblemTypes() {
            return this.problemTypes;
        }

    }

    public static class GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge extends TeaModel {
        /**
         * <p>The cause of the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The ID of the knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>649144693069</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The Solutions.</p>
         * 
         * <strong>example:</strong>
         * <p>teset</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>teset</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge self = new GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetRectifyFlowResponseBodyDataIssuesData extends TeaModel {
        /**
         * <p>The submission time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-22</p>
         */
        @NameInMap("CommitTime")
        public String commitTime;

        /**
         * <p>The ID of the governance object.</p>
         * 
         * <strong>example:</strong>
         * <p>768244593451</p>
         */
        @NameInMap("GovernItemId")
        public Long governItemId;

        /**
         * <p>The ID of the governance object.</p>
         * 
         * <strong>example:</strong>
         * <p>28783986302</p>
         */
        @NameInMap("GovernObjectId")
        public Long governObjectId;

        /**
         * <p>Specifies whether the rectification is in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRectify")
        public Boolean isRectify;

        /**
         * <p>The list of owners.</p>
         */
        @NameInMap("Owners")
        public java.util.List<GetRectifyFlowResponseBodyDataIssuesDataOwners> owners;

        /**
         * <p>The governance issue object.</p>
         */
        @NameInMap("Problem")
        public GetRectifyFlowResponseBodyDataIssuesDataProblem problem;

        /**
         * <p>The property map of the governance object.</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, String> properties;

        /**
         * <p>The ID of the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>813969529153</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        /**
         * <p>The name of the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RectifyName")
        public String rectifyName;

        /**
         * <p>The status of the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("RectifyStatus")
        public String rectifyStatus;

        /**
         * <p>The ID of the user who performs the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("RectifyUser")
        public String rectifyUser;

        /**
         * <p>The display name of the user who performs the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RectifyUserName")
        public String rectifyUserName;

        /**
         * <p>The related knowledge base.</p>
         */
        @NameInMap("RelatedKnowledge")
        public java.util.List<GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge> relatedKnowledge;

        /**
         * <p>The status of the governance object.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The submission method.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN API</p>
         */
        @NameInMap("SubmitType")
        public String submitType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>575244494646</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetRectifyFlowResponseBodyDataIssuesData build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowResponseBodyDataIssuesData self = new GetRectifyFlowResponseBodyDataIssuesData();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowResponseBodyDataIssuesData setCommitTime(String commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public String getCommitTime() {
            return this.commitTime;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setGovernItemId(Long governItemId) {
            this.governItemId = governItemId;
            return this;
        }
        public Long getGovernItemId() {
            return this.governItemId;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setGovernObjectId(Long governObjectId) {
            this.governObjectId = governObjectId;
            return this;
        }
        public Long getGovernObjectId() {
            return this.governObjectId;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setIsRectify(Boolean isRectify) {
            this.isRectify = isRectify;
            return this;
        }
        public Boolean getIsRectify() {
            return this.isRectify;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setOwners(java.util.List<GetRectifyFlowResponseBodyDataIssuesDataOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<GetRectifyFlowResponseBodyDataIssuesDataOwners> getOwners() {
            return this.owners;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setProblem(GetRectifyFlowResponseBodyDataIssuesDataProblem problem) {
            this.problem = problem;
            return this;
        }
        public GetRectifyFlowResponseBodyDataIssuesDataProblem getProblem() {
            return this.problem;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setProperties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setRectifyName(String rectifyName) {
            this.rectifyName = rectifyName;
            return this;
        }
        public String getRectifyName() {
            return this.rectifyName;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setRectifyStatus(String rectifyStatus) {
            this.rectifyStatus = rectifyStatus;
            return this;
        }
        public String getRectifyStatus() {
            return this.rectifyStatus;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setRectifyUser(String rectifyUser) {
            this.rectifyUser = rectifyUser;
            return this;
        }
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setRectifyUserName(String rectifyUserName) {
            this.rectifyUserName = rectifyUserName;
            return this;
        }
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setRelatedKnowledge(java.util.List<GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge> relatedKnowledge) {
            this.relatedKnowledge = relatedKnowledge;
            return this;
        }
        public java.util.List<GetRectifyFlowResponseBodyDataIssuesDataRelatedKnowledge> getRelatedKnowledge() {
            return this.relatedKnowledge;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setSubmitType(String submitType) {
            this.submitType = submitType;
            return this;
        }
        public String getSubmitType() {
            return this.submitType;
        }

        public GetRectifyFlowResponseBodyDataIssuesData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetRectifyFlowResponseBodyDataIssues extends TeaModel {
        /**
         * <p>The issues on the current page. The fields are consistent with the issue list.</p>
         */
        @NameInMap("Data")
        public java.util.List<GetRectifyFlowResponseBodyDataIssuesData> data;

        /**
         * <p>The total number of issues.</p>
         * 
         * <strong>example:</strong>
         * <p>467439222172</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetRectifyFlowResponseBodyDataIssues build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowResponseBodyDataIssues self = new GetRectifyFlowResponseBodyDataIssues();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowResponseBodyDataIssues setData(java.util.List<GetRectifyFlowResponseBodyDataIssuesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetRectifyFlowResponseBodyDataIssuesData> getData() {
            return this.data;
        }

        public GetRectifyFlowResponseBodyDataIssues setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetRectifyFlowResponseBodyData extends TeaModel {
        /**
         * <p>The completion time as a UNIX timestamp in milliseconds. This parameter is empty if the rectification is not completed.</p>
         * 
         * <strong>example:</strong>
         * <p>57753888419</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The pagination information for rectification issues. If the rectification has been accepted, the acceptance snapshot is used.</p>
         */
        @NameInMap("Issues")
        public GetRectifyFlowResponseBodyDataIssues issues;

        /**
         * <p>The total number of current issues in the process.</p>
         * 
         * <strong>example:</strong>
         * <p>415492404179</p>
         */
        @NameInMap("ProblemCount")
        public Long problemCount;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14561234364</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RectifyName")
        public String rectifyName;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RectifyPriority")
        public String rectifyPriority;

        /**
         * <p>The rectifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("RectifyUser")
        public String rectifyUser;

        /**
         * <p>The rectifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RectifyUserName")
        public String rectifyUserName;

        /**
         * <p>The start time, in UNIX milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>496002949493</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The process status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The initiator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("SubmitUser")
        public String submitUser;

        /**
         * <p>The initiator name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SubmitUserName")
        public String submitUserName;

        /**
         * <p>The verifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("VerifyUser")
        public String verifyUser;

        /**
         * <p>The verifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VerifyUserName")
        public String verifyUserName;

        public static GetRectifyFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowResponseBodyData self = new GetRectifyFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetRectifyFlowResponseBodyData setIssues(GetRectifyFlowResponseBodyDataIssues issues) {
            this.issues = issues;
            return this;
        }
        public GetRectifyFlowResponseBodyDataIssues getIssues() {
            return this.issues;
        }

        public GetRectifyFlowResponseBodyData setProblemCount(Long problemCount) {
            this.problemCount = problemCount;
            return this;
        }
        public Long getProblemCount() {
            return this.problemCount;
        }

        public GetRectifyFlowResponseBodyData setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

        public GetRectifyFlowResponseBodyData setRectifyName(String rectifyName) {
            this.rectifyName = rectifyName;
            return this;
        }
        public String getRectifyName() {
            return this.rectifyName;
        }

        public GetRectifyFlowResponseBodyData setRectifyPriority(String rectifyPriority) {
            this.rectifyPriority = rectifyPriority;
            return this;
        }
        public String getRectifyPriority() {
            return this.rectifyPriority;
        }

        public GetRectifyFlowResponseBodyData setRectifyUser(String rectifyUser) {
            this.rectifyUser = rectifyUser;
            return this;
        }
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        public GetRectifyFlowResponseBodyData setRectifyUserName(String rectifyUserName) {
            this.rectifyUserName = rectifyUserName;
            return this;
        }
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        public GetRectifyFlowResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetRectifyFlowResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRectifyFlowResponseBodyData setSubmitUser(String submitUser) {
            this.submitUser = submitUser;
            return this;
        }
        public String getSubmitUser() {
            return this.submitUser;
        }

        public GetRectifyFlowResponseBodyData setSubmitUserName(String submitUserName) {
            this.submitUserName = submitUserName;
            return this;
        }
        public String getSubmitUserName() {
            return this.submitUserName;
        }

        public GetRectifyFlowResponseBodyData setVerifyUser(String verifyUser) {
            this.verifyUser = verifyUser;
            return this;
        }
        public String getVerifyUser() {
            return this.verifyUser;
        }

        public GetRectifyFlowResponseBodyData setVerifyUserName(String verifyUserName) {
            this.verifyUserName = verifyUserName;
            return this;
        }
        public String getVerifyUserName() {
            return this.verifyUserName;
        }

    }

}
