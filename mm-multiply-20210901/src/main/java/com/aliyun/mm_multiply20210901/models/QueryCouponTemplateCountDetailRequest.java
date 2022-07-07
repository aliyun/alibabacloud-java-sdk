// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryCouponTemplateCountDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateId")
    public Long couponTemplateId;

    @NameInMap("QueryTag")
    public String queryTag;

    public static QueryCouponTemplateCountDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponTemplateCountDetailRequest self = new QueryCouponTemplateCountDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryCouponTemplateCountDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryCouponTemplateCountDetailRequest setCouponTemplateId(Long couponTemplateId) {
        this.couponTemplateId = couponTemplateId;
        return this;
    }
    public Long getCouponTemplateId() {
        return this.couponTemplateId;
    }

    public QueryCouponTemplateCountDetailRequest setQueryTag(String queryTag) {
        this.queryTag = queryTag;
        return this;
    }
    public String getQueryTag() {
        return this.queryTag;
    }

}
