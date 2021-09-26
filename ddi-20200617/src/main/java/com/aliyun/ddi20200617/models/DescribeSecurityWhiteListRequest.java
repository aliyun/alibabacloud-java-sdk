// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeSecurityWhiteListRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeSecurityWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityWhiteListRequest self = new DescribeSecurityWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityWhiteListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
