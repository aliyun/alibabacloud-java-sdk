// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedLogstashRestartTimeRequest extends TeaModel {
    @NameInMap("force")
    public Boolean force;

    public static EstimatedLogstashRestartTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimatedLogstashRestartTimeRequest self = new EstimatedLogstashRestartTimeRequest();
        return TeaModel.build(map, self);
    }

    public EstimatedLogstashRestartTimeRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
