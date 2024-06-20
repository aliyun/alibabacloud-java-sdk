// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5BA242B2-AB0C-4D06-94EB-23CEC4F7B95E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Result")
    public String result;

    public static UpdateAntChainMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainMemberResponseBody self = new UpdateAntChainMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAntChainMemberResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
