// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineUserInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeRoutineUserInfo**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRoutineUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineUserInfoResponseBody self = new DescribeRoutineUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineUserInfoResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeRoutineUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
