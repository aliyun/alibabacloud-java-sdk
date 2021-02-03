// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAddressPoolResponse self = new DeleteGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGtmAddressPoolResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
