// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class UpdateFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("CurrentVersionId")
    @Validation(required = true)
    public Integer currentVersionId;

    public static UpdateFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowResponse self = new UpdateFlowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFlowResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateFlowResponse setCurrentVersionId(Integer currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }
    public Integer getCurrentVersionId() {
        return this.currentVersionId;
    }

}
