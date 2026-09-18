// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsBySignatureRequest extends TeaModel {
    /**
     * <p>The end time for the query. This value is a UNIX timestamp representing milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1718590596556</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>The instance ID.</p>
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
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The project names.</p>
     */
    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    /**
     * <p>The SQL job signature.</p>
     * 
     * <strong>example:</strong>
     * <p>m4S/2HipBVngCX94MNIAqmM7Ov4=</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <p>The start time for the query. This value is a UNIX timestamp representing milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1715393576201</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    /**
     * <p>The metering type.</p>
     * <ul>
     * <li><code>ComputationSql</code>: the metering data of SQL jobs that are performed on internal tables.</li>
     * </ul>
     */
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
