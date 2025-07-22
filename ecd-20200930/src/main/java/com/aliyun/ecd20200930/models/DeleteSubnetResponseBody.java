// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteSubnetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubnetId")
    public String subnetId;

    public static DeleteSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubnetResponseBody self = new DeleteSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSubnetResponseBody setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
