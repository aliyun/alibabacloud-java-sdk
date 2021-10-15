// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteIpsResponseBody self = new ModifyWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteIpsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ModifyWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
