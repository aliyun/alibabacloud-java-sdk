// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
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
