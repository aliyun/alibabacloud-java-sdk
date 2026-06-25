// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcPeerRequest extends TeaModel {
    /**
     * <p>The ID of the attached virtual private cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/2621223.html">ListGatewayIntranetLinkedVpc</a>.</p>
     * <ul>
     * <li><p>Specify a VPC ID to query only the VPC peers for that VPC.</p>
     * </li>
     * <li><p>If you do not specify a VPC ID, all VPC peers are returned.</p>
     * </li>
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
