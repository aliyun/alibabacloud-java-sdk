// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeployApiResponseBody extends TeaModel {
    /**
     * <p>Publishes an API to a specified environment.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeployApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployApiResponseBody self = new DeployApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
