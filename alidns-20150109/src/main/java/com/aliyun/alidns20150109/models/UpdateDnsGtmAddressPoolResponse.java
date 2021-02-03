// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAddressPoolResponse self = new UpdateDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAddressPoolResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
