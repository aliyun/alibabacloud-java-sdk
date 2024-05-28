// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateTestCaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("assignedTo")
    public String assignedTo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("directoryIdentifier")
    public String directoryIdentifier;

    @NameInMap("fieldValueList")
    public java.util.List<CreateTestCaseRequestFieldValueList> fieldValueList;

    @NameInMap("priority")
    public String priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("subject")
    public String subject;

    @NameInMap("tags")
    public java.util.List<String> tags;

    @NameInMap("testcaseStepContentInfo")
    public CreateTestCaseRequestTestcaseStepContentInfo testcaseStepContentInfo;

    public static CreateTestCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTestCaseRequest self = new CreateTestCaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateTestCaseRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public CreateTestCaseRequest setDirectoryIdentifier(String directoryIdentifier) {
        this.directoryIdentifier = directoryIdentifier;
        return this;
    }
    public String getDirectoryIdentifier() {
        return this.directoryIdentifier;
    }

    public CreateTestCaseRequest setFieldValueList(java.util.List<CreateTestCaseRequestFieldValueList> fieldValueList) {
        this.fieldValueList = fieldValueList;
        return this;
    }
    public java.util.List<CreateTestCaseRequestFieldValueList> getFieldValueList() {
        return this.fieldValueList;
    }

    public CreateTestCaseRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateTestCaseRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public CreateTestCaseRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateTestCaseRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public CreateTestCaseRequest setTestcaseStepContentInfo(CreateTestCaseRequestTestcaseStepContentInfo testcaseStepContentInfo) {
        this.testcaseStepContentInfo = testcaseStepContentInfo;
        return this;
    }
    public CreateTestCaseRequestTestcaseStepContentInfo getTestcaseStepContentInfo() {
        return this.testcaseStepContentInfo;
    }

    public static class CreateTestCaseRequestFieldValueList extends TeaModel {
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        @NameInMap("value")
        public String value;

        public static CreateTestCaseRequestFieldValueList build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseRequestFieldValueList self = new CreateTestCaseRequestFieldValueList();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseRequestFieldValueList setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public CreateTestCaseRequestFieldValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTestCaseRequestTestcaseStepContentInfoStepResultList extends TeaModel {
        @NameInMap("expected")
        public String expected;

        @NameInMap("step")
        public String step;

        public static CreateTestCaseRequestTestcaseStepContentInfoStepResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseRequestTestcaseStepContentInfoStepResultList self = new CreateTestCaseRequestTestcaseStepContentInfoStepResultList();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseRequestTestcaseStepContentInfoStepResultList setExpected(String expected) {
            this.expected = expected;
            return this;
        }
        public String getExpected() {
            return this.expected;
        }

        public CreateTestCaseRequestTestcaseStepContentInfoStepResultList setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class CreateTestCaseRequestTestcaseStepContentInfo extends TeaModel {
        @NameInMap("precondition")
        public String precondition;

        @NameInMap("stepResultList")
        public java.util.List<CreateTestCaseRequestTestcaseStepContentInfoStepResultList> stepResultList;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("stepType")
        public String stepType;

        public static CreateTestCaseRequestTestcaseStepContentInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTestCaseRequestTestcaseStepContentInfo self = new CreateTestCaseRequestTestcaseStepContentInfo();
            return TeaModel.build(map, self);
        }

        public CreateTestCaseRequestTestcaseStepContentInfo setPrecondition(String precondition) {
            this.precondition = precondition;
            return this;
        }
        public String getPrecondition() {
            return this.precondition;
        }

        public CreateTestCaseRequestTestcaseStepContentInfo setStepResultList(java.util.List<CreateTestCaseRequestTestcaseStepContentInfoStepResultList> stepResultList) {
            this.stepResultList = stepResultList;
            return this;
        }
        public java.util.List<CreateTestCaseRequestTestcaseStepContentInfoStepResultList> getStepResultList() {
            return this.stepResultList;
        }

        public CreateTestCaseRequestTestcaseStepContentInfo setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

}
