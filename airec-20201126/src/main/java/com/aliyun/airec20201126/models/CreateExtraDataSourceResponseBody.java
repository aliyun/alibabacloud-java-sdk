// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateExtraDataSourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public ExtraDataSource result;

    public static CreateExtraDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExtraDataSourceResponseBody self = new CreateExtraDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExtraDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExtraDataSourceResponseBody setResult(ExtraDataSource result) {
        this.result = result;
        return this;
    }
    public ExtraDataSource getResult() {
        return this.result;
    }

}
