// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcPeerRequest extends TeaModel {
    /**
     * <p>The list of VPC peers.</p>
     */
    @NameInMap("PeerVpcs")
    public java.util.List<CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs> peerVpcs;

    /**
     * <p>The VPC ID. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/2621223.html">ListGatewayIntranetLinkedVpc</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zetuli9ws0qgjd******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateGatewayIntranetLinkedVpcPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcPeerRequest self = new CreateGatewayIntranetLinkedVpcPeerRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcPeerRequest setPeerVpcs(java.util.List<CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs> peerVpcs) {
        this.peerVpcs = peerVpcs;
        return this;
    }
    public java.util.List<CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs> getPeerVpcs() {
        return this.peerVpcs;
    }

    public CreateGatewayIntranetLinkedVpcPeerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs extends TeaModel {
        /**
         * <p>The region where the VPC peer resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the VPC peer. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs self = new CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs();
            return TeaModel.build(map, self);
        }

        public CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateGatewayIntranetLinkedVpcPeerRequestPeerVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
