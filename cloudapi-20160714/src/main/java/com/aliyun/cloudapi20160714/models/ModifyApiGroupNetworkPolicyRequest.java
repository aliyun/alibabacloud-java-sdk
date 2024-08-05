// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupNetworkPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b0162c75d7d34ff48506f1aff878b05e</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The HTTPS security policy.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS1_1_TLS1_0</p>
     */
    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    /**
     * <p>Specifies whether to disable the public second-level domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InnerDomainEnable")
    public Boolean innerDomainEnable;

    /**
     * <p>Specifies whether to enable the virtual private cloud (VPC) second-level domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InternetEnable")
    public Boolean internetEnable;

    /**
     * <p>Specifies whether to enable IPv6. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InternetIPV6Enable")
    public Boolean internetIPV6Enable;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to enable the VPC domain name. Valid values:</p>
     * <ul>
     * <li>TRUE</li>
     * <li>FALSE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VpcIntranetEnable")
    public Boolean vpcIntranetEnable;

    /**
     * <p>Specifies whether to enable the self-calling domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VpcSlbIntranetEnable")
    public Boolean vpcSlbIntranetEnable;

    public static ModifyApiGroupNetworkPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupNetworkPolicyRequest self = new ModifyApiGroupNetworkPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupNetworkPolicyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiGroupNetworkPolicyRequest setHttpsPolicy(String httpsPolicy) {
        this.httpsPolicy = httpsPolicy;
        return this;
    }
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    public ModifyApiGroupNetworkPolicyRequest setInnerDomainEnable(Boolean innerDomainEnable) {
        this.innerDomainEnable = innerDomainEnable;
        return this;
    }
    public Boolean getInnerDomainEnable() {
        return this.innerDomainEnable;
    }

    public ModifyApiGroupNetworkPolicyRequest setInternetEnable(Boolean internetEnable) {
        this.internetEnable = internetEnable;
        return this;
    }
    public Boolean getInternetEnable() {
        return this.internetEnable;
    }

    public ModifyApiGroupNetworkPolicyRequest setInternetIPV6Enable(Boolean internetIPV6Enable) {
        this.internetIPV6Enable = internetIPV6Enable;
        return this;
    }
    public Boolean getInternetIPV6Enable() {
        return this.internetIPV6Enable;
    }

    public ModifyApiGroupNetworkPolicyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiGroupNetworkPolicyRequest setVpcIntranetEnable(Boolean vpcIntranetEnable) {
        this.vpcIntranetEnable = vpcIntranetEnable;
        return this;
    }
    public Boolean getVpcIntranetEnable() {
        return this.vpcIntranetEnable;
    }

    public ModifyApiGroupNetworkPolicyRequest setVpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
        this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
        return this;
    }
    public Boolean getVpcSlbIntranetEnable() {
        return this.vpcSlbIntranetEnable;
    }

}
