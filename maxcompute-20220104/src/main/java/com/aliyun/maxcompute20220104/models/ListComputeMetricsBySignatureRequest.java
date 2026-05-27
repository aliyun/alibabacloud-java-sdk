// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsBySignatureRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <strong>example:</strong>
     * <p>20240730****ddlr</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>ALIYUN$7632***@aliyun.com</p>
     */
    @NameInMap("jobOwner")
    public String jobOwner;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <strong>example:</strong>
     * <p>ghijkl789012</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    @NameInMap("types")
    public java.util.List<String> types;

    public static ListComputeMetricsBySignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsBySignatureRequest self = new ListComputeMetricsBySignatureRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsBySignatureRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListComputeMetricsBySignatureRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListComputeMetricsBySignatureRequest setJobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
        return this;
    }
    public String getJobOwner() {
        return this.jobOwner;
    }

    public ListComputeMetricsBySignatureRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListComputeMetricsBySignatureRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListComputeMetricsBySignatureRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public ListComputeMetricsBySignatureRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ListComputeMetricsBySignatureRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public ListComputeMetricsBySignatureRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
