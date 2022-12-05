// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamAuthCheckingResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeLiveStreamAuthCheckingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamAuthCheckingResponseBody self = new DescribeLiveStreamAuthCheckingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamAuthCheckingResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLiveStreamAuthCheckingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamAuthCheckingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
