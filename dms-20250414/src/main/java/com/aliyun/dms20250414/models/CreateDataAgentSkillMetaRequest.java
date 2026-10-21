// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSkillMetaRequest extends TeaModel {
    /**
     * <p>The skill description.</p>
     * <ul>
     * <li>Optional. If not specified, the system parses the ZIP package specified by UploadLocation to obtain the skill description.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>This is a demo skill description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The skill name.</p>
     * <ul>
     * <li>Optional. If not specified, the system parses the ZIP package specified by UploadLocation to obtain the skill name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>data-query-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The full path to the uploaded skill ZIP file.</p>
     * <ul>
     * <li>Format: Concatenate the file name to the UploadDir value returned by the DescribeSkillFileUploadSignature operation.</li>
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
