// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcRequest extends TeaModel {
    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteGatewayIntranetLinkedVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcRequest self = new DeleteGatewayIntranetLinkedVpcRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DeleteGatewayIntranetLinkedVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
