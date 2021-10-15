// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetItemPromotionResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ItemPromotionModel")
    @Validation(required = true)
    public GetItemPromotionResponseItemPromotionModel itemPromotionModel;

    public static GetItemPromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemPromotionResponse self = new GetItemPromotionResponse();
        return TeaModel.build(map, self);
    }

    public GetItemPromotionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetItemPromotionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetItemPromotionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetItemPromotionResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public GetItemPromotionResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public GetItemPromotionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetItemPromotionResponse setItemPromotionModel(GetItemPromotionResponseItemPromotionModel itemPromotionModel) {
        this.itemPromotionModel = itemPromotionModel;
        return this;
    }
    public GetItemPromotionResponseItemPromotionModel getItemPromotionModel() {
        return this.itemPromotionModel;
    }

    public static class GetItemPromotionResponseItemPromotionModel extends TeaModel {
        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("PromotionFlag")
        @Validation(required = true)
        public Boolean promotionFlag;

        @NameInMap("PromotionId")
        @Validation(required = true)
        public String promotionId;

        @NameInMap("PromotionName")
        @Validation(required = true)
        public String promotionName;

        @NameInMap("PromotionDesc")
        @Validation(required = true)
        public String promotionDesc;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("SkuPromotion")
        @Validation(required = true)
        public java.util.Map<String, ?> skuPromotion;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        public static GetItemPromotionResponseItemPromotionModel build(java.util.Map<String, ?> map) throws Exception {
            GetItemPromotionResponseItemPromotionModel self = new GetItemPromotionResponseItemPromotionModel();
            return TeaModel.build(map, self);
        }

        public GetItemPromotionResponseItemPromotionModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public GetItemPromotionResponseItemPromotionModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetItemPromotionResponseItemPromotionModel setPromotionFlag(Boolean promotionFlag) {
            this.promotionFlag = promotionFlag;
            return this;
        }
        public Boolean getPromotionFlag() {
            return this.promotionFlag;
        }

        public GetItemPromotionResponseItemPromotionModel setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public GetItemPromotionResponseItemPromotionModel setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetItemPromotionResponseItemPromotionModel setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetItemPromotionResponseItemPromotionModel setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetItemPromotionResponseItemPromotionModel setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetItemPromotionResponseItemPromotionModel setSkuPromotion(java.util.Map<String, ?> skuPromotion) {
            this.skuPromotion = skuPromotion;
            return this;
        }
        public java.util.Map<String, ?> getSkuPromotion() {
            return this.skuPromotion;
        }

        public GetItemPromotionResponseItemPromotionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

    }

}
