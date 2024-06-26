// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3E5330CF-B4C8-5BEF-AA6B-8E70BD20FAEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordTemplateResponseBody self = new DeleteLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
