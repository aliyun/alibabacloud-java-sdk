// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableThemeRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("ThemeId")
    @Validation(required = true)
    public Long themeId;

    public static UpdateTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableThemeRequest self = new UpdateTableThemeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateTableThemeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTableThemeRequest setThemeId(Long themeId) {
        this.themeId = themeId;
        return this;
    }
    public Long getThemeId() {
        return this.themeId;
    }

}
