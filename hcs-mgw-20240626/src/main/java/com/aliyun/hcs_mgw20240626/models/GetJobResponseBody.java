// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <p>The details for obtaining the details of the migration task.</p>
     */
    @NameInMap("ImportJob")
    public GetJobResp importJob;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setImportJob(GetJobResp importJob) {
        this.importJob = importJob;
        return this;
    }
    public GetJobResp getImportJob() {
        return this.importJob;
    }

}
