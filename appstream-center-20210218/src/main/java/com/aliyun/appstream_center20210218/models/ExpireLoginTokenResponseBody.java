// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class ExpireLoginTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ExpireLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExpireLoginTokenResponseBody self = new ExpireLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ExpireLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
