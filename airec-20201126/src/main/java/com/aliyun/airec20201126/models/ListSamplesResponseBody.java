// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSamplesResponseBody extends TeaModel {
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
    public java.util.List<Sample> result;

    public static ListSamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSamplesResponseBody self = new ListSamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSamplesResponseBody setResult(java.util.List<Sample> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Sample> getResult() {
        return this.result;
    }

}
