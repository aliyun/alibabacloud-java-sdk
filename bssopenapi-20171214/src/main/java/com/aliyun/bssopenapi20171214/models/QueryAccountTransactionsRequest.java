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

}
