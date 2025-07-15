// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtcCloudRecordingShrinkRequest extends TeaModel {
    @NameInMap("MixLayoutParams")
    public String mixLayoutParamsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscribeParams")
    public String subscribeParamsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateRtcCloudRecordingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcCloudRecordingShrinkRequest self = new UpdateRtcCloudRecordingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRtcCloudRecordingShrinkRequest setMixLayoutParamsShrink(String mixLayoutParamsShrink) {
        this.mixLayoutParamsShrink = mixLayoutParamsShrink;
        return this;
    }
    public String getMixLayoutParamsShrink() {
        return this.mixLayoutParamsShrink;
    }

    public UpdateRtcCloudRecordingShrinkRequest setSubscribeParamsShrink(String subscribeParamsShrink) {
        this.subscribeParamsShrink = subscribeParamsShrink;
        return this;
    }
    public String getSubscribeParamsShrink() {
        return this.subscribeParamsShrink;
    }

    public UpdateRtcCloudRecordingShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
