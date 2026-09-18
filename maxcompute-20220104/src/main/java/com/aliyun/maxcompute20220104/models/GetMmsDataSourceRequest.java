// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsDataSourceRequest extends TeaModel {
    /**
     * <p>The language of the description for the configuration items.</p>
     * 
     * <strong>example:</strong>
     * <p>en_US</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>Specifies whether to obtain the specific configuration items of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withConfig")
    public Boolean withConfig;

    public static GetMmsDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMmsDataSourceRequest self = new GetMmsDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetMmsDataSourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetMmsDataSourceRequest setWithConfig(Boolean withConfig) {
        this.withConfig = withConfig;
        return this;
    }
    public Boolean getWithConfig() {
        return this.withConfig;
    }

}
