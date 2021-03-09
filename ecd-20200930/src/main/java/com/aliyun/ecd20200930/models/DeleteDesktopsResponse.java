// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopsResponse self = new DeleteDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
