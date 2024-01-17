// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeployApiForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeployApiForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployApiForInnerResponseBody self = new DeployApiForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployApiForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
