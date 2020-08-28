// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RebootApRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    public static RebootApRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootApRequest self = new RebootApRequest();
        return TeaModel.build(map, self);
    }

}
