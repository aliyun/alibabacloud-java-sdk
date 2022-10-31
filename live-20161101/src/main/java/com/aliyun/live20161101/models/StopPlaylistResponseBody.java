// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopPlaylistResponseBody extends TeaModel {
    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("RequestId")
    public String requestId;

    public static StopPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopPlaylistResponseBody self = new StopPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public StopPlaylistResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public StopPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
