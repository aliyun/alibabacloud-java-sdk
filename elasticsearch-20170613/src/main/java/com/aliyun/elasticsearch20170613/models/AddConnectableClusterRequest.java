// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddConnectableClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;instanceId&quot;:&quot;es-cn-09k1rgid9000g****&quot; }</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static AddConnectableClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConnectableClusterRequest self = new AddConnectableClusterRequest();
        return TeaModel.build(map, self);
    }

    public AddConnectableClusterRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public AddConnectableClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
