// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBatchRegistAnonymousTbAccountResultRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BatchId")
    public String batchId;

    public static QueryBatchRegistAnonymousTbAccountResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegistAnonymousTbAccountResultRequest self = new QueryBatchRegistAnonymousTbAccountResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegistAnonymousTbAccountResultRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBatchRegistAnonymousTbAccountResultRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
