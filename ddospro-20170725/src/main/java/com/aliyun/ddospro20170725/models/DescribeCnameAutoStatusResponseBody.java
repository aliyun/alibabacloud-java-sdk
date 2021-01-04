// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeCnameAutoStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCnameAutoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameAutoStatusResponseBody self = new DescribeCnameAutoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCnameAutoStatusResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DescribeCnameAutoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
