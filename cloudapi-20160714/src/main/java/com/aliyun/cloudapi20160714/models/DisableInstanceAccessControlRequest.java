// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DisableInstanceAccessControlRequest extends TeaModel {
    /**
     * <p>The ID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-grgqc0mnuhkqciwtam</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The IP version. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-cn-v6419k43xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DisableInstanceAccessControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceAccessControlRequest self = new DisableInstanceAccessControlRequest();
        return TeaModel.build(map, self);
    }

    public DisableInstanceAccessControlRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DisableInstanceAccessControlRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DisableInstanceAccessControlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableInstanceAccessControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
