// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DisableTrunkProvidersRequest extends TeaModel {
    @NameInMap("ProviderName")
    public java.util.List<String> providerName;

    public static DisableTrunkProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableTrunkProvidersRequest self = new DisableTrunkProvidersRequest();
        return TeaModel.build(map, self);
    }

    public DisableTrunkProvidersRequest setProviderName(java.util.List<String> providerName) {
        this.providerName = providerName;
        return this;
    }
    public java.util.List<String> getProviderName() {
        return this.providerName;
    }

}
