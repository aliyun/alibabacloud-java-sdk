// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class OpenAckServiceRequest extends TeaModel {
    /**
     * <p>The type of service to activate. Valid values:</p>
     * <ul>
     * <li><code>propayasgo</code>: Container Service for Kubernetes (including ACK managed clusters and ACK dedicated clusters), Container Service Serverless, and registered clusters.</li>
     * <li><code>edgepayasgo</code>: Container Service Edge.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>propayasgo</p>
     */
    @NameInMap("type")
    public String type;

    public static OpenAckServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAckServiceRequest self = new OpenAckServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenAckServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
