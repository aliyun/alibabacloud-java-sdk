// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistItemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramId")
    public String programId;

    public static DeletePlaylistItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistItemsResponseBody self = new DeletePlaylistItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePlaylistItemsResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

}
