// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class EnableDelegateAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>768F908D-A66A-5A5D-816C-20C93CBBFEE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDelegateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDelegateAccountResponseBody self = new EnableDelegateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDelegateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
