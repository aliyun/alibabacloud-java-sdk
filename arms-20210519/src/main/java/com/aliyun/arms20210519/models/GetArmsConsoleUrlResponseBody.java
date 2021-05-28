// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetArmsConsoleUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ArmsConsoleUrl")
    public String armsConsoleUrl;

    public static GetArmsConsoleUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArmsConsoleUrlResponseBody self = new GetArmsConsoleUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArmsConsoleUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArmsConsoleUrlResponseBody setArmsConsoleUrl(String armsConsoleUrl) {
        this.armsConsoleUrl = armsConsoleUrl;
        return this;
    }
    public String getArmsConsoleUrl() {
        return this.armsConsoleUrl;
    }

}
