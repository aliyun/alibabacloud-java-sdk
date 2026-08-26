// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentThemeUploadSignatureRequest extends TeaModel {
    /**
     * <p>The theme UUID. By default, you do not need to specify this parameter because the backend automatically generates and returns a UUID. Specify this parameter to regenerate a signature only when the previous signature has expired.</p>
     * 
     * <strong>example:</strong>
     * <p>0f8b2c1d-<strong><strong>-</strong></strong>-****-9a3e5f7b1c2d</p>
     */
    @NameInMap("ThemeId")
    public String themeId;

    public static GetDataAgentThemeUploadSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentThemeUploadSignatureRequest self = new GetDataAgentThemeUploadSignatureRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentThemeUploadSignatureRequest setThemeId(String themeId) {
        this.themeId = themeId;
        return this;
    }
    public String getThemeId() {
        return this.themeId;
    }

}
