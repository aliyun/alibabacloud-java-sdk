// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkitemFieldResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("workitem")
    public UpdateWorkitemFieldResponseBodyWorkitem workitem;

    public static UpdateWorkitemFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemFieldResponseBody self = new UpdateWorkitemFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemFieldResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateWorkitemFieldResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateWorkitemFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkitemFieldResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateWorkitemFieldResponseBody setWorkitem(UpdateWorkitemFieldResponseBodyWorkitem workitem) {
        this.workitem = workitem;
        return this;
    }
    public UpdateWorkitemFieldResponseBodyWorkitem getWorkitem() {
        return this.workitem;
    }

    public static class UpdateWorkitemFieldResponseBodyWorkitem extends TeaModel {
        @NameInMap("assignedTo")
        public String assignedTo;

        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        @NameInMap("creator")
        public String creator;

        @NameInMap("document")
        public String document;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("logicalStatus")
        public String logicalStatus;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("parentIdentifier")
        public String parentIdentifier;

        @NameInMap("serialNumber")
        public String serialNumber;

        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        @NameInMap("spaceName")
        public String spaceName;

        @NameInMap("spaceType")
        public String spaceType;

        @NameInMap("sprintIdentifier")
        public String sprintIdentifier;

        @NameInMap("status")
        public String status;

        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        @NameInMap("subject")
        public String subject;

        @NameInMap("updateStatusAt")
        public Long updateStatusAt;

        @NameInMap("workitemTypeIdentifier")
        public String workitemTypeIdentifier;

        public static UpdateWorkitemFieldResponseBodyWorkitem build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkitemFieldResponseBodyWorkitem self = new UpdateWorkitemFieldResponseBodyWorkitem();
            return TeaModel.build(map, self);
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setSprintIdentifier(String sprintIdentifier) {
            this.sprintIdentifier = sprintIdentifier;
            return this;
        }
        public String getSprintIdentifier() {
            return this.sprintIdentifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setUpdateStatusAt(Long updateStatusAt) {
            this.updateStatusAt = updateStatusAt;
            return this;
        }
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        public UpdateWorkitemFieldResponseBodyWorkitem setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

    }

}
