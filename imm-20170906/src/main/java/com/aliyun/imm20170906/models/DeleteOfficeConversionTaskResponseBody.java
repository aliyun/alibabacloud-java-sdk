// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeConversionTaskResponseBody self = new DeleteOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
