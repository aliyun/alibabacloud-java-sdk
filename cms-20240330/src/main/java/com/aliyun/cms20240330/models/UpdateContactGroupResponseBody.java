// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContactGroupResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request, which is used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactGroupResponseBody self = new UpdateContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
