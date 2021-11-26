// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRDSVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSVpcResponseBody self = new DescribeRDSVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRDSVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRDSVpcResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
