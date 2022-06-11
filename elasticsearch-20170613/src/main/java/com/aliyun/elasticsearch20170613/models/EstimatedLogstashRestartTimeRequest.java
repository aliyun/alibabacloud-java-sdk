// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedLogstashRestartTimeRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("force")
    public Boolean force;

    public static EstimatedLogstashRestartTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimatedLogstashRestartTimeRequest self = new EstimatedLogstashRestartTimeRequest();
        return TeaModel.build(map, self);
    }

    public EstimatedLogstashRestartTimeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public EstimatedLogstashRestartTimeRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
