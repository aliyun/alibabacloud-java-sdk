// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyDataAgentThemeRequest extends TeaModel {
    /**
     * <p>The description of the theme. Maximum length: 255 characters. A value of null indicates that the field is not modified. An empty string clears the field.</p>
     * 
     * <strong>example:</strong>
     * <p>weekly report</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The business identifier of the theme.</p>
     * 
     * <strong>example:</strong>
     * <p>0f8b2c1d-<strong><strong>-</strong></strong>-****-9a3e5f7b1c2d</p>
     */
    @NameInMap("ThemeId")
    public String themeId;

    /**
     * <p>The display name of the theme. Maximum length: 64 characters. A value of null indicates that the field is not modified. An empty string clears the field.</p>
     * 
     * <strong>example:</strong>
     * <p>weekly report</p>
     */
    @NameInMap("ThemeName")
    public String themeName;

    public static ModifyDataAgentThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataAgentThemeRequest self = new ModifyDataAgentThemeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataAgentThemeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDataAgentThemeRequest setThemeId(String themeId) {
        this.themeId = themeId;
        return this;
    }
    public String getThemeId() {
        return this.themeId;
    }

    public ModifyDataAgentThemeRequest setThemeName(String themeName) {
        this.themeName = themeName;
        return this;
    }
    public String getThemeName() {
        return this.themeName;
    }

}
