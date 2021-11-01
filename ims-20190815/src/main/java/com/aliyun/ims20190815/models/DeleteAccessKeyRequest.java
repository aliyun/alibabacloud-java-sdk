// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyRequest extends TeaModel {
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static DeleteAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyRequest self = new DeleteAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public DeleteAccessKeyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
