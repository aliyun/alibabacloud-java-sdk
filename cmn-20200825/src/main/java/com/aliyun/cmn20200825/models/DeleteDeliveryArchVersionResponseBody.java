// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeliveryArchVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeliveryArchVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryArchVersionResponseBody self = new DeleteDeliveryArchVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryArchVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
