// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GithubEventPayload extends TeaModel {
    @NameInMap("originalPayload")
    public byte[] originalPayload;

    public static GithubEventPayload build(java.util.Map<String, ?> map) throws Exception {
        GithubEventPayload self = new GithubEventPayload();
        return TeaModel.build(map, self);
    }

    public GithubEventPayload setOriginalPayload(byte[] originalPayload) {
        this.originalPayload = originalPayload;
        return this;
    }
    public byte[] getOriginalPayload() {
        return this.originalPayload;
    }

}
