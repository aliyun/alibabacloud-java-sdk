// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GrantPromotionToUserResponseBodyModel model;

    public static GrantPromotionToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionToUserResponseBody self = new GrantPromotionToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantPromotionToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantPromotionToUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GrantPromotionToUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GrantPromotionToUserResponseBody setModel(GrantPromotionToUserResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GrantPromotionToUserResponseBodyModel getModel() {
        return this.model;
    }

    public static class GrantPromotionToUserResponseBodyModel extends TeaModel {
        @NameInMap("PromotionInstanceId")
        public String promotionInstanceId;

        @NameInMap("EffectiveStartTime")
        public Long effectiveStartTime;

        @NameInMap("EffectiveEndTime")
        public Long effectiveEndTime;

        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("Success")
        public Boolean success;

        public static GrantPromotionToUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GrantPromotionToUserResponseBodyModel self = new GrantPromotionToUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GrantPromotionToUserResponseBodyModel setPromotionInstanceId(String promotionInstanceId) {
            this.promotionInstanceId = promotionInstanceId;
            return this;
        }
        public String getPromotionInstanceId() {
            return this.promotionInstanceId;
        }

        public GrantPromotionToUserResponseBodyModel setEffectiveStartTime(Long effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public GrantPromotionToUserResponseBodyModel setEffectiveEndTime(Long effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public GrantPromotionToUserResponseBodyModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public GrantPromotionToUserResponseBodyModel setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
