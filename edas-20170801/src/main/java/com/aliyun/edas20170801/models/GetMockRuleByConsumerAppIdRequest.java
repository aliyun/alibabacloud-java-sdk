// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByConsumerAppIdRequest extends TeaModel {
    @NameInMap("ConsumerAppId")
    public String consumerAppId;

    @NameInMap("Region")
    public String region;

    public static GetMockRuleByConsumerAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByConsumerAppIdRequest self = new GetMockRuleByConsumerAppIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByConsumerAppIdRequest setConsumerAppId(String consumerAppId) {
        this.consumerAppId = consumerAppId;
        return this;
    }
    public String getConsumerAppId() {
        return this.consumerAppId;
    }

    public GetMockRuleByConsumerAppIdRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
