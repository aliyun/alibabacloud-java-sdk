// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdateKibanaWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaWhiteIpsRequest self = new UpdateKibanaWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateKibanaWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
