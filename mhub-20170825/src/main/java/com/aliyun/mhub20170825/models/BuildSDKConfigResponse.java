// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class BuildSDKConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Content")
    @Validation(required = true)
    public String content;

    public static BuildSDKConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BuildSDKConfigResponse self = new BuildSDKConfigResponse();
        return TeaModel.build(map, self);
    }

    public BuildSDKConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuildSDKConfigResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
