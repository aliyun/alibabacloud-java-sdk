// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cctest</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The path of the resources. The relative resource ID. The resource path contains the complete resource location (parent resource/child resource).</p>
     * 
     * <strong>example:</strong>
     * <p>Instance/r-8vbf5abe31c9c4d4/Account/cctest</p>
     */
    @NameInMap("resourcePath")
    public String resourcePath;

    /**
     * <p>The ID of the asynchronous task. If the operation is asynchronous, this field is returned. In this case, the HTTP status code 202 is returned.</p>
     * 
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
