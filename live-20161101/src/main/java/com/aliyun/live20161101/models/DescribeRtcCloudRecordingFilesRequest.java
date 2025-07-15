// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcCloudRecordingFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeRtcCloudRecordingFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcCloudRecordingFilesRequest self = new DescribeRtcCloudRecordingFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcCloudRecordingFilesRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
