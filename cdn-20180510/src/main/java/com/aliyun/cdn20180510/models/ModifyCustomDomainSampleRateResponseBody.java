// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCustomDomainSampleRateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomDomainSampleRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomDomainSampleRateResponseBody self = new ModifyCustomDomainSampleRateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomDomainSampleRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
