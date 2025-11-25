// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetServiceNameListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>91B01BCD-DFB0-5CA8-9191-5B38C62****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceNameList")
    public java.util.List<String> serviceNameList;

    public static DescribeInternetServiceNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetServiceNameListResponseBody self = new DescribeInternetServiceNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetServiceNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInternetServiceNameListResponseBody setServiceNameList(java.util.List<String> serviceNameList) {
        this.serviceNameList = serviceNameList;
        return this;
    }
    public java.util.List<String> getServiceNameList() {
        return this.serviceNameList;
    }

}
