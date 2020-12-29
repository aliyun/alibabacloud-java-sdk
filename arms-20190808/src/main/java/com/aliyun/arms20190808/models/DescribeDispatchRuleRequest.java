// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeDispatchRuleRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static DescribeDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDispatchRuleRequest self = new DescribeDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDispatchRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDispatchRuleRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

}
