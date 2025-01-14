// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AttachPolicy2ApprovalProcessResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C51D9340-4604-5331-AE62-407F3B408F86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachPolicy2ApprovalProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicy2ApprovalProcessResponseBody self = new AttachPolicy2ApprovalProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachPolicy2ApprovalProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
