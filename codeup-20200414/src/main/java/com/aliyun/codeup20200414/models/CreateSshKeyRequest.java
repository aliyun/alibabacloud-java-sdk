// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateSshKeyRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    public static CreateSshKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSshKeyRequest self = new CreateSshKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSshKeyRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
