// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainDnssecStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetDomainDnssecStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainDnssecStatusResponse self = new SetDomainDnssecStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainDnssecStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
