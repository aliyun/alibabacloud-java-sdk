// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeletePasskeyRequest extends TeaModel {
    @NameInMap("PasskeyId")
    public String passkeyId;

    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static DeletePasskeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePasskeyRequest self = new DeletePasskeyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePasskeyRequest setPasskeyId(String passkeyId) {
        this.passkeyId = passkeyId;
        return this;
    }
    public String getPasskeyId() {
        return this.passkeyId;
    }

    public DeletePasskeyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
