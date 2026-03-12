// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryBatchTaskDetailListRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SaleId")
    public String saleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryBatchTaskDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchTaskDetailListRequest self = new QueryBatchTaskDetailListRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchTaskDetailListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryBatchTaskDetailListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryBatchTaskDetailListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryBatchTaskDetailListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBatchTaskDetailListRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public QueryBatchTaskDetailListRequest setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

    public QueryBatchTaskDetailListRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryBatchTaskDetailListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
