// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceLevelTasksRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeDrdsInstanceLevelTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceLevelTasksRequest self = new DescribeDrdsInstanceLevelTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceLevelTasksRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
