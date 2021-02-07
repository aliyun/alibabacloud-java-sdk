// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRequest self = new GetApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetApplicationRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
