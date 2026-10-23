// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedLogstashRestartTimeRequest extends TeaModel {
    /**
     * <p>The restart parameters, including the restart type, target nodes, blue-green deployment options, and concurrency settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;restartType&quot;:&quot;nodeIp&quot;,&quot;nodes&quot;:[&quot;172.16.xx.xx&quot;],&quot;blueGreenDep&quot;:true}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>Specifies whether to forcibly restart the instance. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
