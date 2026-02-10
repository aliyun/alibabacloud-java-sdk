// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopRtcCloudTranscodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopRtcCloudTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRtcCloudTranscodeRequest self = new StopRtcCloudTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public StopRtcCloudTranscodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopRtcCloudTranscodeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
