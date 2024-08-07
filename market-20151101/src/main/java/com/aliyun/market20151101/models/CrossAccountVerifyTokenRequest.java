// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CrossAccountVerifyTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C19D103FEA2D50A584410267CE9FBA56</p>
     */
    @NameInMap("Token")
    public String token;

    public static CrossAccountVerifyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CrossAccountVerifyTokenRequest self = new CrossAccountVerifyTokenRequest();
        return TeaModel.build(map, self);
    }

    public CrossAccountVerifyTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
