// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static RemoveDrdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsInstanceRequest self = new RemoveDrdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
