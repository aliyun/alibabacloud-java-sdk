// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. Separate multiple certificate IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the IDs of certificates from the <strong>CertificateId</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12342649,12304338,12067351,9957285</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>The ID of the contact. Separate multiple contact IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2712221.html">ListContact</a> operation to obtain the IDs of contacts from the <strong>ContactId</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The type of the deployment task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cloud: multi-cloud deployment task.</li>
     * <li>user: cloud service deployment task. This type of task does not support cloud servers.</li>
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
     * <p>The ID of the cloud resource. Separate multiple resource IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2712230.html">ListCloudResources</a> operation to obtain the IDs of cloud resources from the <strong>Id</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6591316,6585549,6190248,5811894,5775176,5772504</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The time when the task starts. The value is a UNIX timestamp. If you do not specify this parameter, the system immediately starts the task after the task is in the pending state.</p>
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
