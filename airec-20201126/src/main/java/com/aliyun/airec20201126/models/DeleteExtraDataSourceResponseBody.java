// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteExtraDataSourceResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>返回参数。</p>
     */
    @NameInMap("result")
    public ExtraDataSource result;

    public static DeleteExtraDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtraDataSourceResponseBody self = new DeleteExtraDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExtraDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteExtraDataSourceResponseBody setResult(ExtraDataSource result) {
        this.result = result;
        return this;
    }
    public ExtraDataSource getResult() {
        return this.result;
    }

}
