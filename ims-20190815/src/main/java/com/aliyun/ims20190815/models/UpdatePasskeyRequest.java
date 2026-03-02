// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdatePasskeyRequest extends TeaModel {
    @NameInMap("PasskeyId")
    public String passkeyId;

    @NameInMap("PasskeyName")
    public String passkeyName;

    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UpdatePasskeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePasskeyRequest self = new UpdatePasskeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePasskeyRequest setPasskeyId(String passkeyId) {
        this.passkeyId = passkeyId;
        return this;
    }
    public String getPasskeyId() {
        return this.passkeyId;
    }

    public UpdatePasskeyRequest setPasskeyName(String passkeyName) {
        this.passkeyName = passkeyName;
        return this;
    }
    public String getPasskeyName() {
        return this.passkeyName;
    }

    public UpdatePasskeyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
