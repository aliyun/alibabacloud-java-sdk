// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryStatementsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>2021-09-01 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("PayeeIds")
    public String payeeIds;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SettleNoes")
    public String settleNoes;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SettleStatus")
    public String settleStatus;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SettleType")
    public String settleType;

    /**
     * <strong>example:</strong>
     * <p>2021-08-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18******263</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryStatementsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatementsRequest self = new QueryStatementsRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatementsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryStatementsRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryStatementsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryStatementsRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryStatementsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryStatementsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public QueryStatementsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryStatementsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
