// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewJobOrderRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ClientSystem")
    @Validation(required = true)
    public String clientSystem;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("ClientUniqueId")
    @Validation(required = true)
    public String clientUniqueId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ReferUrl")
    public String referUrl;

    @NameInMap("ChangeType")
    @Validation(required = true)
    public String changeType;

    @NameInMap("Title")
    @Validation(required = true)
    public String title;

    @NameInMap("Params")
    @Validation(required = true)
    public java.util.Map<String, ?> params;

    public static NewJobOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        NewJobOrderRequest self = new NewJobOrderRequest();
        return TeaModel.build(map, self);
    }

}
