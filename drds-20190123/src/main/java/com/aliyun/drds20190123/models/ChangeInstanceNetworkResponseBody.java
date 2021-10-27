// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeInstanceNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceNetworkResponseBody self = new ChangeInstanceNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeInstanceNetworkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
