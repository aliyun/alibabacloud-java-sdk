// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateDeploymentJobRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. Separate multiple certificate IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the ID of a certificate from the <strong>CertificateId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>9957285,12067351,12304338,12342649</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>The ID of the contact. Separate multiple contact IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2712221.html">ListContact</a> operation to obtain the ID of a contact from the <strong>ContactId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>9957285,12067351,12304338,12342649</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the JobId parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The name of the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the cloud resource. Separate multiple resource IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2712230.html">ListCloudResources</a> operation to obtain the ID of a cloud resource from the <strong>Id</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>9957285,12067351,12304338,12342649</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The time when the task starts. The value is a UNIX timestamp. If you do not specify this parameter, the system immediately starts the task after it is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1606482979000</p>
     */
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
