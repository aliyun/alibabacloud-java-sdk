// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCompanyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28627F67-2F87-55E6-B9C6-CE32FEC91315</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompanyResponseBody self = new DeleteCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
