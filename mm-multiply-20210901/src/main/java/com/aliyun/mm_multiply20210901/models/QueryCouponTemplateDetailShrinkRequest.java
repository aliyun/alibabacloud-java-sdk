// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryCouponTemplateDetailShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("QueryCouponTemplateDetailDTO")
    public String queryCouponTemplateDetailDTOShrink;

    public static QueryCouponTemplateDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponTemplateDetailShrinkRequest self = new QueryCouponTemplateDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCouponTemplateDetailShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryCouponTemplateDetailShrinkRequest setQueryCouponTemplateDetailDTOShrink(String queryCouponTemplateDetailDTOShrink) {
        this.queryCouponTemplateDetailDTOShrink = queryCouponTemplateDetailDTOShrink;
        return this;
    }
    public String getQueryCouponTemplateDetailDTOShrink() {
        return this.queryCouponTemplateDetailDTOShrink;
    }

}
