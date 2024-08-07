// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseHttpsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B350****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CloseHttpsRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseHttpsRequest self = new CloseHttpsRequest();
        return TeaModel.build(map, self);
    }

    public CloseHttpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
