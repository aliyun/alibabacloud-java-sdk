// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartBoardRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordId")
    public String recordId;

    public static StartBoardRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBoardRecordResponseBody self = new StartBoardRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBoardRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartBoardRecordResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
