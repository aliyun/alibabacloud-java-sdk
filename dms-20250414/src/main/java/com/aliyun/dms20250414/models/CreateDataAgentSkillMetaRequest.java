// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSkillMetaRequest extends TeaModel {
    /**
     * <p>The skill description. This parameter is optional. If not specified, the backend parses the ZIP package specified by UploadLocation to obtain the skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a demo skill description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The skill ID. If you specify this parameter, the uploaded skill overwrites the existing skill and replaces the original skill content. Note: The name of the original skill and the newly uploaded skill must be identical.</p>
     * 
     * <strong>example:</strong>
     * <p>ski-04pomiln*************j0</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The skill name. This parameter is optional. If not specified, the backend parses the ZIP package specified by UploadLocation to obtain the skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>data-query-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The full path for the skill ZIP file upload.</p>
     * <ul>
     * <li>Format: The UploadDir field returned by the DescribeSkillFileUploadSignature operation concatenated with the file name.</li>
     * <li>Example: ${UploadDir}/${Filename}</li>
     * </ul>
     */
    @NameInMap("UploadLocation")
    public String uploadLocation;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tmbbtfv8***********zuqko6</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentSkillMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSkillMetaRequest self = new CreateDataAgentSkillMetaRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSkillMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataAgentSkillMetaRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public CreateDataAgentSkillMetaRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CreateDataAgentSkillMetaRequest setUploadLocation(String uploadLocation) {
        this.uploadLocation = uploadLocation;
        return this;
    }
    public String getUploadLocation() {
        return this.uploadLocation;
    }

    public CreateDataAgentSkillMetaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
