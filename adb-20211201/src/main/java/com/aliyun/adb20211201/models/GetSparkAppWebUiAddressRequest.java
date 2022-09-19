// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppWebUiAddressRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetSparkAppWebUiAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppWebUiAddressRequest self = new GetSparkAppWebUiAddressRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppWebUiAddressRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
