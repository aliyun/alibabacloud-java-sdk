// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaSettingsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>This parameter is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateKibanaSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaSettingsRequest self = new UpdateKibanaSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateKibanaSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
