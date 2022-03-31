// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpStatusRequest extends TeaModel {
    @NameInMap("Ips")
    public String ips;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeIpStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpStatusRequest self = new DescribeIpStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpStatusRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

    public DescribeIpStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
