// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    // 工作项信息
    @NameInMap("workitem")
    public CreateWorkitemResponseBodyWorkitem workitem;

    public static CreateWorkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemResponseBody self = new CreateWorkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWorkitemResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateWorkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateWorkitemResponseBody setWorkitem(CreateWorkitemResponseBodyWorkitem workitem) {
        this.workitem = workitem;
        return this;
    }
    public CreateWorkitemResponseBodyWorkitem getWorkitem() {
        return this.workitem;
    }

    public static class CreateWorkitemResponseBodyWorkitem extends TeaModel {
        // 负责人
        @NameInMap("assignedTo")
        public String assignedTo;

        // 工作项的类型id
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        // 创建人
        @NameInMap("creator")
        public String creator;

        // 工作项内容
        @NameInMap("document")
        public String document;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 工作项唯一标识
        @NameInMap("identifier")
        public String identifier;

        // 逻辑状态
        @NameInMap("logicalStatus")
        public String logicalStatus;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 父工作项id
        @NameInMap("parentIdentifier")
        public String parentIdentifier;

        // 编号
        @NameInMap("serialNumber")
        public String serialNumber;

        // 所属项目id
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        // 所属项目名称
        @NameInMap("spaceName")
        public String spaceName;

        // 项目类型
        @NameInMap("spaceType")
        public String spaceType;

        // 迭代的id
        @NameInMap("sprintIdentifier")
        public String sprintIdentifier;

        // 状态名称
        @NameInMap("status")
        public String status;

        // 状态唯一标识id
        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        // 状态阶段id
        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        // 工作项标题
        @NameInMap("subject")
        public String subject;

        // 状态更新时间
        @NameInMap("updateStatusAt")
        public Long updateStatusAt;

        // 工作项类型id
        @NameInMap("workitemTypeIdentifier")
        public String workitemTypeIdentifier;

        public static CreateWorkitemResponseBodyWorkitem build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemResponseBodyWorkitem self = new CreateWorkitemResponseBodyWorkitem();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemResponseBodyWorkitem setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public CreateWorkitemResponseBodyWorkitem setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public CreateWorkitemResponseBodyWorkitem setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateWorkitemResponseBodyWorkitem setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public CreateWorkitemResponseBodyWorkitem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateWorkitemResponseBodyWorkitem setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CreateWorkitemResponseBodyWorkitem setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateWorkitemResponseBodyWorkitem setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public CreateWorkitemResponseBodyWorkitem setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CreateWorkitemResponseBodyWorkitem setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public CreateWorkitemResponseBodyWorkitem setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public CreateWorkitemResponseBodyWorkitem setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public CreateWorkitemResponseBodyWorkitem setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public CreateWorkitemResponseBodyWorkitem setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public CreateWorkitemResponseBodyWorkitem setSprintIdentifier(String sprintIdentifier) {
            this.sprintIdentifier = sprintIdentifier;
            return this;
        }
        public String getSprintIdentifier() {
            return this.sprintIdentifier;
        }

        public CreateWorkitemResponseBodyWorkitem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateWorkitemResponseBodyWorkitem setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public CreateWorkitemResponseBodyWorkitem setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public CreateWorkitemResponseBodyWorkitem setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public CreateWorkitemResponseBodyWorkitem setUpdateStatusAt(Long updateStatusAt) {
            this.updateStatusAt = updateStatusAt;
            return this;
        }
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        public CreateWorkitemResponseBodyWorkitem setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

    }

}
