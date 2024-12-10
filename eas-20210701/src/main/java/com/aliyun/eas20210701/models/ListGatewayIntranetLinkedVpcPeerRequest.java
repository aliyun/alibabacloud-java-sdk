// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcPeerRequest extends TeaModel {
    /**
     * <p>The ID of the associated VPC. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/2621223.html">ListGatewayIntranetLinkedVpc</a>.</p>
     * <ul>
     * <li>If you specify a VPC ID, only VPC peers corresponding to the ID are queried.</li>
     * <li>Otherwise, all VPC peers are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zetuli9ws0qgjd******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListGatewayIntranetLinkedVpcPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetLinkedVpcPeerRequest self = new ListGatewayIntranetLinkedVpcPeerRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetLinkedVpcPeerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
