// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class OperateStaticFileRequest extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    public static OperateStaticFileRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateStaticFileRequest self = new OperateStaticFileRequest();
        return TeaModel.build(map, self);
    }

    public OperateStaticFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public OperateStaticFileRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OperateStaticFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
