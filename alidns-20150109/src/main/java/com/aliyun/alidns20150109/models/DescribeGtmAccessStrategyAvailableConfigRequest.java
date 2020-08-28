// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyAvailableConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeGtmAccessStrategyAvailableConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyAvailableConfigRequest self = new DescribeGtmAccessStrategyAvailableConfigRequest();
        return TeaModel.build(map, self);
    }

}
