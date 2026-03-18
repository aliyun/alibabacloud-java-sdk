// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectIpWhiteListResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateProjectIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectIpWhiteListResponseBody self = new UpdateProjectIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectIpWhiteListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateProjectIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
