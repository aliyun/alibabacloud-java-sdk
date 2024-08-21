// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class SignResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1ed33293-2e48-6b14-861e-538e28e408eb</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The signature.</p>
     * 
     * <strong>example:</strong>
     * <p>eyaC0w3ROK5b3QcHmUtAhMY/sQjKu2t3uBfnf6J/gn7JfZtyxwcCUjzXbw5jmqJQRbj1te670Bshg9kUdanKhtHFhJjU5jX+ZMMBr6pH0gqQDJxR0K0yHXRc0Q5OQoUZ6BfpbI4Wt4jJvJSdCstz1vSg12CfEHS8Kd5qfhItK7Y=</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static SignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SignResponseBody self = new SignResponseBody();
        return TeaModel.build(map, self);
    }

    public SignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
