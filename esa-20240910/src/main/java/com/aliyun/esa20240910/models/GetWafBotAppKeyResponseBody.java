// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafBotAppKeyResponseBody extends TeaModel {
    /**
     * <p>Application key.</p>
     * 
     * <strong>example:</strong>
     * <p>example_appkey</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWafBotAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWafBotAppKeyResponseBody self = new GetWafBotAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWafBotAppKeyResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetWafBotAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
