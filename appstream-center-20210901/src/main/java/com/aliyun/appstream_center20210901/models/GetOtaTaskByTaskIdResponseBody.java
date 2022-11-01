// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetOtaTaskByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("OtaVersion")
    public String otaVersion;

    @NameInMap("ReleaseNote")
    public String releaseNote;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStartTime")
    public String taskStartTime;

    public static GetOtaTaskByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOtaTaskByTaskIdResponseBody self = new GetOtaTaskByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOtaTaskByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOtaTaskByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOtaTaskByTaskIdResponseBody setOtaVersion(String otaVersion) {
        this.otaVersion = otaVersion;
        return this;
    }
    public String getOtaVersion() {
        return this.otaVersion;
    }

    public GetOtaTaskByTaskIdResponseBody setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public GetOtaTaskByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOtaTaskByTaskIdResponseBody setTaskStartTime(String taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }
    public String getTaskStartTime() {
        return this.taskStartTime;
    }

}
