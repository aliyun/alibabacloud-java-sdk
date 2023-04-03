// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDnsGtmAccessModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDnsGtmAccessModeResponseBody self = new SetDnsGtmAccessModeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDnsGtmAccessModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
