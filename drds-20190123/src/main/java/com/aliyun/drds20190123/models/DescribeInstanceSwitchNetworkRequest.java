// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchNetworkRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeInstanceSwitchNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchNetworkRequest self = new DescribeInstanceSwitchNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchNetworkRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
