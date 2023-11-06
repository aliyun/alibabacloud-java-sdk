// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RestartDrdsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of a DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static RestartDrdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDrdsInstanceRequest self = new RestartDrdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDrdsInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
