// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListExtraDataSourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ExtraDataSource> result;

    public static ListExtraDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExtraDataSourcesResponseBody self = new ListExtraDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExtraDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExtraDataSourcesResponseBody setResult(java.util.List<ExtraDataSource> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExtraDataSource> getResult() {
        return this.result;
    }

}
