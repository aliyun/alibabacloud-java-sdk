// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsRdsInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X instance.</p>
     * <br>
     * <p>> You can call the [DescribeDrdsInstances](~~139284~~) operation to query the information about instances in the specified account, such as the IDs of the instances.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeDrdsRdsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsRdsInstancesRequest self = new DescribeDrdsRdsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsRdsInstancesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
