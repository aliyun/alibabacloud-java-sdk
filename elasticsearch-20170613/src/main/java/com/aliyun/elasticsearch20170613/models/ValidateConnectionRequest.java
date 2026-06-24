// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateConnectionRequest extends TeaModel {
    /**
     * <p>A unique token used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the Elasticsearch instance to which you want to validate connectivity.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;endpoints&quot;: [         &quot;<a href="http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200">http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200</a>&quot;     ],     &quot;userName&quot;: &quot;elastic&quot;,     &quot;password&quot;: &quot;xxxx&quot; }</p>
     */
    @NameInMap("body")
    public String body;

    public static ValidateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateConnectionRequest self = new ValidateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ValidateConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValidateConnectionRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
