// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PublishGrayDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishGrayDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishGrayDomainConfigResponseBody self = new PublishGrayDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishGrayDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
