// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindAIPlanWithDevicesRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("IotIdList")
    @Validation(required = true)
    public java.util.List<String> iotIdList;

    public static UnbindAIPlanWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAIPlanWithDevicesRequest self = new UnbindAIPlanWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAIPlanWithDevicesRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UnbindAIPlanWithDevicesRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

}
