// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CheckScmAppConnectivityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static CheckScmAppConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckScmAppConnectivityResponse self = new CheckScmAppConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public CheckScmAppConnectivityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckScmAppConnectivityResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
