// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApAddressByMacRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Language")
    @Validation(required = true)
    public String language;

    @NameInMap("Mac")
    @Validation(required = true)
    public String mac;

    public static GetApAddressByMacRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApAddressByMacRequest self = new GetApAddressByMacRequest();
        return TeaModel.build(map, self);
    }

}
