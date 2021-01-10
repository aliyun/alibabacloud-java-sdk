// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieTicketsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
    public String bizUid;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("ExtJson")
    public String extJson;

    public static QueryMovieTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieTicketsRequest self = new QueryMovieTicketsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMovieTicketsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMovieTicketsRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public QueryMovieTicketsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryMovieTicketsRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
