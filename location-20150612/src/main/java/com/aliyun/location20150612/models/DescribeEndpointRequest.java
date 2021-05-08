// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeEndpointRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Password")
    public String password;

    public static DescribeEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointRequest self = new DescribeEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeEndpointRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeEndpointRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
