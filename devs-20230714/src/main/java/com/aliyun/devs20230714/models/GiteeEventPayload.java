// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GiteeEventPayload extends TeaModel {
    @NameInMap("originalPayload")
    public byte[] originalPayload;

    public static GiteeEventPayload build(java.util.Map<String, ?> map) throws Exception {
        GiteeEventPayload self = new GiteeEventPayload();
        return TeaModel.build(map, self);
    }

    public GiteeEventPayload setOriginalPayload(byte[] originalPayload) {
        this.originalPayload = originalPayload;
        return this;
    }
    public byte[] getOriginalPayload() {
        return this.originalPayload;
    }

}
