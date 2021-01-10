// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddUploadedFunctionFileInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUploadedFunctionFileInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUploadedFunctionFileInfoResponseBody self = new AddUploadedFunctionFileInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUploadedFunctionFileInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
