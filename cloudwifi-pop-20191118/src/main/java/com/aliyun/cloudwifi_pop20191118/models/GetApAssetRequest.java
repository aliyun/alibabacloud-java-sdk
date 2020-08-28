// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApAssetRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    public static GetApAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApAssetRequest self = new GetApAssetRequest();
        return TeaModel.build(map, self);
    }

}
