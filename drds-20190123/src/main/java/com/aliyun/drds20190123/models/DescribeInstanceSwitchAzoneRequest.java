// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchAzoneRequest extends TeaModel {
    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeInstanceSwitchAzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchAzoneRequest self = new DescribeInstanceSwitchAzoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchAzoneRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
