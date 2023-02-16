// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteApiDestinationRequest extends TeaModel {
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteApiDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiDestinationRequest self = new DeleteApiDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiDestinationRequest setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
        return this;
    }
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    public DeleteApiDestinationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
