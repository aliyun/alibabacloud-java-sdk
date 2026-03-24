// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonSchemaRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: \<code>zh\\</code> and \<code>en\\</code>. The default value is \<code>zh\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <p>The environment type. Valid values: \<code>CS\\</code> (container) and \<code>ECS\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("environmentType")
    public String environmentType;

    /**
     * <p>The version of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1.1</p>
     */
    @NameInMap("version")
    public String version;

    public static GetAddonSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAddonSchemaRequest self = new GetAddonSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetAddonSchemaRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetAddonSchemaRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public GetAddonSchemaRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
