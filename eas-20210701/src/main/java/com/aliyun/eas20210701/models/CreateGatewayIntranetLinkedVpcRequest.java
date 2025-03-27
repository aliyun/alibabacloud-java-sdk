// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcRequest extends TeaModel {
    @NameInMap("EnableAuthoritativeDns")
    public Boolean enableAuthoritativeDns;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vbqn2at0kljjxxxx****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateGatewayIntranetLinkedVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcRequest self = new CreateGatewayIntranetLinkedVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcRequest setEnableAuthoritativeDns(Boolean enableAuthoritativeDns) {
        this.enableAuthoritativeDns = enableAuthoritativeDns;
        return this;
    }
    public Boolean getEnableAuthoritativeDns() {
        return this.enableAuthoritativeDns;
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
