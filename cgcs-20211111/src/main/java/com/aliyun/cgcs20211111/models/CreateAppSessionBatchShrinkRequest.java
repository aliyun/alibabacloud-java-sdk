// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppInfos")
    public String appInfosShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomTaskId")
    public String customTaskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateAppSessionBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchShrinkRequest self = new CreateAppSessionBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchShrinkRequest setAppInfosShrink(String appInfosShrink) {
        this.appInfosShrink = appInfosShrink;
        return this;
    }
    public String getAppInfosShrink() {
        return this.appInfosShrink;
    }

    public CreateAppSessionBatchShrinkRequest setCustomTaskId(String customTaskId) {
        this.customTaskId = customTaskId;
        return this;
    }
    public String getCustomTaskId() {
        return this.customTaskId;
    }

    public CreateAppSessionBatchShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
