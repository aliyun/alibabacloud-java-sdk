// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitializeOperationRoleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. The client generates the value. The value must be unique among different requests and can be up to 64 ASCII characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the Elasticsearch service-linked role to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rolename&quot;:&quot;AliyunServiceRoleForElasticsearchCollector&quot;}</p>
     */
    @NameInMap("body")
    public String body;

    public static InitializeOperationRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeOperationRoleRequest self = new InitializeOperationRoleRequest();
        return TeaModel.build(map, self);
    }

    public InitializeOperationRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InitializeOperationRoleRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
