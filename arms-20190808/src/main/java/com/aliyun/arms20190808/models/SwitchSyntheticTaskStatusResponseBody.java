// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SwitchSyntheticTaskStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
