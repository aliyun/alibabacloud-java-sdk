// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationResponse self = new DeleteApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
