// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class AttachGatewayDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the private gateway. To obtain the private gateway ID, see the GatewayId parameter in the response parameters of the <a href="https://apiworkbench.aliyun-inc.com/document/eas/2021-07-01/ListGateway?spm=openapi-amp.newDocPublishment.0.0.765e281fL2IcjJ%5C&ampEnv=online">ListGateway</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully update custom endpoint for gateway gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachGatewayDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachGatewayDomainResponseBody self = new AttachGatewayDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachGatewayDomainResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public AttachGatewayDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AttachGatewayDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
