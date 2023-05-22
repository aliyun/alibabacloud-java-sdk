// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCodeRevisionResponseBody extends TeaModel {
    /**
     * <p>The information about the JavaScript code version.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoutineCodeRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCodeRevisionResponseBody self = new DescribeRoutineCodeRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCodeRevisionResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeRoutineCodeRevisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
