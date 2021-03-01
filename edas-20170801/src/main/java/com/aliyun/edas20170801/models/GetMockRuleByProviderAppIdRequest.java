// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByProviderAppIdRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ProviderAppId")
    public String providerAppId;

    public static GetMockRuleByProviderAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByProviderAppIdRequest self = new GetMockRuleByProviderAppIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByProviderAppIdRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetMockRuleByProviderAppIdRequest setProviderAppId(String providerAppId) {
        this.providerAppId = providerAppId;
        return this;
    }
    public String getProviderAppId() {
        return this.providerAppId;
    }

}
