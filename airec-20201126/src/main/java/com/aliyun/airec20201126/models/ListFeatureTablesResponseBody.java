// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFeatureTablesResponseBody extends TeaModel {
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
    public java.util.List<FeatureTable> result;

    public static ListFeatureTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureTablesResponseBody self = new ListFeatureTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeatureTablesResponseBody setResult(java.util.List<FeatureTable> result) {
        this.result = result;
        return this;
    }
    public java.util.List<FeatureTable> getResult() {
        return this.result;
    }

}
