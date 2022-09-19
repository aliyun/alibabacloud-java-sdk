// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteAlertInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("InstanceId")
    public Integer instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAlertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertInstanceRequest self = new DeleteAlertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAlertInstanceRequest setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Integer getInstanceId() {
        return this.instanceId;
    }

    public DeleteAlertInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
