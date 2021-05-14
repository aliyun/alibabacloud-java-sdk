// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceMenuSwitchRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeInstanceMenuSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMenuSwitchRequest self = new DescribeInstanceMenuSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMenuSwitchRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
