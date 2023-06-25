// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateTestCaseResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("testcase")
    public CreateTestCaseResponseBodyTestcase testcase;

    public static CreateTestCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTestCaseResponseBody self = new CreateTestCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTestCaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateTestCaseResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateTestCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTestCaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateTestCaseResponseBody setTestcase(CreateTestCaseResponseBodyTestcase testcase) {
        this.testcase = testcase;
        return this;
    }
    public CreateTestCaseResponseBodyTestcase getTestcase() {
        return this.testcase;
    }

    public static class CreateTestCaseResponseBodyTestcaseAssignedTo extends TeaModel {
        @NameInMap("assignIdentifier")
        public String assignIdentifier;

        @NameInMap("name")
        public String name;

        @NameInMap("tbRoleId")
        public String tbRoleId;

        public static CreateTestCaseResponseBodyTestcaseAssignedTo build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseAssignedTo self = new CreateTestCaseResponseBodyTestcaseAssignedTo();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseAssignedTo setAssignIdentifier(String assignIdentifier) {
            this.assignIdentifier = assignIdentifier;
            return this;
        }
        public String getAssignIdentifier() {
            return this.assignIdentifier;
        }

        public CreateTestCaseResponseBodyTestcaseAssignedTo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTestCaseResponseBodyTestcaseAssignedTo setTbRoleId(String tbRoleId) {
            this.tbRoleId = tbRoleId;
            return this;
        }
        public String getTbRoleId() {
            return this.tbRoleId;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseCreator extends TeaModel {
        @NameInMap("createIdentifier")
        public String createIdentifier;

        @NameInMap("name")
        public String name;

        public static CreateTestCaseResponseBodyTestcaseCreator build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseCreator self = new CreateTestCaseResponseBodyTestcaseCreator();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseCreator setCreateIdentifier(String createIdentifier) {
            this.createIdentifier = createIdentifier;
            return this;
        }
        public String getCreateIdentifier() {
            return this.createIdentifier;
        }

        public CreateTestCaseResponseBodyTestcaseCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult extends TeaModel {
        @NameInMap("expectContent")
        public String expectContent;

        @NameInMap("expectContentType")
        public String expectContentType;

        @NameInMap("expectIdentifier")
        public String expectIdentifier;

        public static CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult self = new CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult setExpectContent(String expectContent) {
            this.expectContent = expectContent;
            return this;
        }
        public String getExpectContent() {
            return this.expectContent;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult setExpectContentType(String expectContentType) {
            this.expectContentType = expectContentType;
            return this;
        }
        public String getExpectContentType() {
            return this.expectContentType;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult setExpectIdentifier(String expectIdentifier) {
            this.expectIdentifier = expectIdentifier;
            return this;
        }
        public String getExpectIdentifier() {
            return this.expectIdentifier;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition extends TeaModel {
        @NameInMap("preContent")
        public String preContent;

        @NameInMap("preContentType")
        public String preContentType;

        @NameInMap("preIdentifier")
        public String preIdentifier;

        public static CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition self = new CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition setPreContent(String preContent) {
            this.preContent = preContent;
            return this;
        }
        public String getPreContent() {
            return this.preContent;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition setPreContentType(String preContentType) {
            this.preContentType = preContentType;
            return this;
        }
        public String getPreContentType() {
            return this.preContentType;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition setPreIdentifier(String preIdentifier) {
            this.preIdentifier = preIdentifier;
            return this;
        }
        public String getPreIdentifier() {
            return this.preIdentifier;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseDetailInfoStepContent extends TeaModel {
        @NameInMap("stepContent")
        public String stepContent;

        @NameInMap("stepContentType")
        public String stepContentType;

        @NameInMap("stepIdentifier")
        public String stepIdentifier;

        public static CreateTestCaseResponseBodyTestcaseDetailInfoStepContent build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseDetailInfoStepContent self = new CreateTestCaseResponseBodyTestcaseDetailInfoStepContent();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoStepContent setStepContent(String stepContent) {
            this.stepContent = stepContent;
            return this;
        }
        public String getStepContent() {
            return this.stepContent;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoStepContent setStepContentType(String stepContentType) {
            this.stepContentType = stepContentType;
            return this;
        }
        public String getStepContentType() {
            return this.stepContentType;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfoStepContent setStepIdentifier(String stepIdentifier) {
            this.stepIdentifier = stepIdentifier;
            return this;
        }
        public String getStepIdentifier() {
            return this.stepIdentifier;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseDetailInfo extends TeaModel {
        @NameInMap("expectedResult")
        public CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult expectedResult;

        @NameInMap("precondition")
        public CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition precondition;

        @NameInMap("stepContent")
        public CreateTestCaseResponseBodyTestcaseDetailInfoStepContent stepContent;

        @NameInMap("stepType")
        public String stepType;

        public static CreateTestCaseResponseBodyTestcaseDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseDetailInfo self = new CreateTestCaseResponseBodyTestcaseDetailInfo();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfo setExpectedResult(CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult expectedResult) {
            this.expectedResult = expectedResult;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseDetailInfoExpectedResult getExpectedResult() {
            return this.expectedResult;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfo setPrecondition(CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition precondition) {
            this.precondition = precondition;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseDetailInfoPrecondition getPrecondition() {
            return this.precondition;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfo setStepContent(CreateTestCaseResponseBodyTestcaseDetailInfoStepContent stepContent) {
            this.stepContent = stepContent;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseDetailInfoStepContent getStepContent() {
            return this.stepContent;
        }

        public CreateTestCaseResponseBodyTestcaseDetailInfo setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseDirectory extends TeaModel {
        @NameInMap("childIdentifier")
        public String childIdentifier;

        @NameInMap("directoryIdentifier")
        public String directoryIdentifier;

        @NameInMap("name")
        public String name;

        @NameInMap("pathName")
        public java.util.List<String> pathName;

        public static CreateTestCaseResponseBodyTestcaseDirectory build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseDirectory self = new CreateTestCaseResponseBodyTestcaseDirectory();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseDirectory setChildIdentifier(String childIdentifier) {
            this.childIdentifier = childIdentifier;
            return this;
        }
        public String getChildIdentifier() {
            return this.childIdentifier;
        }

        public CreateTestCaseResponseBodyTestcaseDirectory setDirectoryIdentifier(String directoryIdentifier) {
            this.directoryIdentifier = directoryIdentifier;
            return this;
        }
        public String getDirectoryIdentifier() {
            return this.directoryIdentifier;
        }

        public CreateTestCaseResponseBodyTestcaseDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTestCaseResponseBodyTestcaseDirectory setPathName(java.util.List<String> pathName) {
            this.pathName = pathName;
            return this;
        }
        public java.util.List<String> getPathName() {
            return this.pathName;
        }

    }

    public static class CreateTestCaseResponseBodyTestcaseModifier extends TeaModel {
        @NameInMap("modifyIdentifier")
        public String modifyIdentifier;

        @NameInMap("name")
        public String name;

        public static CreateTestCaseResponseBodyTestcaseModifier build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcaseModifier self = new CreateTestCaseResponseBodyTestcaseModifier();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcaseModifier setModifyIdentifier(String modifyIdentifier) {
            this.modifyIdentifier = modifyIdentifier;
            return this;
        }
        public String getModifyIdentifier() {
            return this.modifyIdentifier;
        }

        public CreateTestCaseResponseBodyTestcaseModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateTestCaseResponseBodyTestcase extends TeaModel {
        @NameInMap("assignedTo")
        public CreateTestCaseResponseBodyTestcaseAssignedTo assignedTo;

        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        @NameInMap("creator")
        public CreateTestCaseResponseBodyTestcaseCreator creator;

        @NameInMap("detailInfo")
        public CreateTestCaseResponseBodyTestcaseDetailInfo detailInfo;

        @NameInMap("directory")
        public CreateTestCaseResponseBodyTestcaseDirectory directory;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("modifier")
        public CreateTestCaseResponseBodyTestcaseModifier modifier;

        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        @NameInMap("spaceType")
        public String spaceType;

        @NameInMap("subject")
        public String subject;

        public static CreateTestCaseResponseBodyTestcase build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseResponseBodyTestcase self = new CreateTestCaseResponseBodyTestcase();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseResponseBodyTestcase setAssignedTo(CreateTestCaseResponseBodyTestcaseAssignedTo assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseAssignedTo getAssignedTo() {
            return this.assignedTo;
        }

        public CreateTestCaseResponseBodyTestcase setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public CreateTestCaseResponseBodyTestcase setCreator(CreateTestCaseResponseBodyTestcaseCreator creator) {
            this.creator = creator;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseCreator getCreator() {
            return this.creator;
        }

        public CreateTestCaseResponseBodyTestcase setDetailInfo(CreateTestCaseResponseBodyTestcaseDetailInfo detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseDetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        public CreateTestCaseResponseBodyTestcase setDirectory(CreateTestCaseResponseBodyTestcaseDirectory directory) {
            this.directory = directory;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseDirectory getDirectory() {
            return this.directory;
        }

        public CreateTestCaseResponseBodyTestcase setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateTestCaseResponseBodyTestcase setModifier(CreateTestCaseResponseBodyTestcaseModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public CreateTestCaseResponseBodyTestcaseModifier getModifier() {
            return this.modifier;
        }

        public CreateTestCaseResponseBodyTestcase setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public CreateTestCaseResponseBodyTestcase setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public CreateTestCaseResponseBodyTestcase setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

}
