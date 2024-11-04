// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcPeerShrinkRequest extends TeaModel {
    @NameInMap("PeerVpcs")
    public String peerVpcsShrink;

    /**
     * <strong>example:</strong>
     * <p>vpc-2zetuli9ws0qgjd******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteGatewayIntranetLinkedVpcPeerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcPeerShrinkRequest self = new DeleteGatewayIntranetLinkedVpcPeerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcPeerShrinkRequest setPeerVpcsShrink(String peerVpcsShrink) {
        this.peerVpcsShrink = peerVpcsShrink;
        return this;
    }
    public String getPeerVpcsShrink() {
        return this.peerVpcsShrink;
    }

    public DeleteGatewayIntranetLinkedVpcPeerShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
