// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionDetailsRequest extends TeaModel {
    /**
     * <p>The end of the creation time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-20</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The beginning of the creation time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-20</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>This parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>ABEDSDS124DASA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the order or bill.</p>
     * 
     * <strong>example:</strong>
     * <p>2022120336190912</p>
     */
    @NameInMap("RecordID")
    public String recordID;

    /**
     * <p>The transaction channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("TransactionChannel")
    public String transactionChannel;

    /**
     * <p>The serial number of the transaction channel.</p>
     * 
     * <strong>example:</strong>
     * <p>2022112122001470591458665933</p>
     */
    @NameInMap("TransactionChannelSN")
    public String transactionChannelSN;

    /**
     * <p>The number of the transaction.</p>
     * 
     * <strong>example:</strong>
     * <p>410874027490089</p>
     */
    @NameInMap("TransactionNumber")
    public String transactionNumber;

    /**
     * <p>The type of the transaction.</p>
     * 
     * <strong>example:</strong>
     * <p>CHARGE</p>
     */
    @NameInMap("TransactionType")
    public String transactionType;

    public static QueryAccountTransactionDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionDetailsRequest self = new QueryAccountTransactionDetailsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionDetailsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryAccountTransactionDetailsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryAccountTransactionDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryAccountTransactionDetailsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryAccountTransactionDetailsRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QueryAccountTransactionDetailsRequest setTransactionChannel(String transactionChannel) {
        this.transactionChannel = transactionChannel;
        return this;
    }
    public String getTransactionChannel() {
        return this.transactionChannel;
    }

    public QueryAccountTransactionDetailsRequest setTransactionChannelSN(String transactionChannelSN) {
        this.transactionChannelSN = transactionChannelSN;
        return this;
    }
    public String getTransactionChannelSN() {
        return this.transactionChannelSN;
    }

    public QueryAccountTransactionDetailsRequest setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    public QueryAccountTransactionDetailsRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

}
