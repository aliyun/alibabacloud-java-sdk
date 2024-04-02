// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditItemListRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("CustomResult")
    public String customResult;

    @NameInMap("CustomRiskType")
    public String customRiskType;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RcpResult")
    public String rcpResult;

    @NameInMap("RcpRiskType")
    public String rcpRiskType;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    public static GetAuditItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditItemListRequest self = new GetAuditItemListRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditItemListRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetAuditItemListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetAuditItemListRequest setCustomResult(String customResult) {
        this.customResult = customResult;
        return this;
    }
    public String getCustomResult() {
        return this.customResult;
    }

    public GetAuditItemListRequest setCustomRiskType(String customRiskType) {
        this.customRiskType = customRiskType;
        return this;
    }
    public String getCustomRiskType() {
        return this.customRiskType;
    }

    public GetAuditItemListRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetAuditItemListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetAuditItemListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAuditItemListRequest setRcpResult(String rcpResult) {
        this.rcpResult = rcpResult;
        return this;
    }
    public String getRcpResult() {
        return this.rcpResult;
    }

    public GetAuditItemListRequest setRcpRiskType(String rcpRiskType) {
        this.rcpRiskType = rcpRiskType;
        return this;
    }
    public String getRcpRiskType() {
        return this.rcpRiskType;
    }

    public GetAuditItemListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetAuditItemListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAuditItemListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
