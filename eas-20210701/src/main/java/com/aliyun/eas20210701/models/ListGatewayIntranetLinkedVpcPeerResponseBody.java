// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcPeerResponseBody extends TeaModel {
    /**
     * <p>The ID of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The list of VPC peers.</p>
     */
    @NameInMap("PeerVpcList")
    public java.util.List<ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList> peerVpcList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayIntranetLinkedVpcPeerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetLinkedVpcPeerResponseBody self = new ListGatewayIntranetLinkedVpcPeerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetLinkedVpcPeerResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewayIntranetLinkedVpcPeerResponseBody setPeerVpcList(java.util.List<ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList> peerVpcList) {
        this.peerVpcList = peerVpcList;
        return this;
    }
    public java.util.List<ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList> getPeerVpcList() {
        return this.peerVpcList;
    }

    public ListGatewayIntranetLinkedVpcPeerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs extends TeaModel {
        /**
         * <p>The region where the VPC peer resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the VPC peer.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs self = new ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs();
            return TeaModel.build(map, self);
        }

        public ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList extends TeaModel {
        /**
         * <p>The ID of the VPC peers.</p>
         */
        @NameInMap("PeerVpcs")
        public java.util.List<ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs> peerVpcs;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zetuli9ws0qgjd******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList self = new ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList();
            return TeaModel.build(map, self);
        }

        public ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList setPeerVpcs(java.util.List<ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs> peerVpcs) {
            this.peerVpcs = peerVpcs;
            return this;
        }
        public java.util.List<ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcListPeerVpcs> getPeerVpcs() {
            return this.peerVpcs;
        }

        public ListGatewayIntranetLinkedVpcPeerResponseBodyPeerVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
