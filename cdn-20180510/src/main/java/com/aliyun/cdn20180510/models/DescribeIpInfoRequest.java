// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpInfoRequest extends TeaModel {
    /**
     * <p>The IP address. You can specify only one IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
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
