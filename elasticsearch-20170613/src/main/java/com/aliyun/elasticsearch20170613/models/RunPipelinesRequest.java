// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RunPipelinesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IDs of the Logstash pipelines to start, represented as a JSON array string.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;PipelineId1&quot;,&quot;PipelineId2&quot;]</p>
     */
    @NameInMap("body")
    public String body;

    public static RunPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPipelinesRequest self = new RunPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public RunPipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunPipelinesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
