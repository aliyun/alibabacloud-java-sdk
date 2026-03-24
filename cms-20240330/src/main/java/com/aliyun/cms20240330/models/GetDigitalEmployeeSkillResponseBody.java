// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeSkillResponseBody extends TeaModel {
    /**
     * <p>Creation time</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T14:09:11Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Skill description</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Skill display name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Whether the skill is enabled</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>Skill file list</p>
     */
    @NameInMap("files")
    public java.util.List<GetDigitalEmployeeSkillResponseBodyFiles> files;

    /**
     * <p>Remarks</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Skill name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>Update time</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T14:09:11Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>Version number</p>
     * 
     * <strong>example:</strong>
     * <p>1770386951147366810</p>
     */
    @NameInMap("version")
    public String version;

    public static GetDigitalEmployeeSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeSkillResponseBody self = new GetDigitalEmployeeSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeSkillResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDigitalEmployeeSkillResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDigitalEmployeeSkillResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetDigitalEmployeeSkillResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetDigitalEmployeeSkillResponseBody setFiles(java.util.List<GetDigitalEmployeeSkillResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<GetDigitalEmployeeSkillResponseBodyFiles> getFiles() {
        return this.files;
    }

    public GetDigitalEmployeeSkillResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetDigitalEmployeeSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDigitalEmployeeSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public GetDigitalEmployeeSkillResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetDigitalEmployeeSkillResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetDigitalEmployeeSkillResponseBodyFiles extends TeaModel {
        /**
         * <p>File content</p>
         * 
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
         * <p>File name</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("name")
        public String name;

        public static GetDigitalEmployeeSkillResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeSkillResponseBodyFiles self = new GetDigitalEmployeeSkillResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeSkillResponseBodyFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDigitalEmployeeSkillResponseBodyFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
