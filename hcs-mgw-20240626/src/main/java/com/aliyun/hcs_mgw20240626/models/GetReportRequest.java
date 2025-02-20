// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetReportRequest extends TeaModel {
    /**
     * <p>The execution ID of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runtimeId")
    public Integer runtimeId;

    /**
     * <p>The ID of the migration task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_job_id</p>
     */
    @NameInMap("version")
    public String version;

    public static GetReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportRequest self = new GetReportRequest();
        return TeaModel.build(map, self);
    }

    public GetReportRequest setRuntimeId(Integer runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public Integer getRuntimeId() {
        return this.runtimeId;
    }

    public GetReportRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
