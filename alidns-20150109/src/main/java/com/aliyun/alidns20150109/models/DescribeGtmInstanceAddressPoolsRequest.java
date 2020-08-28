// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGtmInstanceAddressPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsRequest self = new DescribeGtmInstanceAddressPoolsRequest();
        return TeaModel.build(map, self);
    }

}
