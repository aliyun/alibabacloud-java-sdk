// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupNetworkPolicyRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    @NameInMap("InnerDomainEnable")
    public Boolean innerDomainEnable;

    @NameInMap("InternetEnable")
    public Boolean internetEnable;

    @NameInMap("InternetIPV6Enable")
    public Boolean internetIPV6Enable;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VpcIntranetEnable")
    public Boolean vpcIntranetEnable;

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
