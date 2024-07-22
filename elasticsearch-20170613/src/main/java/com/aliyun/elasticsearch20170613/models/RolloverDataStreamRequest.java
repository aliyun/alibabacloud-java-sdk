// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RolloverDataStreamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static RolloverDataStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        RolloverDataStreamRequest self = new RolloverDataStreamRequest();
        return TeaModel.build(map, self);
    }

    public RolloverDataStreamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
