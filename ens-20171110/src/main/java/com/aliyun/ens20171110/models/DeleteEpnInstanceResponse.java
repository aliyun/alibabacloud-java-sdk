// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEpnInstanceResponse self = new DeleteEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
