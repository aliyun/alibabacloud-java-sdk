// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentThemeRequest extends TeaModel {
    /**
     * <p>The business ID of the theme.</p>
     * 
     * <strong>example:</strong>
     * <p>0f8b2c1d************9a3e5f7b1c2d</p>
     */
    @NameInMap("ThemeId")
    public String themeId;

    public static DescribeDataAgentThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentThemeRequest self = new DescribeDataAgentThemeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentThemeRequest setThemeId(String themeId) {
        this.themeId = themeId;
        return this;
    }
    public String getThemeId() {
        return this.themeId;
    }

}
