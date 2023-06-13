// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeWorkflowRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Status")
    public String status;

    @NameInMap("WorkFlowId")
    public String workFlowId;

    @NameInMap("WorkFlowName")
    public String workFlowName;

    public static DescribeWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowRequest self = new DescribeWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeWorkflowRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public DescribeWorkflowRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeWorkflowRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeWorkflowRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeWorkflowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeWorkflowRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public DescribeWorkflowRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeWorkflowRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeWorkflowRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeWorkflowRequest setWorkFlowId(String workFlowId) {
        this.workFlowId = workFlowId;
        return this;
    }
    public String getWorkFlowId() {
        return this.workFlowId;
    }

    public DescribeWorkflowRequest setWorkFlowName(String workFlowName) {
        this.workFlowName = workFlowName;
        return this;
    }
    public String getWorkFlowName() {
        return this.workFlowName;
    }

}
