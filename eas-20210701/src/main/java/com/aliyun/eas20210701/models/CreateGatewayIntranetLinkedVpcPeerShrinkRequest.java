// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcPeerShrinkRequest extends TeaModel {
    @NameInMap("PeerVpcs")
    public String peerVpcsShrink;

    /**
     * <strong>example:</strong>
     * <p>vpc-2zetuli9ws0qgjd******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateGatewayIntranetLinkedVpcPeerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcPeerShrinkRequest self = new CreateGatewayIntranetLinkedVpcPeerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcPeerShrinkRequest setPeerVpcsShrink(String peerVpcsShrink) {
        this.peerVpcsShrink = peerVpcsShrink;
        return this;
    }
    public String getPeerVpcsShrink() {
        return this.peerVpcsShrink;
    }

    public CreateGatewayIntranetLinkedVpcPeerShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
