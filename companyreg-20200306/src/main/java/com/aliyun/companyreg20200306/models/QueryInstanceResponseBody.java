// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>2174AA97-56FB-50FA-B243-0460B9E4CE0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceResponseBody self = new QueryInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
