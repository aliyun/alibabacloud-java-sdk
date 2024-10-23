// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DeleteElasticPlanResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticPlanResponseBody self = new DeleteElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
