// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobRequest extends TeaModel {
    @NameInMap("CertIds")
    public String certIds;

    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceIds")
    public String resourceIds;

    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    public static UpdateDeploymentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentJobRequest self = new UpdateDeploymentJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentJobRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public UpdateDeploymentJobRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public UpdateDeploymentJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public UpdateDeploymentJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDeploymentJobRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public UpdateDeploymentJobRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

}
