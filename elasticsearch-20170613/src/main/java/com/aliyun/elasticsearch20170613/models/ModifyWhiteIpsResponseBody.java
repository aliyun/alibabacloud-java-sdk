// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Response:</p>
     * <br>
     * <p>*   true: The whitelist is updated.</p>
     * <p>*   false: The whitelist failed to be updated.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ModifyWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteIpsResponseBody self = new ModifyWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyWhiteIpsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
