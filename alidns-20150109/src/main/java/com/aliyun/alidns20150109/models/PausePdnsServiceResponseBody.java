// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PausePdnsServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PausePdnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PausePdnsServiceResponseBody self = new PausePdnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PausePdnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
