// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteScenarioResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>*   `true`: successful</p>
     * <p>*   `false`: failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenarioResponseBody self = new DeleteScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteScenarioResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
