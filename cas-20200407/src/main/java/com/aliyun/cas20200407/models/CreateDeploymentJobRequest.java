// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobRequest extends TeaModel {
    @NameInMap("CertIds")
    public String certIds;

    @NameInMap("ContactIds")
    public String contactIds;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceIds")
    public String resourceIds;

    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    public static CreateDeploymentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentJobRequest self = new CreateDeploymentJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentJobRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public CreateDeploymentJobRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public CreateDeploymentJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateDeploymentJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDeploymentJobRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public CreateDeploymentJobRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

}
