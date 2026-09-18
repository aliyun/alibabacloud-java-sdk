// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsByInstanceRequest extends TeaModel {
    /**
     * <p>The end date. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20240730****ddlr</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The job owner.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN$7632***@aliyun.com</p>
     */
    @NameInMap("jobOwner")
    public String jobOwner;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The project name.</p>
     */
    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <p>The SQL job signature.</p>
     * 
     * <strong>example:</strong>
     * <p>ghijkl789012</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <p>The specification types.</p>
     */
    @NameInMap("specCodes")
    public java.util.List<String> specCodes;

    /**
     * <p>The start date. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>The metering types.</p>
     */
    @NameInMap("types")
    public java.util.List<String> types;

    public static ListComputeMetricsByInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsByInstanceRequest self = new ListComputeMetricsByInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsByInstanceRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListComputeMetricsByInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListComputeMetricsByInstanceRequest setJobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
        return this;
    }
    public String getJobOwner() {
        return this.jobOwner;
    }

    public ListComputeMetricsByInstanceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListComputeMetricsByInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListComputeMetricsByInstanceRequest setProjectNames(java.util.List<String> projectNames) {
        this.projectNames = projectNames;
        return this;
    }
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    public ListComputeMetricsByInstanceRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ListComputeMetricsByInstanceRequest setSpecCodes(java.util.List<String> specCodes) {
        this.specCodes = specCodes;
        return this;
    }
    public java.util.List<String> getSpecCodes() {
        return this.specCodes;
    }

    public ListComputeMetricsByInstanceRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public ListComputeMetricsByInstanceRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
