// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StartPipelineRunRequest extends TeaModel {
    @NameInMap("params")
    public String params;

    public static StartPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineRunRequest self = new StartPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public StartPipelineRunRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
