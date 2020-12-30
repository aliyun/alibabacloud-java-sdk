// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExistStatus")
    public Boolean existStatus;

    public static DescribeLogStoreExistStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreExistStatusResponseBody self = new DescribeLogStoreExistStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreExistStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreExistStatusResponseBody setExistStatus(Boolean existStatus) {
        this.existStatus = existStatus;
        return this;
    }
    public Boolean getExistStatus() {
        return this.existStatus;
    }

}
