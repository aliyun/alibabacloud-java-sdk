// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyStageModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6C87A26A-6A18-4B8E-8099-705278381xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStageModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStageModelResponseBody self = new ModifyStageModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStageModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
