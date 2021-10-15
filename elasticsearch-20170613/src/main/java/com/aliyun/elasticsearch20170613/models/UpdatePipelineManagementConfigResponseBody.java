// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelineManagementConfigResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePipelineManagementConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineManagementConfigResponseBody self = new UpdatePipelineManagementConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineManagementConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdatePipelineManagementConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
