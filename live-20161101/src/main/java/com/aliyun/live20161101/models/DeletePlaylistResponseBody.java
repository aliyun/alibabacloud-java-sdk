// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramId")
    public String programId;

    public static DeletePlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistResponseBody self = new DeletePlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePlaylistResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

}
