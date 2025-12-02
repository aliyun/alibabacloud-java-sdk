// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreatStockOssCheckTaskResponseBody extends TeaModel {
    /**
     * <p>Returned data</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatStockOssCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatStockOssCheckTaskResponseBody self = new CreatStockOssCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatStockOssCheckTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreatStockOssCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
