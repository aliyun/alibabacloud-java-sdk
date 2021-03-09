// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDirectorySsoStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetDirectorySsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDirectorySsoStatusResponse self = new SetDirectorySsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDirectorySsoStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
