// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableThemeRequest extends TeaModel {
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

    public static DeleteTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableThemeRequest self = new DeleteTableThemeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteTableThemeRequest setThemeId(Long themeId) {
        this.themeId = themeId;
        return this;
    }
    public Long getThemeId() {
        return this.themeId;
    }

}
