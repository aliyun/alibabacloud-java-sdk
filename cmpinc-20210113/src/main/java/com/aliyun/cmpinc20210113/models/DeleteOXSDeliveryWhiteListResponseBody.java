// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class DeleteOXSDeliveryWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOXSDeliveryWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOXSDeliveryWhiteListResponseBody self = new DeleteOXSDeliveryWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOXSDeliveryWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
