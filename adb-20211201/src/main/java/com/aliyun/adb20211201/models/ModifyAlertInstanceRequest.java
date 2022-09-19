// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAlertInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("InstanceId")
    public Integer instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceParams")
    public String instanceParams;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAlertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlertInstanceRequest self = new ModifyAlertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAlertInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAlertInstanceRequest setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Integer getInstanceId() {
        return this.instanceId;
    }

    public ModifyAlertInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyAlertInstanceRequest setInstanceParams(String instanceParams) {
        this.instanceParams = instanceParams;
        return this;
    }
    public String getInstanceParams() {
        return this.instanceParams;
    }

    public ModifyAlertInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
