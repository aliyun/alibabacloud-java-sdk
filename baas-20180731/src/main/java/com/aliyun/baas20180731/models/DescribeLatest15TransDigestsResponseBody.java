// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatest15TransDigestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static DescribeLatest15TransDigestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatest15TransDigestsResponseBody self = new DescribeLatest15TransDigestsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatest15TransDigestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLatest15TransDigestsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
