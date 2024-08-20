// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineSpecResponseBody extends TeaModel {
    /**
     * <p>The specification of the CPU time slice. Valid values: 5 ms, 50 ms, and 100 ms.</p>
     * 
     * <strong>example:</strong>
     * <p>5ms, 50ms, 100ms</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE4E1B80-D5F3-47DB-824A-DA98A21854C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoutineSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineSpecResponseBody self = new DescribeRoutineSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineSpecResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeRoutineSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
