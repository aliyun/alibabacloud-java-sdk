// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumAdminStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    public static DescribeConsortiumAdminStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumAdminStatusRequest self = new DescribeConsortiumAdminStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumAdminStatusRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
