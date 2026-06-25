// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>19*****10</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>Specifies whether to enable authoritative DNS parsing. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuthoritativeDns")
    public Boolean enableAuthoritativeDns;

    /**
     * <p>The ID of the virtual switch. For more information, see <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vbqn2at0kljjxxxx****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a>.</p>
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

    public CreateGatewayIntranetLinkedVpcRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
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
