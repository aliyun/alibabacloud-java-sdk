// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteAirEcsInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
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
    public String uninstallClientSourceTypesShrink;

    public static DeleteAirEcsInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAirEcsInstanceShrinkRequest self = new DeleteAirEcsInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAirEcsInstanceShrinkRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public DeleteAirEcsInstanceShrinkRequest setUninstallClientSourceTypesShrink(String uninstallClientSourceTypesShrink) {
        this.uninstallClientSourceTypesShrink = uninstallClientSourceTypesShrink;
        return this;
    }
    public String getUninstallClientSourceTypesShrink() {
        return this.uninstallClientSourceTypesShrink;
    }

}
