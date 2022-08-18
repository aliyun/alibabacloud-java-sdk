// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ResumePdnsServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResumePdnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumePdnsServiceResponseBody self = new ResumePdnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumePdnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
