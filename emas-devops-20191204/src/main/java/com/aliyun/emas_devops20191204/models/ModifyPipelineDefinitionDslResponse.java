// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ModifyPipelineDefinitionDslResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static ModifyPipelineDefinitionDslResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPipelineDefinitionDslResponse self = new ModifyPipelineDefinitionDslResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPipelineDefinitionDslResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPipelineDefinitionDslResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
