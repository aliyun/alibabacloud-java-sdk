// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentThemeRequest extends TeaModel {
    /**
     * <p>The application scenario, which affects filtering when viewing the theme list in the console. Valid values:</p>
     * <ul>
     * <li>(Recommended) custom: a user-uploaded custom theme with no preset style or information organization structure.</li>
     * <li>report: a web report that conforms to the DataAgent information organization structure.</li>
     * <li>(Not supported) infographic: an infographic that conforms to the DataAgent information organization structure.</li>
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
     * <li>upload: uploaded through OSS.</li>
     * <li>(Not supported) public_url: provided through an OSS URL that allows public network access.</li>
     * <li>(Not supported) user_oss: provided through a user OSS URL.</li>
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
     * <p>The display name of the theme. The value can be up to 64 characters in length. This parameter is required during creation.</p>
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

}
