// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeletePlaylistItemsResponseBody extends TeaModel {
    /**
     * <p>The ID of the playlist. You can use this ID as a request parameter to query playlist items, edit a playlist, delete a playlist, start a playlist, or stop a playlist.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePlaylistItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaylistItemsResponseBody self = new DeletePlaylistItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlaylistItemsResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public DeletePlaylistItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
