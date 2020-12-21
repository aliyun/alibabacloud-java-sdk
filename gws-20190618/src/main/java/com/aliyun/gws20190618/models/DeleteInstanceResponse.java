// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponse self = new DeleteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
