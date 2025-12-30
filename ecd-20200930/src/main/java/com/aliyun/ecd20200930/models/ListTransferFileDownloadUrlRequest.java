// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTransferFileDownloadUrlRequest extends TeaModel {
    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    /**
     * <strong>example:</strong>
     * <p>trt-hffhi4nmqoi4****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListTransferFileDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransferFileDownloadUrlRequest self = new ListTransferFileDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public ListTransferFileDownloadUrlRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public ListTransferFileDownloadUrlRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
