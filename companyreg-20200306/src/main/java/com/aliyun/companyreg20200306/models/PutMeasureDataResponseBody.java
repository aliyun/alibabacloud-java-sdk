// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class PutMeasureDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>6A603AA0-73BA-52B3-AC7D-0F846ECF7A9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutMeasureDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureDataResponseBody self = new PutMeasureDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMeasureDataResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public PutMeasureDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
