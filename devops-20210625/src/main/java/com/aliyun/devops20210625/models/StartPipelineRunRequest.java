// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StartPipelineRunRequest extends TeaModel {
    // 流水线运行参数,json字符串 branchModeBranchs  分支模式运行的分支 envs  环境变量 runningBranchs 运行分支 runningTags  运行代码tag comment  运行备注
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
