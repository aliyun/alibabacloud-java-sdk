// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ConfigAppResponseBody extends TeaModel {
    // The result of turning on or turning off the main switch of the ARMS agent or the main switch status of the ARMS agent.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigAppResponseBody self = new ConfigAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigAppResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ConfigAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
