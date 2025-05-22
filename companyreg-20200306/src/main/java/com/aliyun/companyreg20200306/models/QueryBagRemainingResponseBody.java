// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryBagRemainingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>6A603AA0-73BA-52B3-AC7D-0F846ECF7A9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryBagRemainingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBagRemainingResponseBody self = new QueryBagRemainingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBagRemainingResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public QueryBagRemainingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
