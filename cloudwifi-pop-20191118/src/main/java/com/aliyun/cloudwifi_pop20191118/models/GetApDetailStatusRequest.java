// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApDetailStatusRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("NeedRadioStatus")
    @Validation(required = true)
    public Boolean needRadioStatus;

    @NameInMap("Mac")
    @Validation(required = true)
    public String mac;

    @NameInMap("NeedApgroupInfo")
    @Validation(required = true)
    public Boolean needApgroupInfo;

    public static GetApDetailStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApDetailStatusRequest self = new GetApDetailStatusRequest();
        return TeaModel.build(map, self);
    }

}
