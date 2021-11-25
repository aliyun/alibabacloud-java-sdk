// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Percent")
    public Integer percent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TgtLoc")
    public String tgtLoc;

    public static CreateOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskResponseBody self = new CreateOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateOfficeConversionTaskResponseBody setPercent(Integer percent) {
        this.percent = percent;
        return this;
    }
    public Integer getPercent() {
        return this.percent;
    }

    public CreateOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOfficeConversionTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateOfficeConversionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateOfficeConversionTaskResponseBody setTgtLoc(String tgtLoc) {
        this.tgtLoc = tgtLoc;
        return this;
    }
    public String getTgtLoc() {
        return this.tgtLoc;
    }

}
