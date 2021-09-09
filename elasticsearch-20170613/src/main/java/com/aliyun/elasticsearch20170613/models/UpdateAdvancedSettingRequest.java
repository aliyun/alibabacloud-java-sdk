// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdvancedSettingRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAdvancedSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdvancedSettingRequest self = new UpdateAdvancedSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdvancedSettingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
