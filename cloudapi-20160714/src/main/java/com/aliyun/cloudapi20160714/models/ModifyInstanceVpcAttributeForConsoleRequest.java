// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeForConsoleRequest extends TeaModel {
    /**
     * <p>Whether delete instance client VPC.</p>
     * <ul>
     * <li>FALSE: set or modify instance client VPC</li>
     * <li>TRUE: delete instance client VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteVpcAccess")
    public Boolean deleteVpcAccess;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-bj-f28baxxxxb51</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The token of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>505959c38776d9324945dbff709582</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vbnnd66xxxx2xb5oig4f</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1121011712128923</p>
     */
    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bj9e2i8w3wz7shkvnuj9a</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    public static ModifyInstanceVpcAttributeForConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeForConsoleRequest self = new ModifyInstanceVpcAttributeForConsoleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeForConsoleRequest setDeleteVpcAccess(Boolean deleteVpcAccess) {
        this.deleteVpcAccess = deleteVpcAccess;
        return this;
    }
    public Boolean getDeleteVpcAccess() {
        return this.deleteVpcAccess;
    }

    public ModifyInstanceVpcAttributeForConsoleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVpcAttributeForConsoleRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ModifyInstanceVpcAttributeForConsoleRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyInstanceVpcAttributeForConsoleRequest setVpcOwnerId(Long vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public ModifyInstanceVpcAttributeForConsoleRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
