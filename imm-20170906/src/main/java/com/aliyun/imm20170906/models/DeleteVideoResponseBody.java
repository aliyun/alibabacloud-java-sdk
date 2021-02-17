// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("SetId")
    public String setId;

    public static DeleteVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoResponseBody self = new DeleteVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteVideoResponseBody setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public DeleteVideoResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
