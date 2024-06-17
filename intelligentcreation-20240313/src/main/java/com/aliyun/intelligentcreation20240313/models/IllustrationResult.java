// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class IllustrationResult extends TeaModel {
    @NameInMap("illustration")
    public Illustration illustration;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static IllustrationResult build(java.util.Map<String, ?> map) throws Exception {
        IllustrationResult self = new IllustrationResult();
        return TeaModel.build(map, self);
    }

    public IllustrationResult setIllustration(Illustration illustration) {
        this.illustration = illustration;
        return this;
    }
    public Illustration getIllustration() {
        return this.illustration;
    }

    public IllustrationResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
