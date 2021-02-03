// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmAccessModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetGtmAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGtmAccessModeResponse self = new SetGtmAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public SetGtmAccessModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
