// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ModifyPublishPipelineTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static ModifyPublishPipelineTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPublishPipelineTemplateResponse self = new ModifyPublishPipelineTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPublishPipelineTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPublishPipelineTemplateResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
