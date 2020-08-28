// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeGtmInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusRequest self = new DescribeGtmInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

}
