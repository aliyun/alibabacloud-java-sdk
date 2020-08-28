// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RepairApRadioRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("ApMac")
    @Validation(required = true)
    public String apMac;

    @NameInMap("RadioIndex")
    @Validation(required = true)
    public String radioIndex;

    public static RepairApRadioRequest build(java.util.Map<String, ?> map) throws Exception {
        RepairApRadioRequest self = new RepairApRadioRequest();
        return TeaModel.build(map, self);
    }

}
