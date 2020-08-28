// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupIdRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    public static GetApgroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupIdRequest self = new GetApgroupIdRequest();
        return TeaModel.build(map, self);
    }

}
