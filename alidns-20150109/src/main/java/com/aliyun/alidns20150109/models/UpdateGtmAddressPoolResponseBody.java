// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAddressPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAddressPoolResponseBody self = new UpdateGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
