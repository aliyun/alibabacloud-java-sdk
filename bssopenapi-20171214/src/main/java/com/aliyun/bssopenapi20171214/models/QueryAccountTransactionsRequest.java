// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsRequest extends TeaModel {
    @NameInMap("TransactionNumber")
    public String transactionNumber;

    @NameInMap("RecordID")
    public String recordID;

    @NameInMap("TransactionChannelSN")
    public String transactionChannelSN;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryAccountTransactionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsRequest self = new QueryAccountTransactionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionsRequest setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    public QueryAccountTransactionsRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QueryAccountTransactionsRequest setTransactionChannelSN(String transactionChannelSN) {
        this.transactionChannelSN = transactionChannelSN;
        return this;
    }
    public String getTransactionChannelSN() {
        return this.transactionChannelSN;
    }

    public QueryAccountTransactionsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryAccountTransactionsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryAccountTransactionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAccountTransactionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
