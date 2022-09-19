// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppLogRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LogLength")
    public Long logLength;

    public static GetSparkAppLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppLogRequest self = new GetSparkAppLogRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppLogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkAppLogRequest setLogLength(Long logLength) {
        this.logLength = logLength;
        return this;
    }
    public Long getLogLength() {
        return this.logLength;
    }

}
