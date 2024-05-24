// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RunAfter extends TeaModel {
    @NameInMap("name")
    public String name;

    public static RunAfter build(java.util.Map<String, ?> map) throws Exception {
        RunAfter self = new RunAfter();
        return TeaModel.build(map, self);
    }

    public RunAfter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
