// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SetProductSpiServiceDefaultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetProductSpiServiceDefaultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetProductSpiServiceDefaultResponseBody self = new SetProductSpiServiceDefaultResponseBody();
        return TeaModel.build(map, self);
    }

    public SetProductSpiServiceDefaultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetProductSpiServiceDefaultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
