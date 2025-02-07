// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPasskeysRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static ListPasskeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPasskeysRequest self = new ListPasskeysRequest();
        return TeaModel.build(map, self);
    }

    public ListPasskeysRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
