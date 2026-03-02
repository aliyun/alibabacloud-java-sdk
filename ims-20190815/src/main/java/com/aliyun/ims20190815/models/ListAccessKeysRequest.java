// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAccessKeysRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static ListAccessKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysRequest self = new ListAccessKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
