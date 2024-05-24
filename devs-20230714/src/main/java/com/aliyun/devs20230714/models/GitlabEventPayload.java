// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GitlabEventPayload extends TeaModel {
    @NameInMap("originalPayload")
    public byte[] originalPayload;

    public static GitlabEventPayload build(java.util.Map<String, ?> map) throws Exception {
        GitlabEventPayload self = new GitlabEventPayload();
        return TeaModel.build(map, self);
    }

    public GitlabEventPayload setOriginalPayload(byte[] originalPayload) {
        this.originalPayload = originalPayload;
        return this;
    }
    public byte[] getOriginalPayload() {
        return this.originalPayload;
    }

}
