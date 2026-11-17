// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiServicesRequest extends TeaModel {
    /**
     * <p>The token of the Kyuubi Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>6w3s2e7y7t9fxnvtai9sv1uebw8b7bvc</p>
     */
    @NameInMap("token")
    public String token;

    public static ListKyuubiServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiServicesRequest self = new ListKyuubiServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListKyuubiServicesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
