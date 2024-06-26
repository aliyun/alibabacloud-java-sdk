// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumInvitaionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeEthereumInvitaionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumInvitaionRequest self = new DescribeEthereumInvitaionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumInvitaionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
