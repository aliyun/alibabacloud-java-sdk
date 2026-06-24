// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyElastictaskRequest extends TeaModel {
    /**
     * <p>The scaling information.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;elasticExpansionTask&quot;:     {         &quot;triggerType&quot;:&quot;crontab&quot;,         &quot;cronExpression&quot;:&quot;0 0 0 ? * MON&quot;,         &quot;elasticNodeCount&quot;:&quot;2&quot;,         &quot;targetIndices&quot;:[&quot;*&quot;],         &quot;replicaCount&quot;:&quot;2&quot;     } }</p>
     */
    @NameInMap("body")
    public String body;

    public static ModifyElastictaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElastictaskRequest self = new ModifyElastictaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElastictaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
