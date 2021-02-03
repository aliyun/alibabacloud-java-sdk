// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SwitchDnsGtmInstanceStrategyModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SwitchDnsGtmInstanceStrategyModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDnsGtmInstanceStrategyModeResponse self = new SwitchDnsGtmInstanceStrategyModeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDnsGtmInstanceStrategyModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
