// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataStreamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteDataStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataStreamRequest self = new DeleteDataStreamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataStreamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
