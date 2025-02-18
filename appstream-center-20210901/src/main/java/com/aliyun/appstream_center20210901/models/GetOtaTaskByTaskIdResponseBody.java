// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetOtaTaskByTaskIdResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OtaTask.Running</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The task is running and cannot be sumitted.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The OTA version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1-R-20220708.110604</p>
     */
    @NameInMap("OtaVersion")
    public String otaVersion;

    /**
     * <p>The version description.</p>
     */
    @NameInMap("ReleaseNote")
    public String releaseNote;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution time of the OTA update task. The time follows the ISO 8601 standard.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-04T14:36:00+08:00</p>
     */
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
