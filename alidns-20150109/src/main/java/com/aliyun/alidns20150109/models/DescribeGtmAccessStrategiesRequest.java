// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategiesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGtmAccessStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategiesRequest self = new DescribeGtmAccessStrategiesRequest();
        return TeaModel.build(map, self);
    }

}
