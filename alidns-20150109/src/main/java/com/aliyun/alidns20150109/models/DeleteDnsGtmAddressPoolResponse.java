// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAddressPoolResponse self = new DeleteDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAddressPoolResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
