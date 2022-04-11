// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsRequest extends TeaModel {
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordID")
    public String recordID;

    @NameInMap("TransactionChannel")
    public String transactionChannel;

    @NameInMap("TransactionChannelSN")
    public String transactionChannelSN;

    @NameInMap("TransactionFlow")
    public String transactionFlow;

    @NameInMap("TransactionNumber")
    public String transactionNumber;

    @NameInMap("TransactionType")
    public String transactionType;

    public static QueryAccountTransactionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsRequest self = new QueryAccountTransactionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryAccountTransactionsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
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

    public QueryAccountTransactionsRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QueryAccountTransactionsRequest setTransactionChannel(String transactionChannel) {
        this.transactionChannel = transactionChannel;
        return this;
    }
    public String getTransactionChannel() {
        return this.transactionChannel;
    }

    public QueryAccountTransactionsRequest setTransactionChannelSN(String transactionChannelSN) {
        this.transactionChannelSN = transactionChannelSN;
        return this;
    }
    public String getTransactionChannelSN() {
        return this.transactionChannelSN;
    }

    public QueryAccountTransactionsRequest setTransactionFlow(String transactionFlow) {
        this.transactionFlow = transactionFlow;
        return this;
    }
    public String getTransactionFlow() {
        return this.transactionFlow;
    }

    public QueryAccountTransactionsRequest setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    public QueryAccountTransactionsRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

}
