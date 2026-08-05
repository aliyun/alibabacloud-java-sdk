// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class StopOnlineTestResponseBody extends TeaModel {
    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The ID of the detection task.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The detection status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The detection URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.com/data/data.png">https://xxxxxxxx.com/data/data.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static StopOnlineTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopOnlineTestResponseBody self = new StopOnlineTestResponseBody();
        return TeaModel.build(map, self);
    }

    public StopOnlineTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopOnlineTestResponseBody setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public StopOnlineTestResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StopOnlineTestResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public StopOnlineTestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
