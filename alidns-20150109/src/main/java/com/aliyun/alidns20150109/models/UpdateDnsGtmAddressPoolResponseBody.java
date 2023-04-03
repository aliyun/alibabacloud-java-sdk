// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDnsGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAddressPoolResponseBody self = new UpdateDnsGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
