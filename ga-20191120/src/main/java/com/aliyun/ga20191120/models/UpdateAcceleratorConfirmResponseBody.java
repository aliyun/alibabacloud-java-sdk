// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorConfirmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAcceleratorConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorConfirmResponseBody self = new UpdateAcceleratorConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
