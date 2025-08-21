// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateActionPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ap-hz036ubmx2qmw93k****</p>
     */
    @NameInMap("ActionPlanId")
    public String actionPlanId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DesiredCapacity")
    public Float desiredCapacity;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    public static UpdateActionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateActionPlanRequest self = new UpdateActionPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateActionPlanRequest setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
        return this;
    }
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    public UpdateActionPlanRequest setDesiredCapacity(Float desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Float getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public UpdateActionPlanRequest setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

}
