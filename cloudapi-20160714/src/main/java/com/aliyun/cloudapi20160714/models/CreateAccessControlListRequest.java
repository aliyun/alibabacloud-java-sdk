// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAccessControlListRequest extends TeaModel {
    @NameInMap("AclName")
    public String aclName;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateAccessControlListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListRequest self = new CreateAccessControlListRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListRequest setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public CreateAccessControlListRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateAccessControlListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
