// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ReleaseAnycastEipAddressRequest extends TeaModel {
    @NameInMap("AnycastId")
    public String anycastId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ReleaseAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAnycastEipAddressRequest self = new ReleaseAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ReleaseAnycastEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
