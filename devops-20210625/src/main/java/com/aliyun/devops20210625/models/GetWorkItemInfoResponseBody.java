// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemInfoResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    // 工作项信息
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
        // 根据语言环境获取当前展示的值
        @NameInMap("displayValue")
        public String displayValue;

        // 字段值为对象类型时，值所对应的对象的唯一标识 例如：option表中的id
        @NameInMap("identifier")
        public String identifier;

        // 展示级别，数字范围1~9，数字越大，颜色越浅。
        @NameInMap("level")
        public Long level;

        // 字段值
        @NameInMap("value")
        public String value;

        // 字段英文值，目前只有列表类有英文值
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
        // 字段的className，便于数据查询
        @NameInMap("fieldClassName")
        public String fieldClassName;

        // 字段格式，便于查询数据
        @NameInMap("fieldFormat")
        public String fieldFormat;

        // 字段的唯一标识
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        // 展示级别，数字范围1~9，数字越大，颜色越浅。
        @NameInMap("level")
        public Long level;

        // 值对象列表
        @NameInMap("objectValue")
        public String objectValue;

        // 自定义字段值的position
        @NameInMap("position")
        public Long position;

        // 字段值，写入时使用
        @NameInMap("value")
        public String value;

        // 值对象列表，查询时使用
        @NameInMap("valueList")
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFieldsValueList> valueList;

        // 工作项的唯一标识
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

    public static class GetWorkItemInfoResponseBodyWorkitem extends TeaModel {
        // 负责人
        @NameInMap("assignedTo")
        public String assignedTo;

        // 工作项的类型id
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        // 创建人
        @NameInMap("creator")
        public String creator;

        // 自定义字段列表
        @NameInMap("customFields")
        public java.util.List<GetWorkItemInfoResponseBodyWorkitemCustomFields> customFields;

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

        // 参与人account id列表
        @NameInMap("participant")
        public java.util.List<String> participant;

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

        // 关联的迭代id
        @NameInMap("sprint")
        public java.util.List<String> sprint;

        // 状态名称
        @NameInMap("status")
        public String status;

        // 状态id
        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        // 状态阶段id
        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        // 工作项标题
        @NameInMap("subject")
        public String subject;

        // 标签id列表
        @NameInMap("tag")
        public java.util.List<String> tag;

        // 抄送人的account id列表
        @NameInMap("tracker")
        public java.util.List<String> tracker;

        // 状态更新时间
        @NameInMap("updateStatusAt")
        public Long updateStatusAt;

        // 验证者的account id列表
        @NameInMap("verifier")
        public java.util.List<String> verifier;

        // 工作项类型id
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

        public GetWorkItemInfoResponseBodyWorkitem setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

    }

}
