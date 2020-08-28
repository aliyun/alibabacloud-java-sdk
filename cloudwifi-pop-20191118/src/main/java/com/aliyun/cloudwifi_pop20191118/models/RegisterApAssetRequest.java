// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RegisterApAssetRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Mac")
    @Validation(required = true)
    public String mac;

    @NameInMap("ApGroupUUId")
    @Validation(required = true)
    public String apGroupUUId;

    @NameInMap("SerialNo")
    @Validation(required = true)
    public String serialNo;

    public static RegisterApAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterApAssetRequest self = new RegisterApAssetRequest();
        return TeaModel.build(map, self);
    }

}
