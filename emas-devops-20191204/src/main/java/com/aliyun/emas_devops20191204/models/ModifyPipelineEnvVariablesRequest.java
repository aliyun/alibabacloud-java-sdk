// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ModifyPipelineEnvVariablesRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("EnvVariables")
    @Validation(required = true)
    public String envVariables;

    public static ModifyPipelineEnvVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPipelineEnvVariablesRequest self = new ModifyPipelineEnvVariablesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPipelineEnvVariablesRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ModifyPipelineEnvVariablesRequest setEnvVariables(String envVariables) {
        this.envVariables = envVariables;
        return this;
    }
    public String getEnvVariables() {
        return this.envVariables;
    }

}
