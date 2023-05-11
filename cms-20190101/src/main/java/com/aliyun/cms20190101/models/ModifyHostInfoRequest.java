// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHostInfoRequest extends TeaModel {
    /**
     * <p>The name of the host.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the instance. Only hosts not on Alibaba Cloud are supported.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostInfoRequest self = new ModifyHostInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostInfoRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyHostInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
