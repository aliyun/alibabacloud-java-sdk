// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeOfficeSiteInternetStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOfficeSiteInternetStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSiteInternetStatusResponseBody self = new DescribeOfficeSiteInternetStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSiteInternetStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeOfficeSiteInternetStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
