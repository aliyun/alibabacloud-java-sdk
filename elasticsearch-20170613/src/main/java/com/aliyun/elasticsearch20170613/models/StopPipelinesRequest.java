// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopPipelinesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of IDs of the Logstash pipelines to stop, represented as a JSON array string.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;PipelineId1&quot;,&quot;PipelineId2&quot;]</p>
     */
    @NameInMap("body")
    public String body;

    public static StopPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopPipelinesRequest self = new StopPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public StopPipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopPipelinesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
