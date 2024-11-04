// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcPeerRequest extends TeaModel {
    @NameInMap("PeerVpcs")
    public java.util.List<DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs> peerVpcs;

    /**
     * <strong>example:</strong>
     * <p>vpc-2zetuli9ws0qgjd******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteGatewayIntranetLinkedVpcPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcPeerRequest self = new DeleteGatewayIntranetLinkedVpcPeerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcPeerRequest setPeerVpcs(java.util.List<DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs> peerVpcs) {
        this.peerVpcs = peerVpcs;
        return this;
    }
    public java.util.List<DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs> getPeerVpcs() {
        return this.peerVpcs;
    }

    public DeleteGatewayIntranetLinkedVpcPeerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs build(java.util.Map<String, ?> map) throws Exception {
            DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs self = new DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs();
            return TeaModel.build(map, self);
        }

        public DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DeleteGatewayIntranetLinkedVpcPeerRequestPeerVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
