// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class WakeUpClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static WakeUpClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        WakeUpClusterRequest self = new WakeUpClusterRequest();
        return TeaModel.build(map, self);
    }

    public WakeUpClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
