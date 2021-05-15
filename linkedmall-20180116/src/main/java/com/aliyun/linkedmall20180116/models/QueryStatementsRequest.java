// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryStatementsRequest extends TeaModel {
    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("PayeeIds")
    public String payeeIds;

    @NameInMap("SettleNoes")
    public String settleNoes;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SettleStatus")
    public String settleStatus;

    @NameInMap("SettleType")
    public String settleType;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static QueryStatementsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatementsRequest self = new QueryStatementsRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatementsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatementsRequest setPayeeIds(String payeeIds) {
        this.payeeIds = payeeIds;
        return this;
    }
    public String getPayeeIds() {
        return this.payeeIds;
    }

    public QueryStatementsRequest setSettleNoes(String settleNoes) {
        this.settleNoes = settleNoes;
        return this;
    }
    public String getSettleNoes() {
        return this.settleNoes;
    }

    public QueryStatementsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryStatementsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryStatementsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStatementsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryStatementsRequest setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
        return this;
    }
    public String getSettleStatus() {
        return this.settleStatus;
    }

    public QueryStatementsRequest setSettleType(String settleType) {
        this.settleType = settleType;
        return this;
    }
    public String getSettleType() {
        return this.settleType;
    }

    public QueryStatementsRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
