// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonCodeTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <strong>example:</strong>
     * <p>Client</p>
     */
    @NameInMap("environmentType")
    public String environmentType;

    /**
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
    @NameInMap("version")
    public String version;

    public static GetAddonCodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAddonCodeTemplateRequest self = new GetAddonCodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetAddonCodeTemplateRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetAddonCodeTemplateRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public GetAddonCodeTemplateRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
