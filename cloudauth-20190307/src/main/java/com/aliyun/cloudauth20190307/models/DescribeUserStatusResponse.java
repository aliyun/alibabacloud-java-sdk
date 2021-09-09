// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Enabled")
    @Validation(required = true)
    public Boolean enabled;

    public static DescribeUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusResponse self = new DescribeUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserStatusResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
