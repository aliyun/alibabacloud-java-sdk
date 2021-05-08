// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeEndpointsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Type")
    public String type;

    public static DescribeEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsRequest self = new DescribeEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeEndpointsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeEndpointsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
