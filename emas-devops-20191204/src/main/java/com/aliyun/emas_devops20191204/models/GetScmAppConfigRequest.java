// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetScmAppConfigRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    public static GetScmAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScmAppConfigRequest self = new GetScmAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetScmAppConfigRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
