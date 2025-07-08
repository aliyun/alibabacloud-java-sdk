// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateProductNewResponseBody extends TeaModel {
    @NameInMap("OpenResult")
    public Boolean openResult;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateProductNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductNewResponseBody self = new CreateProductNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductNewResponseBody setOpenResult(Boolean openResult) {
        this.openResult = openResult;
        return this;
    }
    public Boolean getOpenResult() {
        return this.openResult;
    }

    public CreateProductNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
