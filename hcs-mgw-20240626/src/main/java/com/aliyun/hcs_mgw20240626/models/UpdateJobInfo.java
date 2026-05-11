// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class UpdateJobInfo extends TeaModel {
    /**
     * <p>The throttling settings of the task.</p>
     */
    @NameInMap("ImportQos")
    public ImportQos importQos;

    /**
     * <p>The task state.\
     * Valid values: IMPORT_JOB_LAUNCHING, IMPORT_JOB_SUSPEND, and IMPORT_JOB_CLOSING.</p>
     * 
     * <strong>example:</strong>
     * <p>IMPORT_JOB_LAUNCHING</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateJobInfo build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobInfo self = new UpdateJobInfo();
        return TeaModel.build(map, self);
    }

    public UpdateJobInfo setImportQos(ImportQos importQos) {
        this.importQos = importQos;
        return this;
    }
    public ImportQos getImportQos() {
        return this.importQos;
    }

    public UpdateJobInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
