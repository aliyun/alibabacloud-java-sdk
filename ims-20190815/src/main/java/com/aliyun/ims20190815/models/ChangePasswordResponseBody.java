// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ChangePasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangePasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordResponseBody self = new ChangePasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangePasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
