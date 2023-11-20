// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterCheckRequest extends TeaModel {
    @NameInMap("options")
    public java.util.Map<String, String> options;

    @NameInMap("type")
    public String type;

    public static RunClusterCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterCheckRequest self = new RunClusterCheckRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterCheckRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public RunClusterCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
