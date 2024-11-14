// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateSolutionInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
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
