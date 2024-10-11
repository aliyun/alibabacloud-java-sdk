// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateSampleFormatConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>result</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static CreateSampleFormatConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleFormatConfigResponseBody self = new CreateSampleFormatConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSampleFormatConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSampleFormatConfigResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
