// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnServiceResponseBody self = new ModifyCdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
