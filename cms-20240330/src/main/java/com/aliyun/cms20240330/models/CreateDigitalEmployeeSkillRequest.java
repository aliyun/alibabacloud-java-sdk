// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeSkillRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("files")
    public java.util.List<CreateDigitalEmployeeSkillRequestFiles> files;

    /**
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skill</p>
     */
    @NameInMap("skillName")
    public String skillName;

    public static CreateDigitalEmployeeSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeSkillRequest self = new CreateDigitalEmployeeSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDigitalEmployeeSkillRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDigitalEmployeeSkillRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateDigitalEmployeeSkillRequest setFiles(java.util.List<CreateDigitalEmployeeSkillRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<CreateDigitalEmployeeSkillRequestFiles> getFiles() {
        return this.files;
    }

    public CreateDigitalEmployeeSkillRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateDigitalEmployeeSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public static class CreateDigitalEmployeeSkillRequestFiles extends TeaModel {
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

        public static CreateDigitalEmployeeSkillRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeSkillRequestFiles self = new CreateDigitalEmployeeSkillRequestFiles();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeSkillRequestFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDigitalEmployeeSkillRequestFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
