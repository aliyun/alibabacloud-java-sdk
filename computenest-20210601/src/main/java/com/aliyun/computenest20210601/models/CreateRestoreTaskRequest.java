// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskRequest extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-385d35fb088f453c8fa1</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the service instance.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances</a> to obtain the ID of the service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-49793f3bfa034ec6a990</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static CreateRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreTaskRequest self = new CreateRestoreTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestoreTaskRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateRestoreTaskRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
