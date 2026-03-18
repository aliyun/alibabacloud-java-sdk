// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsByInstanceRequest extends TeaModel {
    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("jobOwner")
    public String jobOwner;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projectNames")
    public java.util.List<String> projectNames;

    @NameInMap("region")
    public String region;

    @NameInMap("signature")
    public String signature;

    @NameInMap("specCodes")
    public java.util.List<String> specCodes;

    @NameInMap("startDate")
    public Long startDate;

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

    public ListComputeMetricsByInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
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
