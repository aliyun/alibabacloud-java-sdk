// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResponseBody extends TeaModel {
    /**
     * <p>The returned application information.</p>
     */
    @NameInMap("Application")
    public String application;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResponseBody self = new DescribeApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResponseBody setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public DescribeApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
