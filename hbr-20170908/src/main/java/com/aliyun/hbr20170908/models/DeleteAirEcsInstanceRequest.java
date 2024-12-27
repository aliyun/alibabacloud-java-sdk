// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteAirEcsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6ir9y******hvisj</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The data sources for which the client needs to be uninstalled.</p>
     */
    @NameInMap("UninstallClientSourceTypes")
    public java.util.List<String> uninstallClientSourceTypes;

    public static DeleteAirEcsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAirEcsInstanceRequest self = new DeleteAirEcsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAirEcsInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public DeleteAirEcsInstanceRequest setUninstallClientSourceTypes(java.util.List<String> uninstallClientSourceTypes) {
        this.uninstallClientSourceTypes = uninstallClientSourceTypes;
        return this;
    }
    public java.util.List<String> getUninstallClientSourceTypes() {
        return this.uninstallClientSourceTypes;
    }

}
