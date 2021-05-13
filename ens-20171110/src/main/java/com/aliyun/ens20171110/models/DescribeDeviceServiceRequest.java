// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDeviceServiceRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDeviceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceServiceRequest self = new DescribeDeviceServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeDeviceServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
