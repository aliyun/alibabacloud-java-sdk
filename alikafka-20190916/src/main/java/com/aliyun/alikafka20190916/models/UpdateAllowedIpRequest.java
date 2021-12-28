// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateAllowedIpRequest extends TeaModel {
    @NameInMap("AllowedListIp")
    public String allowedListIp;

    @NameInMap("AllowedListType")
    public String allowedListType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PortRange")
    public String portRange;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpdateType")
    public String updateType;

    public static UpdateAllowedIpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAllowedIpRequest self = new UpdateAllowedIpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAllowedIpRequest setAllowedListIp(String allowedListIp) {
        this.allowedListIp = allowedListIp;
        return this;
    }
    public String getAllowedListIp() {
        return this.allowedListIp;
    }

    public UpdateAllowedIpRequest setAllowedListType(String allowedListType) {
        this.allowedListType = allowedListType;
        return this;
    }
    public String getAllowedListType() {
        return this.allowedListType;
    }

    public UpdateAllowedIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAllowedIpRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public UpdateAllowedIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAllowedIpRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}
