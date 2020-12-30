// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DumpMetaDataSourceForOuterResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static DumpMetaDataSourceForOuterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaDataSourceForOuterResponseBody self = new DumpMetaDataSourceForOuterResponseBody();
        return TeaModel.build(map, self);
    }

    public DumpMetaDataSourceForOuterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DumpMetaDataSourceForOuterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
