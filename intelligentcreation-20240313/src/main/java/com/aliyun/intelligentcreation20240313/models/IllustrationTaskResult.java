// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class IllustrationTaskResult extends TeaModel {
    @NameInMap("illustrationTask")
    public IllustrationTask illustrationTask;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static IllustrationTaskResult build(java.util.Map<String, ?> map) throws Exception {
        IllustrationTaskResult self = new IllustrationTaskResult();
        return TeaModel.build(map, self);
    }

    public IllustrationTaskResult setIllustrationTask(IllustrationTask illustrationTask) {
        this.illustrationTask = illustrationTask;
        return this;
    }
    public IllustrationTask getIllustrationTask() {
        return this.illustrationTask;
    }

    public IllustrationTaskResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
