// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ManageSearchAccountInfoRequest extends TeaModel {
    @NameInMap("body")
    public AccountInfoManageRequest body;

    public static ManageSearchAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageSearchAccountInfoRequest self = new ManageSearchAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public ManageSearchAccountInfoRequest setBody(AccountInfoManageRequest body) {
        this.body = body;
        return this;
    }
    public AccountInfoManageRequest getBody() {
        return this.body;
    }

}
