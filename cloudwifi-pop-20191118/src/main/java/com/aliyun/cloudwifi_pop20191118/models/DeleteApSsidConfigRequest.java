// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("ApMac")
    @Validation(required = true)
    public String apMac;

    @NameInMap("Ssid")
    @Validation(required = true)
    public String ssid;

    @NameInMap("RadioIndex")
    @Validation(required = true)
    public String radioIndex;

    public static DeleteApSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApSsidConfigRequest self = new DeleteApSsidConfigRequest();
        return TeaModel.build(map, self);
    }

}
