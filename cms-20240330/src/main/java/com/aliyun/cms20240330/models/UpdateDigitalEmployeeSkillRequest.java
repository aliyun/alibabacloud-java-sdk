// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeSkillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("files")
    public java.util.List<UpdateDigitalEmployeeSkillRequestFiles> files;

    /**
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("remark")
    public String remark;

    public static UpdateDigitalEmployeeSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeSkillRequest self = new UpdateDigitalEmployeeSkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDigitalEmployeeSkillRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateDigitalEmployeeSkillRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateDigitalEmployeeSkillRequest setFiles(java.util.List<UpdateDigitalEmployeeSkillRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<UpdateDigitalEmployeeSkillRequestFiles> getFiles() {
        return this.files;
    }

    public UpdateDigitalEmployeeSkillRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public static class UpdateDigitalEmployeeSkillRequestFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         * <h2>name: skill
         * description: description</h2>
         * <h1>skill</h1>
         * <p>skill test</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateDigitalEmployeeSkillRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeSkillRequestFiles self = new UpdateDigitalEmployeeSkillRequestFiles();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeSkillRequestFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateDigitalEmployeeSkillRequestFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
