// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcPeerResponseBody extends TeaModel {
    /**
     * <p>The ID of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully delete intranet linked vpc Peer for gateway</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteGatewayIntranetLinkedVpcPeerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcPeerResponseBody self = new DeleteGatewayIntranetLinkedVpcPeerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcPeerResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayIntranetLinkedVpcPeerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayIntranetLinkedVpcPeerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
