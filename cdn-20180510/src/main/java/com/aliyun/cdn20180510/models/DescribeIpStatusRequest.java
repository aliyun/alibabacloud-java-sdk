// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpStatusRequest extends TeaModel {
    /**
     * <p>The IP addresses that you want to query. Separate IP addresses with underscores (_), such as Ips=ip1_ip2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip1_ip2</p>
     */
    @NameInMap("Ips")
    public String ips;

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

}
