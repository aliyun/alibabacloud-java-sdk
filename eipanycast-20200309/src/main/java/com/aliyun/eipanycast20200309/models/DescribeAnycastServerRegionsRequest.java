// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastServerRegionsRequest extends TeaModel {
    /**
     * <p>The access area from which you use the Anycast EIP to communicate with the Internet.</p>
     * <br>
     * <p>Set the value to **international**, which specifies the areas outside the Chinese mainland.</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    public static DescribeAnycastServerRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastServerRegionsRequest self = new DescribeAnycastServerRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastServerRegionsRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

}
