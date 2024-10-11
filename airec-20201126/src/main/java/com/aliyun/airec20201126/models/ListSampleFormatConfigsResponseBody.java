// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSampleFormatConfigsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EDF43C1F-99E4-431F-A7C0-8B260A5A792E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ListSampleFormatConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSampleFormatConfigsResponseBody self = new ListSampleFormatConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSampleFormatConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSampleFormatConfigsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
