// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeEncryptRoutineUidResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEncryptRoutineUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptRoutineUidResponseBody self = new DescribeEncryptRoutineUidResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptRoutineUidResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeEncryptRoutineUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
