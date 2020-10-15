// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Application")
    @Validation(required = true)
    public String application;

    public static DescribeApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResponse self = new DescribeApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationResponse setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

}
