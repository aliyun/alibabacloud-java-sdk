// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAccessKeyRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static CreateAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyRequest self = new CreateAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
