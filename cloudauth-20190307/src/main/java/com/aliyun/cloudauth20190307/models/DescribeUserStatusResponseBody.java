// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusResponseBody self = new DescribeUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
