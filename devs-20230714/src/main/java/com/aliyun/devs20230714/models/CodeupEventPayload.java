// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CodeupEventPayload extends TeaModel {
    @NameInMap("originalPayload")
    public byte[] originalPayload;

    public static CodeupEventPayload build(java.util.Map<String, ?> map) throws Exception {
        CodeupEventPayload self = new CodeupEventPayload();
        return TeaModel.build(map, self);
    }

    public CodeupEventPayload setOriginalPayload(byte[] originalPayload) {
        this.originalPayload = originalPayload;
        return this;
    }
    public byte[] getOriginalPayload() {
        return this.originalPayload;
    }

}
