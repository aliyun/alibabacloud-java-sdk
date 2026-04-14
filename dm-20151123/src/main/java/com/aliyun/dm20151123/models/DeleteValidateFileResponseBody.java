// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteValidateFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>yyyy-yyyy-yyyy-yyyy</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteValidateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteValidateFileResponseBody self = new DeleteValidateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteValidateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
