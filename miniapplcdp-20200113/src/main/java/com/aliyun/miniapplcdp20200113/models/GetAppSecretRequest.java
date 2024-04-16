// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppSecretRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Source")
    public String source;

    public static GetAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretRequest self = new GetAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSecretRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppSecretRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
