// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastPopLocationsRequest extends TeaModel {
    /**
     * <p>The access area of the Anycast elastic IP address (EIP).</p>
     * <br>
     * <p>Set the value to **international**, which specifies the areas outside the Chinese mainland.</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    public static DescribeAnycastPopLocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastPopLocationsRequest self = new DescribeAnycastPopLocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastPopLocationsRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

}
