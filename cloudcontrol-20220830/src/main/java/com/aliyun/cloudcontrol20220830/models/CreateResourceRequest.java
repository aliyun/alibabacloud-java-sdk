// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>The request body. The property of the resource, which is specified in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *      &quot;AccountName&quot;: &quot;cctest&quot;,
     *      &quot;AccountPassword&quot;: &quot;Aa1234****&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. If a cloud service supports idempotence, the parameter takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1e810dfe1468721d0664a49b9d9f74f4</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The region ID. This parameter is required if a cloud service is a regionalized.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public CreateResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
