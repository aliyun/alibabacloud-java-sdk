// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class ExecuteDeviceRiskShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String dataShrink;

    public static ExecuteDeviceRiskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDeviceRiskShrinkRequest self = new ExecuteDeviceRiskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDeviceRiskShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

}
