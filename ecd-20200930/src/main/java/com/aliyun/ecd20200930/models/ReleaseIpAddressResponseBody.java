// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ReleaseIpAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIpAddressResponseBody self = new ReleaseIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
