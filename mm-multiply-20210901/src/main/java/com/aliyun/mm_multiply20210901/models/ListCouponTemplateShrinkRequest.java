// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListCouponTemplateShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryCouponTemplateListDTO")
    public String queryCouponTemplateListDTOShrink;

    public static ListCouponTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCouponTemplateShrinkRequest self = new ListCouponTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCouponTemplateShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListCouponTemplateShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCouponTemplateShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCouponTemplateShrinkRequest setQueryCouponTemplateListDTOShrink(String queryCouponTemplateListDTOShrink) {
        this.queryCouponTemplateListDTOShrink = queryCouponTemplateListDTOShrink;
        return this;
    }
    public String getQueryCouponTemplateListDTOShrink() {
        return this.queryCouponTemplateListDTOShrink;
    }

}
