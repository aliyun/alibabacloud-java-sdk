// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedRestartTimeRequest extends TeaModel {
    /**
     * <p>The restart parameters, such as the restart method, target nodes, and blue-green deployment, represented as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;restartType&quot;:&quot;nodeIp&quot;,&quot;nodes&quot;:[&quot;172.16.xx.xx&quot;],&quot;blueGreenDep&quot;:true}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>Specifies whether to force a restart. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
