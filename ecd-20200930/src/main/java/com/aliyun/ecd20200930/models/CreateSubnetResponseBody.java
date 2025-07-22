// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSubnetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubnetId")
    public String subnetId;

    public static CreateSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubnetResponseBody self = new CreateSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubnetResponseBody setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
