// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableThemeRequest extends TeaModel {
    /**
     * <p>The name of the table folder.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the table folder.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ThemeId")
    public Long themeId;

    public static UpdateTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableThemeRequest self = new UpdateTableThemeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableThemeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateTableThemeRequest setThemeId(Long themeId) {
        this.themeId = themeId;
        return this;
    }
    public Long getThemeId() {
        return this.themeId;
    }

}
