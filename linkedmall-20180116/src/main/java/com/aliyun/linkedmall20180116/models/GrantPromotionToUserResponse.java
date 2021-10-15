// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    @Validation(required = true)
    public GrantPromotionToUserResponseModel model;

    public static GrantPromotionToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionToUserResponse self = new GrantPromotionToUserResponse();
        return TeaModel.build(map, self);
    }

    public GrantPromotionToUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GrantPromotionToUserResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GrantPromotionToUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantPromotionToUserResponse setModel(GrantPromotionToUserResponseModel model) {
        this.model = model;
        return this;
    }
    public GrantPromotionToUserResponseModel getModel() {
        return this.model;
    }

    public static class GrantPromotionToUserResponseModel extends TeaModel {
        @NameInMap("PromotionInstanceId")
        @Validation(required = true)
        public String promotionInstanceId;

        @NameInMap("EffectiveStartTime")
        @Validation(required = true)
        public Long effectiveStartTime;

        @NameInMap("EffectiveEndTime")
        @Validation(required = true)
        public Long effectiveEndTime;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static GrantPromotionToUserResponseModel build(java.util.Map<String, ?> map) throws Exception {
            GrantPromotionToUserResponseModel self = new GrantPromotionToUserResponseModel();
            return TeaModel.build(map, self);
        }

        public GrantPromotionToUserResponseModel setPromotionInstanceId(String promotionInstanceId) {
            this.promotionInstanceId = promotionInstanceId;
            return this;
        }
        public String getPromotionInstanceId() {
            return this.promotionInstanceId;
        }

        public GrantPromotionToUserResponseModel setEffectiveStartTime(Long effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public GrantPromotionToUserResponseModel setEffectiveEndTime(Long effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public GrantPromotionToUserResponseModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public GrantPromotionToUserResponseModel setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
