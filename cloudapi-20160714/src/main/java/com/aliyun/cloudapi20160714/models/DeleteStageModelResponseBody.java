// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteStageModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CEB6EC62-B6C7-5082-A45A-45A204724xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStageModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStageModelResponseBody self = new DeleteStageModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStageModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
