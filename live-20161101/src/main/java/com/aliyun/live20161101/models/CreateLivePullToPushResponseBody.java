// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePullToPushResponseBody extends TeaModel {
    /**
     * <p>The description of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code that is returned for the request.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>0 is returned if the request is normal.</p>
     * </li>
     * <li><p>For information about codes that are returned when exceptions occur, see the following Error codes table.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>The task ID.</p>
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
