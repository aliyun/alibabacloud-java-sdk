// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAlertInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceParams")
    public String instanceParams;

    @NameInMap("PluginId")
    public Integer pluginId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAlertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertInstanceRequest self = new CreateAlertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAlertInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateAlertInstanceRequest setInstanceParams(String instanceParams) {
        this.instanceParams = instanceParams;
        return this;
    }
    public String getInstanceParams() {
        return this.instanceParams;
    }

    public CreateAlertInstanceRequest setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Integer getPluginId() {
        return this.pluginId;
    }

    public CreateAlertInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
