// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SwitchSyntheticTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static SwitchSyntheticTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchSyntheticTaskStatusResponseBody self = new SwitchSyntheticTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchSyntheticTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchSyntheticTaskStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
