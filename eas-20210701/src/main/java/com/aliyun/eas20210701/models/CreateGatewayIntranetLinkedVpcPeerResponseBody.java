// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcPeerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>Successfully add intranet linked vpc Peer for gateway</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateGatewayIntranetLinkedVpcPeerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcPeerResponseBody self = new CreateGatewayIntranetLinkedVpcPeerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcPeerResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayIntranetLinkedVpcPeerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayIntranetLinkedVpcPeerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
