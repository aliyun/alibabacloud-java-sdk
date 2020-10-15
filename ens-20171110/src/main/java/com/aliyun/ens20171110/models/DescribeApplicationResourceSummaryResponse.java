// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ApplicationResource")
    @Validation(required = true)
    public String applicationResource;

    public static DescribeApplicationResourceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResourceSummaryResponse self = new DescribeApplicationResourceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResourceSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationResourceSummaryResponse setApplicationResource(String applicationResource) {
        this.applicationResource = applicationResource;
        return this;
    }
    public String getApplicationResource() {
        return this.applicationResource;
    }

}
