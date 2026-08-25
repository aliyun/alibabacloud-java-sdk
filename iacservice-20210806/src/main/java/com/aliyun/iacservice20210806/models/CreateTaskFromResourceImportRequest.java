// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskFromResourceImportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("exportTaskId")
    public String exportTaskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("exportVersion")
    public String exportVersion;

    /**
     * <p>This parameter is required.</p>
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
