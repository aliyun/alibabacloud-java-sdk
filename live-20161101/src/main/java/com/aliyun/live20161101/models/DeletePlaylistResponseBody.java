// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistResponseBody extends TeaModel {
    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeletePlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistResponseBody self = new DeletePlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public DeletePlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
