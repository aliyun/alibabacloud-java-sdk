// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestResultListResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("testResult")
    public java.util.List<GetTestResultListResponseBodyTestResult> testResult;

    public static GetTestResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTestResultListResponseBody self = new GetTestResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTestResultListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTestResultListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetTestResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTestResultListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTestResultListResponseBody setTestResult(java.util.List<GetTestResultListResponseBodyTestResult> testResult) {
        this.testResult = testResult;
        return this;
    }
    public java.util.List<GetTestResultListResponseBodyTestResult> getTestResult() {
        return this.testResult;
    }

    public static class GetTestResultListResponseBodyTestResultAssignedTo extends TeaModel {
        @NameInMap("assignedToIdenttifier")
        public String assignedToIdenttifier;

        @NameInMap("name")
        public String name;

        public static GetTestResultListResponseBodyTestResultAssignedTo build(java.util.Map<String, ?> map) throws Exception {
            GetTestResultListResponseBodyTestResultAssignedTo self = new GetTestResultListResponseBodyTestResultAssignedTo();
            return TeaModel.build(map, self);
        }

        public GetTestResultListResponseBodyTestResultAssignedTo setAssignedToIdenttifier(String assignedToIdenttifier) {
            this.assignedToIdenttifier = assignedToIdenttifier;
            return this;
        }
        public String getAssignedToIdenttifier() {
            return this.assignedToIdenttifier;
        }

        public GetTestResultListResponseBodyTestResultAssignedTo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTestResultListResponseBodyTestResultCustomFields extends TeaModel {
        @NameInMap("fieldClassName")
        public String fieldClassName;

        @NameInMap("fieldFormat")
        public String fieldFormat;

        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        @NameInMap("value")
        public String value;

        public static GetTestResultListResponseBodyTestResultCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetTestResultListResponseBodyTestResultCustomFields self = new GetTestResultListResponseBodyTestResultCustomFields();
            return TeaModel.build(map, self);
        }

        public GetTestResultListResponseBodyTestResultCustomFields setFieldClassName(String fieldClassName) {
            this.fieldClassName = fieldClassName;
            return this;
        }
        public String getFieldClassName() {
            return this.fieldClassName;
        }

        public GetTestResultListResponseBodyTestResultCustomFields setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public GetTestResultListResponseBodyTestResultCustomFields setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public GetTestResultListResponseBodyTestResultCustomFields setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTestResultListResponseBodyTestResultTestResultExecutor extends TeaModel {
        @NameInMap("executorIdentifier")
        public String executorIdentifier;

        @NameInMap("name")
        public String name;

        public static GetTestResultListResponseBodyTestResultTestResultExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetTestResultListResponseBodyTestResultTestResultExecutor self = new GetTestResultListResponseBodyTestResultTestResultExecutor();
            return TeaModel.build(map, self);
        }

        public GetTestResultListResponseBodyTestResultTestResultExecutor setExecutorIdentifier(String executorIdentifier) {
            this.executorIdentifier = executorIdentifier;
            return this;
        }
        public String getExecutorIdentifier() {
            return this.executorIdentifier;
        }

        public GetTestResultListResponseBodyTestResultTestResultExecutor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTestResultListResponseBodyTestResult extends TeaModel {
        @NameInMap("assignedTo")
        public GetTestResultListResponseBodyTestResultAssignedTo assignedTo;

        @NameInMap("bugCount")
        public Long bugCount;

        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        @NameInMap("customFields")
        public java.util.List<GetTestResultListResponseBodyTestResultCustomFields> customFields;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        @NameInMap("subject")
        public String subject;

        @NameInMap("testResultExecutor")
        public GetTestResultListResponseBodyTestResultTestResultExecutor testResultExecutor;

        @NameInMap("testResultGmtCreate")
        public Long testResultGmtCreate;

        @NameInMap("testResultIdentifier")
        public String testResultIdentifier;

        @NameInMap("testResultStatus")
        public String testResultStatus;

        @NameInMap("testcaseIdentifier")
        public String testcaseIdentifier;

        public static GetTestResultListResponseBodyTestResult build(java.util.Map<String, ?> map) throws Exception {
            GetTestResultListResponseBodyTestResult self = new GetTestResultListResponseBodyTestResult();
            return TeaModel.build(map, self);
        }

        public GetTestResultListResponseBodyTestResult setAssignedTo(GetTestResultListResponseBodyTestResultAssignedTo assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public GetTestResultListResponseBodyTestResultAssignedTo getAssignedTo() {
            return this.assignedTo;
        }

        public GetTestResultListResponseBodyTestResult setBugCount(Long bugCount) {
            this.bugCount = bugCount;
            return this;
        }
        public Long getBugCount() {
            return this.bugCount;
        }

        public GetTestResultListResponseBodyTestResult setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public GetTestResultListResponseBodyTestResult setCustomFields(java.util.List<GetTestResultListResponseBodyTestResultCustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<GetTestResultListResponseBodyTestResultCustomFields> getCustomFields() {
            return this.customFields;
        }

        public GetTestResultListResponseBodyTestResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTestResultListResponseBodyTestResult setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public GetTestResultListResponseBodyTestResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetTestResultListResponseBodyTestResult setTestResultExecutor(GetTestResultListResponseBodyTestResultTestResultExecutor testResultExecutor) {
            this.testResultExecutor = testResultExecutor;
            return this;
        }
        public GetTestResultListResponseBodyTestResultTestResultExecutor getTestResultExecutor() {
            return this.testResultExecutor;
        }

        public GetTestResultListResponseBodyTestResult setTestResultGmtCreate(Long testResultGmtCreate) {
            this.testResultGmtCreate = testResultGmtCreate;
            return this;
        }
        public Long getTestResultGmtCreate() {
            return this.testResultGmtCreate;
        }

        public GetTestResultListResponseBodyTestResult setTestResultIdentifier(String testResultIdentifier) {
            this.testResultIdentifier = testResultIdentifier;
            return this;
        }
        public String getTestResultIdentifier() {
            return this.testResultIdentifier;
        }

        public GetTestResultListResponseBodyTestResult setTestResultStatus(String testResultStatus) {
            this.testResultStatus = testResultStatus;
            return this;
        }
        public String getTestResultStatus() {
            return this.testResultStatus;
        }

        public GetTestResultListResponseBodyTestResult setTestcaseIdentifier(String testcaseIdentifier) {
            this.testcaseIdentifier = testcaseIdentifier;
            return this;
        }
        public String getTestcaseIdentifier() {
            return this.testcaseIdentifier;
        }

    }

}
