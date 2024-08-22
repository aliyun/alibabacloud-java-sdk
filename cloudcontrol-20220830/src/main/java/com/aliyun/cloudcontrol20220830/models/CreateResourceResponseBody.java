// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>cctest</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>Instance/r-8vbf5abe31c9c4d4/Account/cctest</p>
     */
    @NameInMap("resourcePath")
    public String resourcePath;

    /**
     * <strong>example:</strong>
     * <p>task-433aead756057fff8189a7ce5****</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponseBody self = new CreateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateResourceResponseBody setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }
    public String getResourcePath() {
        return this.resourcePath;
    }

    public CreateResourceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
