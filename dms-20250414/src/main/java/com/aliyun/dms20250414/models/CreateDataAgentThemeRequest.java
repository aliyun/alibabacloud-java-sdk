// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentThemeRequest extends TeaModel {
    /**
     * <p>The scenario, which affects the filtering when you view the theme list in the console. Valid values:</p>
     * <ul>
     * <li>(Recommended) custom: A user-uploaded custom theme with no preset style or information organization structure.</li>
     * <li>report: A web report that conforms to the DataAgent information organization structure.</li>
     * <li>(Not supported) infographic: An infographic that conforms to the DataAgent information organization structure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The description. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>weekly report</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file source, which affects the backend logic for determining whether the theme is valid. Valid values:</p>
     * <ul>
     * <li>upload: The file is uploaded through OSS.</li>
     * <li>(Not supported) public_url: The file is provided through a public network access OSS URL.</li>
     * <li>(Not supported) user_oss: The file is provided through a user OSS URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>upload</p>
     */
    @NameInMap("FileFrom")
    public String fileFrom;

    /**
     * <p>The UUID of the theme. The value must be returned by GetDataAgentThemeUploadSignature, and the file must have been uploaded. If the UUID is forged or the file has not been uploaded, the creation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>0f8b2c1d************9a3e5f7b1c2d</p>
     */
    @NameInMap("ThemeId")
    public String themeId;

    /**
     * <p>The display name of the theme. The value can be up to 64 characters in length. This parameter is required when you create a theme.</p>
     * 
     * <strong>example:</strong>
     * <p>weekly report</p>
     */
    @NameInMap("ThemeName")
    public String themeName;

    /**
     * <p>The type of the custom theme. Valid values:</p>
     * <ul>
     * <li>(Default) template: The theme is a template.</li>
     * <li>(Not supported) design: The theme is a DESIGN.md file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("ThemeType")
    public String themeType;

    /**
     * <p>The workspace to which the theme belongs. If this parameter is not specified or is set to personal, the personal workspace is used. You can also specify a collaboration workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99fad******qg6c0l4nlacu</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentThemeRequest self = new CreateDataAgentThemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentThemeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDataAgentThemeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataAgentThemeRequest setFileFrom(String fileFrom) {
        this.fileFrom = fileFrom;
        return this;
    }
    public String getFileFrom() {
        return this.fileFrom;
    }

    public CreateDataAgentThemeRequest setThemeId(String themeId) {
        this.themeId = themeId;
        return this;
    }
    public String getThemeId() {
        return this.themeId;
    }

    public CreateDataAgentThemeRequest setThemeName(String themeName) {
        this.themeName = themeName;
        return this;
    }
    public String getThemeName() {
        return this.themeName;
    }

    public CreateDataAgentThemeRequest setThemeType(String themeType) {
        this.themeType = themeType;
        return this;
    }
    public String getThemeType() {
        return this.themeType;
    }

    public CreateDataAgentThemeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
