// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
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

    @NameInMap("workitem")
    public GetWorkItemInfoResponseBodyWorkitem workitem;

    public static GetWorkItemInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemInfoResponseBody self = new GetWorkItemInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkItemInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkItemInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetWorkItemInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkItemInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWorkItemInfoResponseBody setWorkitem(GetWorkItemInfoResponseBodyWorkitem workitem) {
        this.workitem = workitem;
        return this;
    }
    public GetWorkItemInfoResponseBodyWorkitem getWorkitem() {
        return this.workitem;
    }

    public static class GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-02-01 00:00:00</p>
         */
        @NameInMap("displayValue")
        public String displayValue;

        /**
         * <strong>example:</strong>
         * <p>2022-02-01 00:00:00</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("level")
        public Long level;

        /**
         * <strong>example:</strong>
         * <p>2022-02-01 00:00:00</p>
         */
        @NameInMap("value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("valueEn")
        public String valueEn;

        public static GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList self = new GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList();
            return TeaModel.build(map, self);
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList setValueEn(String valueEn) {
            this.valueEn = valueEn;
            return this;
        }
        public String getValueEn() {
            return this.valueEn;
        }

    }

    public static class GetWorkItemInfoResponseBodyWorkitemCustomFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>例如：date</p>
         */
        @NameInMap("fieldClassName")
        public String fieldClassName;

        /**
         * <strong>example:</strong>
         * <p>例：input</p>
         */
        @NameInMap("fieldFormat")
        public String fieldFormat;

        /**
         * <strong>example:</strong>
         * <p>例：80</p>
         */
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("level")
        public Long level;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("objectValue")
        public String objectValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("position")
        public Long position;

        /**
         * <strong>example:</strong>
         * <p>例：2022-01-06 00:00:00</p>
         */
        @NameInMap("value")
        public String value;

        @NameInMap("valueList")
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList> valueList;

        /**
         * <strong>example:</strong>
         * <p>5daa9a15c7fd55523996......</p>
         */
        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static GetWorkItemInfoResponseBodyWorkitemCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemInfoResponseBodyWorkitemCustomFields self = new GetWorkItemInfoResponseBodyWorkitemCustomFields();
            return TeaModel.build(map, self);
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setFieldClassName(String fieldClassName) {
            this.fieldClassName = fieldClassName;
            return this;
        }
        public String getFieldClassName() {
            return this.fieldClassName;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setObjectValue(String objectValue) {
            this.objectValue = objectValue;
            return this;
        }
        public String getObjectValue() {
            return this.objectValue;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setValueList(java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList> getValueList() {
            return this.valueList;
        }

        public GetWorkItemInfoResponseBodyWorkitemCustomFields setWorkitemIdentifier(String workitemIdentifier) {
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

    }

    public static class GetWorkItemInfoResponseBodyWorkitemTagDetails extends TeaModel {
        @NameInMap("color")
        public String color;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("name")
        public String name;

        public static GetWorkItemInfoResponseBodyWorkitemTagDetails build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemInfoResponseBodyWorkitemTagDetails self = new GetWorkItemInfoResponseBodyWorkitemTagDetails();
            return TeaModel.build(map, self);
        }

        public GetWorkItemInfoResponseBodyWorkitemTagDetails setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public GetWorkItemInfoResponseBodyWorkitemTagDetails setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkItemInfoResponseBodyWorkitemTagDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetWorkItemInfoResponseBodyWorkitemVersions extends TeaModel {
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("name")
        public String name;

        public static GetWorkItemInfoResponseBodyWorkitemVersions build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemInfoResponseBodyWorkitemVersions self = new GetWorkItemInfoResponseBodyWorkitemVersions();
            return TeaModel.build(map, self);
        }

        public GetWorkItemInfoResponseBodyWorkitemVersions setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkItemInfoResponseBodyWorkitemVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetWorkItemInfoResponseBodyWorkitem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("assignedTo")
        public String assignedTo;

        /**
         * <strong>example:</strong>
         * <p>Req</p>
         */
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        @NameInMap("customFields")
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFields> customFields;

        /**
         * <strong>example:</strong>
         * <p>html格式</p>
         */
        @NameInMap("document")
        public String document;

        @NameInMap("documentFormat")
        public String documentFormat;

        @NameInMap("finishTime")
        public Long finishTime;

        /**
         * <strong>example:</strong>
         * <p>1640850318000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1640850318000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("logicalStatus")
        public String logicalStatus;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx24</p>
         */
        @NameInMap("parentIdentifier")
        public String parentIdentifier;

        @NameInMap("participant")
        public java.util.List<String> participant;

        /**
         * <strong>example:</strong>
         * <p>ABCD-1</p>
         */
        @NameInMap("serialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>e8b26xxxxx6e76aa20xxxxx23</p>
         */
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>需求项目</p>
         */
        @NameInMap("spaceName")
        public String spaceName;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("spaceType")
        public String spaceType;

        @NameInMap("sprint")
        public java.util.List<String> sprint;

        /**
         * <strong>example:</strong>
         * <p>待处理</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>例：100005</p>
         */
        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        /**
         * <strong>example:</strong>
         * <p>测试工作项</p>
         */
        @NameInMap("subject")
        public String subject;

        @NameInMap("tag")
        public java.util.List<String> tag;

        @NameInMap("tagDetails")
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemTagDetails> tagDetails;

        @NameInMap("tracker")
        public java.util.List<String> tracker;

        /**
         * <strong>example:</strong>
         * <p>1640850328000</p>
         */
        @NameInMap("updateStatusAt")
        public Long updateStatusAt;

        @NameInMap("verifier")
        public java.util.List<String> verifier;

        @NameInMap("versions")
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemVersions> versions;

        /**
         * <strong>example:</strong>
         * <p>9uxxxxxxre573f5xxxxxx0</p>
         */
        @NameInMap("workitemTypeIdentifier")
        public String workitemTypeIdentifier;

        public static GetWorkItemInfoResponseBodyWorkitem build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemInfoResponseBodyWorkitem self = new GetWorkItemInfoResponseBodyWorkitem();
            return TeaModel.build(map, self);
        }

        public GetWorkItemInfoResponseBodyWorkitem setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetWorkItemInfoResponseBodyWorkitem setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetWorkItemInfoResponseBodyWorkitem setCustomFields(java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFields> getCustomFields() {
            return this.customFields;
        }

        public GetWorkItemInfoResponseBodyWorkitem setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetWorkItemInfoResponseBodyWorkitem setDocumentFormat(String documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }
        public String getDocumentFormat() {
            return this.documentFormat;
        }

        public GetWorkItemInfoResponseBodyWorkitem setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetWorkItemInfoResponseBodyWorkitem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkItemInfoResponseBodyWorkitem setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetWorkItemInfoResponseBodyWorkitem setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public GetWorkItemInfoResponseBodyWorkitem setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setParticipant(java.util.List<String> participant) {
            this.participant = participant;
            return this;
        }
        public java.util.List<String> getParticipant() {
            return this.participant;
        }

        public GetWorkItemInfoResponseBodyWorkitem setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public GetWorkItemInfoResponseBodyWorkitem setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public GetWorkItemInfoResponseBodyWorkitem setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public GetWorkItemInfoResponseBodyWorkitem setSprint(java.util.List<String> sprint) {
            this.sprint = sprint;
            return this;
        }
        public java.util.List<String> getSprint() {
            return this.sprint;
        }

        public GetWorkItemInfoResponseBodyWorkitem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkItemInfoResponseBodyWorkitem setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetWorkItemInfoResponseBodyWorkitem setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

        public GetWorkItemInfoResponseBodyWorkitem setTagDetails(java.util.List<GetWorkItemInfoResponseBodyWorkitemTagDetails> tagDetails) {
            this.tagDetails = tagDetails;
            return this;
        }
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemTagDetails> getTagDetails() {
            return this.tagDetails;
        }

        public GetWorkItemInfoResponseBodyWorkitem setTracker(java.util.List<String> tracker) {
            this.tracker = tracker;
            return this;
        }
        public java.util.List<String> getTracker() {
            return this.tracker;
        }

        public GetWorkItemInfoResponseBodyWorkitem setUpdateStatusAt(Long updateStatusAt) {
            this.updateStatusAt = updateStatusAt;
            return this;
        }
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        public GetWorkItemInfoResponseBodyWorkitem setVerifier(java.util.List<String> verifier) {
            this.verifier = verifier;
            return this;
        }
        public java.util.List<String> getVerifier() {
            return this.verifier;
        }

        public GetWorkItemInfoResponseBodyWorkitem setVersions(java.util.List<GetWorkItemInfoResponseBodyWorkitemVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemVersions> getVersions() {
            return this.versions;
        }

        public GetWorkItemInfoResponseBodyWorkitem setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

    }

}
