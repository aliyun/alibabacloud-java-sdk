// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCustomDomainSampleRateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomDomainSampleRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomDomainSampleRateResponseBody self = new DeleteCustomDomainSampleRateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomDomainSampleRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
