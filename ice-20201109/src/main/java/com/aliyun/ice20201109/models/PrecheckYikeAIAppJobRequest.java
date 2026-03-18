// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class PrecheckYikeAIAppJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;LoadImage.1.TargetImage\&quot;:\&quot;794da8a01b8c71f1b973e6e7c7586301\&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    public static PrecheckYikeAIAppJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckYikeAIAppJobRequest self = new PrecheckYikeAIAppJobRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckYikeAIAppJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PrecheckYikeAIAppJobRequest setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

}
