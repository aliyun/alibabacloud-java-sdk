// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomViewResponseBody extends TeaModel {
    @NameInMap("CustomViewId")
    public String customViewId;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterCustomViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomViewResponseBody self = new RegisterCustomViewResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterCustomViewResponseBody setCustomViewId(String customViewId) {
        this.customViewId = customViewId;
        return this;
    }
    public String getCustomViewId() {
        return this.customViewId;
    }

    public RegisterCustomViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
