// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class ExecuteDeviceRiskRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static ExecuteDeviceRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDeviceRiskRequest self = new ExecuteDeviceRiskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDeviceRiskRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
