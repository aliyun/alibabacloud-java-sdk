// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayResponseBody extends TeaModel {
    /**
     * <p>The region ID of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The private gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully create gateway.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayResponseBody self = new CreateGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
