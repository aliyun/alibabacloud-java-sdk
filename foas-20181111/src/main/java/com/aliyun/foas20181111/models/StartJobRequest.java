// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class StartJobRequest extends TeaModel {
    @NameInMap("parameterJson")
    public java.util.Map<String, ?> parameterJson;

    public static StartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobRequest self = new StartJobRequest();
        return TeaModel.build(map, self);
    }

    public StartJobRequest setParameterJson(java.util.Map<String, ?> parameterJson) {
        this.parameterJson = parameterJson;
        return this;
    }
    public java.util.Map<String, ?> getParameterJson() {
        return this.parameterJson;
    }

}
