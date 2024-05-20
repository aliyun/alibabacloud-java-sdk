// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class Illustration extends TeaModel {
    @NameInMap("illustrationId")
    public Long illustrationId;

    @NameInMap("oss")
    public String oss;

    public static Illustration build(java.util.Map<String, ?> map) throws Exception {
        Illustration self = new Illustration();
        return TeaModel.build(map, self);
    }

    public Illustration setIllustrationId(Long illustrationId) {
        this.illustrationId = illustrationId;
        return this;
    }
    public Long getIllustrationId() {
        return this.illustrationId;
    }

    public Illustration setOss(String oss) {
        this.oss = oss;
        return this;
    }
    public String getOss() {
        return this.oss;
    }

}
