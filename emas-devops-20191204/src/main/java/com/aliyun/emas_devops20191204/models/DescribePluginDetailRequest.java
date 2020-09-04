// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePluginDetailRequest extends TeaModel {
    @NameInMap("PluginName")
    @Validation(required = true)
    public String pluginName;

    @NameInMap("PluginVersion")
    public String pluginVersion;

    public static DescribePluginDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginDetailRequest self = new DescribePluginDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginDetailRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public DescribePluginDetailRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

}
