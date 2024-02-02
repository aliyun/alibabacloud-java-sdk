// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateSolutionInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSolutionInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionInstanceAttributeResponseBody self = new UpdateSolutionInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
