// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedRestartTimeRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("force")
    public Boolean force;

    public static EstimatedRestartTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimatedRestartTimeRequest self = new EstimatedRestartTimeRequest();
        return TeaModel.build(map, self);
    }

    public EstimatedRestartTimeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public EstimatedRestartTimeRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
