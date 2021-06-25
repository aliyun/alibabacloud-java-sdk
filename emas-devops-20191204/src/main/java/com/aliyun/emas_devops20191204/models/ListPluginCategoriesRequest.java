// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPluginCategoriesRequest extends TeaModel {
    @NameInMap("PluginEnv")
    @Validation(required = true)
    public String pluginEnv;

    public static ListPluginCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginCategoriesRequest self = new ListPluginCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginCategoriesRequest setPluginEnv(String pluginEnv) {
        this.pluginEnv = pluginEnv;
        return this;
    }
    public String getPluginEnv() {
        return this.pluginEnv;
    }

}
