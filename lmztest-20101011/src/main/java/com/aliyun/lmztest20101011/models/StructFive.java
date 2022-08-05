// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class StructFive extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    public static StructFive build(java.util.Map<String, ?> map) throws Exception {
        StructFive self = new StructFive();
        return TeaModel.build(map, self);
    }

    public StructFive setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
