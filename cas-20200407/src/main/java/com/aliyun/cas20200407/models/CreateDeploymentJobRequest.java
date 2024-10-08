// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobRequest extends TeaModel {
    /**
     * <p>The certificate IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12342649,12304338,12067351,9957285</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>The contact IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The type of the task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cloud</li>
     * <li>user</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The name of the deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jobName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6591316,6585549,6190248,5811894,5775176,5772504</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The time when the task was scheduled.</p>
     * 
     * <strong>example:</strong>
     * <p>1706613560008</p>
     */
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
