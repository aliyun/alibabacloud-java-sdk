// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The details for updating the task.</p>
     */
    @NameInMap("ImportJob")
    public UpdateJobInfo importJob;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setImportJob(UpdateJobInfo importJob) {
        this.importJob = importJob;
        return this;
    }
    public UpdateJobInfo getImportJob() {
        return this.importJob;
    }

}
