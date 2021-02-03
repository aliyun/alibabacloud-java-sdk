// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCustomLinesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCustomLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLinesResponse self = new DeleteCustomLinesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLinesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
