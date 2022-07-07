// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class QueryCouponTemplateDetailRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("QueryCouponTemplateDetailDTO")
    public QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO queryCouponTemplateDetailDTO;

    public static QueryCouponTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponTemplateDetailRequest self = new QueryCouponTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryCouponTemplateDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryCouponTemplateDetailRequest setQueryCouponTemplateDetailDTO(QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO queryCouponTemplateDetailDTO) {
        this.queryCouponTemplateDetailDTO = queryCouponTemplateDetailDTO;
        return this;
    }
    public QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO getQueryCouponTemplateDetailDTO() {
        return this.queryCouponTemplateDetailDTO;
    }

    public static class QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO self = new QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO();
            return TeaModel.build(map, self);
        }

        public QueryCouponTemplateDetailRequestQueryCouponTemplateDetailDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
