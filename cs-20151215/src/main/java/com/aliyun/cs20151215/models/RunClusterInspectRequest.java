// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterInspectRequest extends TeaModel {
    /**
     * <p>The idempotency token that ensures an API request completes no more than one time.</p>
     * 
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static RunClusterInspectRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterInspectRequest self = new RunClusterInspectRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterInspectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
