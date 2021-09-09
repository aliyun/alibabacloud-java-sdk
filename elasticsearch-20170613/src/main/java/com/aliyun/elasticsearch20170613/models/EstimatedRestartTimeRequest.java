// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedRestartTimeRequest extends TeaModel {
    @NameInMap("force")
    public Boolean force;

    public static EstimatedRestartTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimatedRestartTimeRequest self = new EstimatedRestartTimeRequest();
        return TeaModel.build(map, self);
    }

    public EstimatedRestartTimeRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
