// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class PutAppConfigAndSaveRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("ConfigureType")
    @Validation(required = true)
    public String configureType;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("ApMac")
    @Validation(required = true)
    public String apMac;

    @NameInMap("CurrentTime")
    @Validation(required = true)
    public Long currentTime;

    public static PutAppConfigAndSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAppConfigAndSaveRequest self = new PutAppConfigAndSaveRequest();
        return TeaModel.build(map, self);
    }

}
