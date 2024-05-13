// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpLocationServiceRequest extends TeaModel {
    /**
     * <p>The IP address of the asset to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    public static DescribeIpLocationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpLocationServiceRequest self = new DescribeIpLocationServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpLocationServiceRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

}
