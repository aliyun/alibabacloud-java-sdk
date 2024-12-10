// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcPeerShrinkRequest extends TeaModel {
    /**
     * <p>The VPC peer.</p>
     */
    @NameInMap("PeerVpcs")
    public String peerVpcsShrink;

    /**
     * <p>The ID of the associated VPC. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/2621223.html">ListGatewayIntranetLinkedVpc</a>.</p>
     * 
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
