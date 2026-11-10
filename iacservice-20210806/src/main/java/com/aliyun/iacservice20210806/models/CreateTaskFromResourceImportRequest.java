// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskFromResourceImportRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. The token must be 1 to 64 characters in length and can contain only letters, digits, and hyphens (-). A UUID is recommended.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The ID of the resource export task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ex-a1b2c3d4e5f60718293a4b5cd</p>
     */
    @NameInMap("exportTaskId")
    public String exportTaskId;

    /**
     * <p>The resource export version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("exportVersion")
    public String exportVersion;

    /**
     * <p>The name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-vpc-hangzhou</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static CreateTaskFromResourceImportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskFromResourceImportRequest self = new CreateTaskFromResourceImportRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskFromResourceImportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTaskFromResourceImportRequest setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public CreateTaskFromResourceImportRequest setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public CreateTaskFromResourceImportRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
