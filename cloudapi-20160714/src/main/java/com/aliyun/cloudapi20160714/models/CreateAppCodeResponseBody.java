// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppCodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>418DAAE7-A0C2-5E9C-ADFF-4CD14A474F88</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppCodeResponseBody self = new CreateAppCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
