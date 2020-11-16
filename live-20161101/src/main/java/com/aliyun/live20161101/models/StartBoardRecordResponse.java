// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartBoardRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static StartBoardRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBoardRecordResponse self = new StartBoardRecordResponse();
        return TeaModel.build(map, self);
    }

    public StartBoardRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartBoardRecordResponse setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
