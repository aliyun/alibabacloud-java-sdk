// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateTestCaseResponseBody extends TeaModel {
    @NameInMap("Testcase")
    public UpdateTestCaseResponseBodyTestcase testcase;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateTestCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTestCaseResponseBody self = new UpdateTestCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTestCaseResponseBody setTestcase(UpdateTestCaseResponseBodyTestcase testcase) {
        this.testcase = testcase;
        return this;
    }
    public UpdateTestCaseResponseBodyTestcase getTestcase() {
        return this.testcase;
    }

    public UpdateTestCaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateTestCaseResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateTestCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTestCaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateTestCaseResponseBodyTestcaseAssignedTo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1316xxxxxx8624xxx</p>
         */
        @NameInMap("assignIdentifier")
        public String assignIdentifier;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxxewdds12xxx</p>
         */
        @NameInMap("tbRoleId")
        public String tbRoleId;

        public static UpdateTestCaseResponseBodyTestcaseAssignedTo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseAssignedTo self = new UpdateTestCaseResponseBodyTestcaseAssignedTo();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseAssignedTo setAssignIdentifier(String assignIdentifier) {
            this.assignIdentifier = assignIdentifier;
            return this;
        }
        public String getAssignIdentifier() {
            return this.assignIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcaseAssignedTo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTestCaseResponseBodyTestcaseAssignedTo setTbRoleId(String tbRoleId) {
            this.tbRoleId = tbRoleId;
            return this;
        }
        public String getTbRoleId() {
            return this.tbRoleId;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1316xxxxxx8624xxx</p>
         */
        @NameInMap("createIdentifier")
        public String createIdentifier;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateTestCaseResponseBodyTestcaseCreator build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseCreator self = new UpdateTestCaseResponseBodyTestcaseCreator();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseCreator setCreateIdentifier(String createIdentifier) {
            this.createIdentifier = createIdentifier;
            return this;
        }
        public String getCreateIdentifier() {
            return this.createIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcaseCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult extends TeaModel {
        @NameInMap("expectContent")
        public String expectContent;

        /**
         * <strong>example:</strong>
         * <p>MARKDOWN</p>
         */
        @NameInMap("expectContentType")
        public String expectContentType;

        /**
         * <strong>example:</strong>
         * <p>685340d13127b01185335bd360</p>
         */
        @NameInMap("expectIdentifier")
        public String expectIdentifier;

        public static UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult self = new UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult setExpectContent(String expectContent) {
            this.expectContent = expectContent;
            return this;
        }
        public String getExpectContent() {
            return this.expectContent;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult setExpectContentType(String expectContentType) {
            this.expectContentType = expectContentType;
            return this;
        }
        public String getExpectContentType() {
            return this.expectContentType;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult setExpectIdentifier(String expectIdentifier) {
            this.expectIdentifier = expectIdentifier;
            return this;
        }
        public String getExpectIdentifier() {
            return this.expectIdentifier;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition extends TeaModel {
        @NameInMap("preContent")
        public String preContent;

        /**
         * <strong>example:</strong>
         * <p>MARKDOWN</p>
         */
        @NameInMap("preContentType")
        public String preContentType;

        /**
         * <strong>example:</strong>
         * <p>3354596c7b3004480b635acf95</p>
         */
        @NameInMap("preIdentifier")
        public String preIdentifier;

        public static UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition self = new UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition setPreContent(String preContent) {
            this.preContent = preContent;
            return this;
        }
        public String getPreContent() {
            return this.preContent;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition setPreContentType(String preContentType) {
            this.preContentType = preContentType;
            return this;
        }
        public String getPreContentType() {
            return this.preContentType;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition setPreIdentifier(String preIdentifier) {
            this.preIdentifier = preIdentifier;
            return this;
        }
        public String getPreIdentifier() {
            return this.preIdentifier;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent extends TeaModel {
        @NameInMap("stepContent")
        public String stepContent;

        /**
         * <strong>example:</strong>
         * <p>RICHTEXT</p>
         */
        @NameInMap("stepContentType")
        public String stepContentType;

        /**
         * <strong>example:</strong>
         * <p>ad504e6cdcd2165b28eb1e1b9f</p>
         */
        @NameInMap("stepIdentifier")
        public String stepIdentifier;

        public static UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent self = new UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent setStepContent(String stepContent) {
            this.stepContent = stepContent;
            return this;
        }
        public String getStepContent() {
            return this.stepContent;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent setStepContentType(String stepContentType) {
            this.stepContentType = stepContentType;
            return this;
        }
        public String getStepContentType() {
            return this.stepContentType;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent setStepIdentifier(String stepIdentifier) {
            this.stepIdentifier = stepIdentifier;
            return this;
        }
        public String getStepIdentifier() {
            return this.stepIdentifier;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseDetailInfo extends TeaModel {
        @NameInMap("expectedResult")
        public UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult expectedResult;

        @NameInMap("precondition")
        public UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition precondition;

        @NameInMap("stepContent")
        public UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent stepContent;

        /**
         * <strong>example:</strong>
         * <p>TEXT/TABLE</p>
         */
        @NameInMap("stepType")
        public String stepType;

        public static UpdateTestCaseResponseBodyTestcaseDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseDetailInfo self = new UpdateTestCaseResponseBodyTestcaseDetailInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfo setExpectedResult(UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult expectedResult) {
            this.expectedResult = expectedResult;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseDetailInfoExpectedResult getExpectedResult() {
            return this.expectedResult;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfo setPrecondition(UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition precondition) {
            this.precondition = precondition;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseDetailInfoPrecondition getPrecondition() {
            return this.precondition;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfo setStepContent(UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent stepContent) {
            this.stepContent = stepContent;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseDetailInfoStepContent getStepContent() {
            return this.stepContent;
        }

        public UpdateTestCaseResponseBodyTestcaseDetailInfo setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseDirectory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2973f597c14c6f533fffdcd05c</p>
         */
        @NameInMap("childIdentifier")
        public String childIdentifier;

        /**
         * <strong>example:</strong>
         * <p>e27b8eace6501ce51cf5d56784</p>
         */
        @NameInMap("directoryIdentifier")
        public String directoryIdentifier;

        @NameInMap("name")
        public String name;

        @NameInMap("pathName")
        public java.util.List<String> pathName;

        public static UpdateTestCaseResponseBodyTestcaseDirectory build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseDirectory self = new UpdateTestCaseResponseBodyTestcaseDirectory();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseDirectory setChildIdentifier(String childIdentifier) {
            this.childIdentifier = childIdentifier;
            return this;
        }
        public String getChildIdentifier() {
            return this.childIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcaseDirectory setDirectoryIdentifier(String directoryIdentifier) {
            this.directoryIdentifier = directoryIdentifier;
            return this;
        }
        public String getDirectoryIdentifier() {
            return this.directoryIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcaseDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTestCaseResponseBodyTestcaseDirectory setPathName(java.util.List<String> pathName) {
            this.pathName = pathName;
            return this;
        }
        public java.util.List<String> getPathName() {
            return this.pathName;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcaseModifier extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1316xxxxxx8624xxx</p>
         */
        @NameInMap("modifyIdentifier")
        public String modifyIdentifier;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateTestCaseResponseBodyTestcaseModifier build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcaseModifier self = new UpdateTestCaseResponseBodyTestcaseModifier();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcaseModifier setModifyIdentifier(String modifyIdentifier) {
            this.modifyIdentifier = modifyIdentifier;
            return this;
        }
        public String getModifyIdentifier() {
            return this.modifyIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcaseModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTestCaseResponseBodyTestcase extends TeaModel {
        @NameInMap("assignedTo")
        public UpdateTestCaseResponseBodyTestcaseAssignedTo assignedTo;

        /**
         * <strong>example:</strong>
         * <p>TestCase</p>
         */
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        @NameInMap("creator")
        public UpdateTestCaseResponseBodyTestcaseCreator creator;

        @NameInMap("detailInfo")
        public UpdateTestCaseResponseBodyTestcaseDetailInfo detailInfo;

        @NameInMap("directory")
        public UpdateTestCaseResponseBodyTestcaseDirectory directory;

        /**
         * <strong>example:</strong>
         * <p>c7f7033b021ead52cc42721382</p>
         */
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("modifier")
        public UpdateTestCaseResponseBodyTestcaseModifier modifier;

        /**
         * <strong>example:</strong>
         * <p>1e7d7a412b91a2144ec4aa8411</p>
         */
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>TestRepo</p>
         */
        @NameInMap("spaceType")
        public String spaceType;

        @NameInMap("subject")
        public String subject;

        public static UpdateTestCaseResponseBodyTestcase build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseResponseBodyTestcase self = new UpdateTestCaseResponseBodyTestcase();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseResponseBodyTestcase setAssignedTo(UpdateTestCaseResponseBodyTestcaseAssignedTo assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseAssignedTo getAssignedTo() {
            return this.assignedTo;
        }

        public UpdateTestCaseResponseBodyTestcase setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcase setCreator(UpdateTestCaseResponseBodyTestcaseCreator creator) {
            this.creator = creator;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseCreator getCreator() {
            return this.creator;
        }

        public UpdateTestCaseResponseBodyTestcase setDetailInfo(UpdateTestCaseResponseBodyTestcaseDetailInfo detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseDetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        public UpdateTestCaseResponseBodyTestcase setDirectory(UpdateTestCaseResponseBodyTestcaseDirectory directory) {
            this.directory = directory;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseDirectory getDirectory() {
            return this.directory;
        }

        public UpdateTestCaseResponseBodyTestcase setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateTestCaseResponseBodyTestcase setModifier(UpdateTestCaseResponseBodyTestcaseModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public UpdateTestCaseResponseBodyTestcaseModifier getModifier() {
            return this.modifier;
        }

        public UpdateTestCaseResponseBodyTestcase setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public UpdateTestCaseResponseBodyTestcase setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public UpdateTestCaseResponseBodyTestcase setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

}
