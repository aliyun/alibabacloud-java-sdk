// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkItemResponseBody extends TeaModel {
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
    public UpdateWorkItemResponseBodyWorkitem workitem;

    public static UpdateWorkItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkItemResponseBody self = new UpdateWorkItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkItemResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateWorkItemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateWorkItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateWorkItemResponseBody setWorkitem(UpdateWorkItemResponseBodyWorkitem workitem) {
        this.workitem = workitem;
        return this;
    }
    public UpdateWorkItemResponseBodyWorkitem getWorkitem() {
        return this.workitem;
    }

    public static class UpdateWorkItemResponseBodyWorkitem extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>html格式</p>
         */
        @NameInMap("document")
        public String document;

        @NameInMap("documentFormat")
        public String documentFormat;

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

        /**
         * <strong>example:</strong>
         * <p>ACFS-1</p>
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

        /**
         * <strong>example:</strong>
         * <p>75528f17703e92e5a568......</p>
         */
        @NameInMap("sprintIdentifier")
        public String sprintIdentifier;

        /**
         * <strong>example:</strong>
         * <p>待处理</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>111000</p>
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

        /**
         * <strong>example:</strong>
         * <p>1640850328000</p>
         */
        @NameInMap("updateStatusAt")
        public Long updateStatusAt;

        /**
         * <strong>example:</strong>
         * <p>9uxxxxxxre573f5xxxxxx0</p>
         */
        @NameInMap("workitemTypeIdentifier")
        public String workitemTypeIdentifier;

        public static UpdateWorkItemResponseBodyWorkitem build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkItemResponseBodyWorkitem self = new UpdateWorkItemResponseBodyWorkitem();
            return TeaModel.build(map, self);
        }

        public UpdateWorkItemResponseBodyWorkitem setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public UpdateWorkItemResponseBodyWorkitem setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateWorkItemResponseBodyWorkitem setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public UpdateWorkItemResponseBodyWorkitem setDocumentFormat(String documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }
        public String getDocumentFormat() {
            return this.documentFormat;
        }

        public UpdateWorkItemResponseBodyWorkitem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateWorkItemResponseBodyWorkitem setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public UpdateWorkItemResponseBodyWorkitem setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public UpdateWorkItemResponseBodyWorkitem setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public UpdateWorkItemResponseBodyWorkitem setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public UpdateWorkItemResponseBodyWorkitem setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public UpdateWorkItemResponseBodyWorkitem setSprintIdentifier(String sprintIdentifier) {
            this.sprintIdentifier = sprintIdentifier;
            return this;
        }
        public String getSprintIdentifier() {
            return this.sprintIdentifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateWorkItemResponseBodyWorkitem setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public UpdateWorkItemResponseBodyWorkitem setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public UpdateWorkItemResponseBodyWorkitem setUpdateStatusAt(Long updateStatusAt) {
            this.updateStatusAt = updateStatusAt;
            return this;
        }
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        public UpdateWorkItemResponseBodyWorkitem setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

    }

}
