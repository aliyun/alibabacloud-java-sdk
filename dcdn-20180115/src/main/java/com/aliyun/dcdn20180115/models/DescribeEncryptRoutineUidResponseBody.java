// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeEncryptRoutineUidResponseBody extends TeaModel {
    /**
     * <p>The returned ciphertext, which contains the Alibaba Cloud account ID, timestamp, and time to live (TTL).</p>
     * 
     * <strong>example:</strong>
     * <p>XXXXXj20p4UB/xgdOH5LtXXXXXX</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DBA68F5-04A9-406B-B1E4-F2CB635E103F</p>
     */
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
