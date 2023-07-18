// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveCdnDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveCdnDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveCdnDomainConfigResponseBody self = new SaveCdnDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveCdnDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
