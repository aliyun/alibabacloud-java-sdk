// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicWhiteIpsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdatePublicWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicWhiteIpsRequest self = new UpdatePublicWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePublicWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
