// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendfilesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateExtendfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendfilesRequest self = new UpdateExtendfilesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExtendfilesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
