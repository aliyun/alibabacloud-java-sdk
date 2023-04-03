// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDnsGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAddressPoolResponseBody self = new DeleteDnsGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
