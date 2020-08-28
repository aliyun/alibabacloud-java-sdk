// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApDetailedConfigRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    public static GetApDetailedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApDetailedConfigRequest self = new GetApDetailedConfigRequest();
        return TeaModel.build(map, self);
    }

}
