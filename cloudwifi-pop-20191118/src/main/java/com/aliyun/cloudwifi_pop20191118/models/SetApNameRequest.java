// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SetApNameRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("ApMac")
    @Validation(required = true)
    public String apMac;

    public static SetApNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApNameRequest self = new SetApNameRequest();
        return TeaModel.build(map, self);
    }

}
