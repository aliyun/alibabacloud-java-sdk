// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaSettingsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateKibanaSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaSettingsRequest self = new UpdateKibanaSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
