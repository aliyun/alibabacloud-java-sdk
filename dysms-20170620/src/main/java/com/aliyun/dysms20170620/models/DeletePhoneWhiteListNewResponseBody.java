// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeletePhoneWhiteListNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeletePhoneWhiteListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneWhiteListNewResponseBody self = new DeletePhoneWhiteListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePhoneWhiteListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePhoneWhiteListNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
