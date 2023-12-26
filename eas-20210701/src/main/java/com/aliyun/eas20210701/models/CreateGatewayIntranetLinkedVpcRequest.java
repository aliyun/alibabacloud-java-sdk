// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcRequest extends TeaModel {
    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateGatewayIntranetLinkedVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcRequest self = new CreateGatewayIntranetLinkedVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateGatewayIntranetLinkedVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
