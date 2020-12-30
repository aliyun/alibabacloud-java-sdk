// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    public static SetInstanceModeOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandRequest self = new SetInstanceModeOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SetInstanceModeOnDemandRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SetInstanceModeOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetInstanceModeOnDemandRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
