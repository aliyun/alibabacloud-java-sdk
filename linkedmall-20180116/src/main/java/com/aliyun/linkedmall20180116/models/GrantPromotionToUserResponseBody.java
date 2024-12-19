// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GrantPromotionToUserResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>79C01D47-3C44-57D9-BC99-1B33F7ED14B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantPromotionToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionToUserResponseBody self = new GrantPromotionToUserResponseBody();
        return TeaModel.build(map, self);
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

    public GrantPromotionToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GrantPromotionToUserResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12322333232</p>
         */
        @NameInMap("EffectiveEndTime")
        public Long effectiveEndTime;

        /**
         * <strong>example:</strong>
         * <p>123243444</p>
         */
        @NameInMap("EffectiveStartTime")
        public Long effectiveStartTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("PromotionInstanceId")
        public String promotionInstanceId;

        /**
         * <strong>example:</strong>
         * <p>ef2b8********f824830b7e55a0dc5</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GrantPromotionToUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GrantPromotionToUserResponseBodyModel self = new GrantPromotionToUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GrantPromotionToUserResponseBodyModel setEffectiveEndTime(Long effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public Long getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public GrantPromotionToUserResponseBodyModel setEffectiveStartTime(Long effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public Long getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public GrantPromotionToUserResponseBodyModel setPromotionInstanceId(String promotionInstanceId) {
            this.promotionInstanceId = promotionInstanceId;
            return this;
        }
        public String getPromotionInstanceId() {
            return this.promotionInstanceId;
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
