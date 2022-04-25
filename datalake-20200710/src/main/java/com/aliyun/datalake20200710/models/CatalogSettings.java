// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogSettings extends TeaModel {
    // 配置
    @NameInMap("Config")
    public java.util.Map<String, String> config;

    public static CatalogSettings build(java.util.Map<String, ?> map) throws Exception {
        CatalogSettings self = new CatalogSettings();
        return TeaModel.build(map, self);
    }

    public CatalogSettings setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

}
