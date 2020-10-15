// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteVSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchResponse self = new DeleteVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
