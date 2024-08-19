// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDownloadTaskRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the file download task.</p>
     * 
     * <strong>example:</strong>
     * <p>4376</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDownloadTaskRequest self = new DeleteDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDownloadTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDownloadTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
