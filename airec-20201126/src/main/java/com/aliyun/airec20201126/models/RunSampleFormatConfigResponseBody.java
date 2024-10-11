// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RunSampleFormatConfigResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>airec-test</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the sample formatting configurations are triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static RunSampleFormatConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSampleFormatConfigResponseBody self = new RunSampleFormatConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSampleFormatConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSampleFormatConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
