// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryResponseBody extends TeaModel {
    /**
     * <p>The statistical information about the resource quota and usage in different regions.</p>
     */
    @NameInMap("ApplicationResource")
    public String applicationResource;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationResourceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResourceSummaryResponseBody self = new DescribeApplicationResourceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResourceSummaryResponseBody setApplicationResource(String applicationResource) {
        this.applicationResource = applicationResource;
        return this;
    }
    public String getApplicationResource() {
        return this.applicationResource;
    }

    public DescribeApplicationResourceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
