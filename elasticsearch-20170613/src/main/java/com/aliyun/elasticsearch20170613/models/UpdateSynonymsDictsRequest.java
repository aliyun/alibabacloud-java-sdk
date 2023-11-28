// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSynonymsDictsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateSynonymsDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsDictsRequest self = new UpdateSynonymsDictsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsDictsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateSynonymsDictsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
