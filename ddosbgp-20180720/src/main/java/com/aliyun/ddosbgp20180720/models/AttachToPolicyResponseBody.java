// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachToPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC245DEE-9800-5579-BF99-189D6A5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachToPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachToPolicyResponseBody self = new AttachToPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachToPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
