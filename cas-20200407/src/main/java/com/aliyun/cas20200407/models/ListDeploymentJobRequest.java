// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * <blockquote>
     * <p>You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23982365</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-ivauto-hqito6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The paging Settings for the number of certificates to return on each page during a paged query. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The deployment task status.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDeploymentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobRequest self = new ListDeploymentJobRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public ListDeploymentJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeploymentJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDeploymentJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListDeploymentJobRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListDeploymentJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
