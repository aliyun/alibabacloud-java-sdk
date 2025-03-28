// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class BuildConfig extends TeaModel {
    @NameInMap("default")
    public DefaultBuilderConfig _default;

    public static BuildConfig build(java.util.Map<String, ?> map) throws Exception {
        BuildConfig self = new BuildConfig();
        return TeaModel.build(map, self);
    }

    public BuildConfig set_default(DefaultBuilderConfig _default) {
        this._default = _default;
        return this;
    }
    public DefaultBuilderConfig get_default() {
        return this._default;
    }

}
