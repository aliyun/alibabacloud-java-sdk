// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsRdsInstancesRequest extends TeaModel {
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
