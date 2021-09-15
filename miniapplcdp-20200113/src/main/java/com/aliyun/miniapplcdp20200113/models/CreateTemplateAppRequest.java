// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateTemplateAppRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AppId")
    public String appId;

    public static CreateTemplateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateAppRequest self = new CreateTemplateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTemplateAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
