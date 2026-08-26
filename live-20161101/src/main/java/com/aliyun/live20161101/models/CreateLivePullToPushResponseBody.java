// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePullToPushResponseBody extends TeaModel {
    /**
     * <p>Error description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return code.</p>
     * <blockquote>
     * <ul>
     * <li>&quot;0&quot; is returned under normal conditions.</li>
     * <li>For abnormal conditions, refer to the error code list below.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fd245384-4067-4f91-9d75-9666a6bc9****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateLivePullToPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePullToPushResponseBody self = new CreateLivePullToPushResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivePullToPushResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLivePullToPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLivePullToPushResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public CreateLivePullToPushResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
