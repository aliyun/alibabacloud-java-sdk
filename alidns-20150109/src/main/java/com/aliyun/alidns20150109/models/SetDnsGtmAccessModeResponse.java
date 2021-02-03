// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetDnsGtmAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDnsGtmAccessModeResponse self = new SetDnsGtmAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public SetDnsGtmAccessModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
