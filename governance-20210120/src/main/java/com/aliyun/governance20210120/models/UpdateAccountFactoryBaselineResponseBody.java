// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class UpdateAccountFactoryBaselineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C18A891D-7B04-51A1-AAC6-201727A361CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAccountFactoryBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountFactoryBaselineResponseBody self = new UpdateAccountFactoryBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAccountFactoryBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
