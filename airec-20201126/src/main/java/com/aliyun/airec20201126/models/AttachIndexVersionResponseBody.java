// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class AttachIndexVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E63A27A4-3411-4910-B7D5-12EEAC19389B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static AttachIndexVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachIndexVersionResponseBody self = new AttachIndexVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachIndexVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachIndexVersionResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
