// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyWebsiteInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyWebsiteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyWebsiteInstanceResponseBody self = new VerifyWebsiteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyWebsiteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
