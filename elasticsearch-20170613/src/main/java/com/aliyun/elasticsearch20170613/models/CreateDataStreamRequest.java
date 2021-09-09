// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateDataStreamRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDataStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataStreamRequest self = new CreateDataStreamRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataStreamRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
