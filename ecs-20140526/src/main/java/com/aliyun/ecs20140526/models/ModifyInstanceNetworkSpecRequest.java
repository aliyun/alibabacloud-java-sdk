// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("NetworkChargeType")
    public String networkChargeType;

    @NameInMap("AllocatePublicIp")
    public Boolean allocatePublicIp;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyInstanceNetworkSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecRequest self = new ModifyInstanceNetworkSpecRequest();
        return TeaModel.build(map, self);
    }

}
