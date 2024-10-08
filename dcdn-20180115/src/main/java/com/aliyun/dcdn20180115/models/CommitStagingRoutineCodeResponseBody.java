// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CommitStagingRoutineCodeResponseBody extends TeaModel {
    /**
     * <p>The version number of the code.</p>
     * 
     * <strong>example:</strong>
     * <p>1620876959997924701</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CommitStagingRoutineCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitStagingRoutineCodeResponseBody self = new CommitStagingRoutineCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitStagingRoutineCodeResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public CommitStagingRoutineCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
