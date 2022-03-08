// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeliveryProjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeliveryProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryProjectResponseBody self = new DeleteDeliveryProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
