// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgStopSensIdentifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DsgStopSensIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgStopSensIdentifyRequest self = new DsgStopSensIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public DsgStopSensIdentifyRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DsgStopSensIdentifyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
