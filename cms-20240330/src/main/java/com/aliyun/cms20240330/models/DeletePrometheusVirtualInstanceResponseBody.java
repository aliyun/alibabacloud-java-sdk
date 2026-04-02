// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeletePrometheusVirtualInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeletePrometheusVirtualInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusVirtualInstanceResponseBody self = new DeletePrometheusVirtualInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusVirtualInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
