// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpInfoRequest extends TeaModel {
    /**
     * <p>The IP address that you want to query. You can specify only one IP address in each request.</p>
     */
    @NameInMap("IP")
    public String IP;

    public static DescribeIpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpInfoRequest self = new DescribeIpInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpInfoRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

}
