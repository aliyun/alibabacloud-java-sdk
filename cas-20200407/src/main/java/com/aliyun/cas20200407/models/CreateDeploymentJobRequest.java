// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobRequest extends TeaModel {
    /**
     * <p>The certificate IDs. Separate multiple IDs with commas (,). The ID is the <strong>CertificateId</strong> returned by <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12342649,12304338,12067351,9957285</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>The contact IDs. Separate multiple IDs with commas (,). The ID is the primary key <strong>Id</strong> returned by <a href="https://help.aliyun.com/document_detail/2712221.html">ListContact</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The type of the task.</p>
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
     * <p>The IDs of the cloud service resources. Separate multiple IDs with commas (,). The ID is the primary key <strong>Id</strong> returned by <a href="https://help.aliyun.com/document_detail/2712230.html">ListCloudResources</a>.</p>
     * <p><a href="https://help.aliyun.com/document_detail/2712230.html">ListCloudResources</a> returns the existing cloud infrastructure resources (such as SLB, ALB, CDN, WAF, and DCDN instances) under your account. Certificate Management Service does not provide operations to create these resources. You must create the resources by using the API operations (such as CreateLoadBalancer) or the console of the corresponding cloud service before you can query them by calling <a href="https://help.aliyun.com/document_detail/2712230.html">ListCloudResources</a> and use them in this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6591316,6585549,6190248,5811894,5775176,5772504</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The time when the task is scheduled to start. The value is a UNIX timestamp. If you do not specify this parameter, the deployment is immediately executed when the task enters the pending execution state.</p>
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
