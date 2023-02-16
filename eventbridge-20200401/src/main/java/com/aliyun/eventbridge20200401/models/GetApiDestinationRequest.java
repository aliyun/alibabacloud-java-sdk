// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetApiDestinationRequest extends TeaModel {
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static GetApiDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiDestinationRequest self = new GetApiDestinationRequest();
        return TeaModel.build(map, self);
    }

    public GetApiDestinationRequest setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
        return this;
    }
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    public GetApiDestinationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
