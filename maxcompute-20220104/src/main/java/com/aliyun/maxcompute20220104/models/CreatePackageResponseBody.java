// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreatePackageResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b4ab16684833172127321e2c25</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageResponseBody self = new CreatePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePackageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreatePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
