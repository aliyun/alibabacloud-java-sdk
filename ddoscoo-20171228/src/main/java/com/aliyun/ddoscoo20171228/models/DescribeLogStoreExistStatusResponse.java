// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ExistStatus")
    @Validation(required = true)
    public Boolean existStatus;

    public static DescribeLogStoreExistStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreExistStatusResponse self = new DescribeLogStoreExistStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreExistStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreExistStatusResponse setExistStatus(Boolean existStatus) {
        this.existStatus = existStatus;
        return this;
    }
    public Boolean getExistStatus() {
        return this.existStatus;
    }

}
