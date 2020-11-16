// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterVideoResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterVideoResourceResponse self = new DeleteCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterVideoResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
