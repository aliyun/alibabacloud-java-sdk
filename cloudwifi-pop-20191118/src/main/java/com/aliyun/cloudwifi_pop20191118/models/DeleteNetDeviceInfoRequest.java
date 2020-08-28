// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ids")
    @Validation(required = true)
    public String ids;

    public static DeleteNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetDeviceInfoRequest self = new DeleteNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

}
