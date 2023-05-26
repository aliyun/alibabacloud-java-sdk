// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ApplyScenarioResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ApplyScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyScenarioResponseBody self = new ApplyScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyScenarioResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
