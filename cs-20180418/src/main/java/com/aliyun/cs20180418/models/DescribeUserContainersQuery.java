// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeUserContainersQuery extends TeaModel {
    @NameInMap("ServiceId")
    public String serviceId;

    public static DescribeUserContainersQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserContainersQuery self = new DescribeUserContainersQuery();
        return TeaModel.build(map, self);
    }

    public DescribeUserContainersQuery setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
