// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCouponTemplateStatusRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateStatusDTO")
    public UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO couponTemplateStatusDTO;

    public static UpdateCouponTemplateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCouponTemplateStatusRequest self = new UpdateCouponTemplateStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCouponTemplateStatusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateCouponTemplateStatusRequest setCouponTemplateStatusDTO(UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO couponTemplateStatusDTO) {
        this.couponTemplateStatusDTO = couponTemplateStatusDTO;
        return this;
    }
    public UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO getCouponTemplateStatusDTO() {
        return this.couponTemplateStatusDTO;
    }

    public static class UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Status")
        public Integer status;

        public static UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO self = new UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO();
            return TeaModel.build(map, self);
        }

        public UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCouponTemplateStatusRequestCouponTemplateStatusDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
