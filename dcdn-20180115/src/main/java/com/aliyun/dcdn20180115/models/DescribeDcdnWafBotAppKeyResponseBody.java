// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafBotAppKeyResponseBody extends TeaModel {
    /**
     * <p>The SDK authentication key for the Alibaba Cloud account.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafBotAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafBotAppKeyResponseBody self = new DescribeDcdnWafBotAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafBotAppKeyResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeDcdnWafBotAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
