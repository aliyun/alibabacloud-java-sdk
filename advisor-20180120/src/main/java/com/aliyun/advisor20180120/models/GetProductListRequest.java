// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetProductListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    public static GetProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductListRequest self = new GetProductListRequest();
        return TeaModel.build(map, self);
    }

    public GetProductListRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
