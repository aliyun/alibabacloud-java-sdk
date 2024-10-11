// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeployRankingSystemRequest extends TeaModel {
    /**
     * <p>The schema of the response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;meta&quot;: {
     *     &quot;autoDeploy&quot;: true,
     *     &quot;autoDeployAuc&quot;: &quot;0.9&quot;,
     *     &quot;conf&quot;:&quot;&quot;,
     *     &quot;predictEngineType&quot;: &quot;EAS&quot;,
     *     &quot;predictEngine&quot;:{
     *         &quot;resourceId&quot;: &quot;eas-oljkkdrggxhx7eizjd&quot;
     *     }
     *   }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static DeployRankingSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployRankingSystemRequest self = new DeployRankingSystemRequest();
        return TeaModel.build(map, self);
    }

    public DeployRankingSystemRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
