// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemRequest extends TeaModel {
    // 工作项负责人的id，或者企业中的用户名
    @NameInMap("assignedTo")
    public String assignedTo;

    // 工作项的类型id，比如：Bug、Task对应id
    @NameInMap("category")
    public String category;

    // 工作项内容
    @NameInMap("description")
    public String description;

    // 内容格式
    @NameInMap("descriptionFormat")
    public String descriptionFormat;

    // 自定义字段
    @NameInMap("fieldValueList")
    public java.util.List<CreateWorkitemRequestFieldValueList> fieldValueList;

    // 参与人id列表，或者企业名称列表
    @NameInMap("participant")
    public java.util.List<String> participant;

    // 项目id
    @NameInMap("space")
    public String space;

    // 项目id
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    // 资源类型
    @NameInMap("spaceType")
    public String spaceType;

    // 要关联迭代
    @NameInMap("sprint")
    public java.util.List<String> sprint;

    // 标题
    @NameInMap("subject")
    public String subject;

    // 抄送人id列表
    @NameInMap("tracker")
    public java.util.List<String> tracker;

    // 验证者id列表，或者企业名称列表
    @NameInMap("verifier")
    public java.util.List<String> verifier;

    // 工作项小类型id
    @NameInMap("workitemType")
    public String workitemType;

    public static CreateWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemRequest self = new CreateWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public CreateWorkitemRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateWorkitemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkitemRequest setDescriptionFormat(String descriptionFormat) {
        this.descriptionFormat = descriptionFormat;
        return this;
    }
    public String getDescriptionFormat() {
        return this.descriptionFormat;
    }

    public CreateWorkitemRequest setFieldValueList(java.util.List<CreateWorkitemRequestFieldValueList> fieldValueList) {
        this.fieldValueList = fieldValueList;
        return this;
    }
    public java.util.List<CreateWorkitemRequestFieldValueList> getFieldValueList() {
        return this.fieldValueList;
    }

    public CreateWorkitemRequest setParticipant(java.util.List<String> participant) {
        this.participant = participant;
        return this;
    }
    public java.util.List<String> getParticipant() {
        return this.participant;
    }

    public CreateWorkitemRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public CreateWorkitemRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public CreateWorkitemRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public CreateWorkitemRequest setSprint(java.util.List<String> sprint) {
        this.sprint = sprint;
        return this;
    }
    public java.util.List<String> getSprint() {
        return this.sprint;
    }

    public CreateWorkitemRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateWorkitemRequest setTracker(java.util.List<String> tracker) {
        this.tracker = tracker;
        return this;
    }
    public java.util.List<String> getTracker() {
        return this.tracker;
    }

    public CreateWorkitemRequest setVerifier(java.util.List<String> verifier) {
        this.verifier = verifier;
        return this;
    }
    public java.util.List<String> getVerifier() {
        return this.verifier;
    }

    public CreateWorkitemRequest setWorkitemType(String workitemType) {
        this.workitemType = workitemType;
        return this;
    }
    public String getWorkitemType() {
        return this.workitemType;
    }

    public static class CreateWorkitemRequestFieldValueList extends TeaModel {
        // 字段唯一标识
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        // 字段值，写入时使用
        @NameInMap("value")
        public String value;

        // 工作项的唯一标识
        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static CreateWorkitemRequestFieldValueList build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemRequestFieldValueList self = new CreateWorkitemRequestFieldValueList();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemRequestFieldValueList setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public CreateWorkitemRequestFieldValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateWorkitemRequestFieldValueList setWorkitemIdentifier(String workitemIdentifier) {
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

    }

}
