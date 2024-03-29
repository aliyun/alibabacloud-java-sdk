// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetItemPromotionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ItemPromotionModel")
    public GetItemPromotionResponseBodyItemPromotionModel itemPromotionModel;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetItemPromotionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetItemPromotionResponseBody self = new GetItemPromotionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetItemPromotionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetItemPromotionResponseBody setItemPromotionModel(GetItemPromotionResponseBodyItemPromotionModel itemPromotionModel) {
        this.itemPromotionModel = itemPromotionModel;
        return this;
    }
    public GetItemPromotionResponseBodyItemPromotionModel getItemPromotionModel() {
        return this.itemPromotionModel;
    }

    public GetItemPromotionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetItemPromotionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetItemPromotionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public GetItemPromotionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public GetItemPromotionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetItemPromotionResponseBodyItemPromotionModel extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("PromotionDesc")
        public String promotionDesc;

        @NameInMap("PromotionFlag")
        public Boolean promotionFlag;

        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("SkuPromotion")
        public java.util.Map<String, ?> skuPromotion;

        @NameInMap("StartTime")
        public String startTime;

        public static GetItemPromotionResponseBodyItemPromotionModel build(java.util.Map<String, ?> map) throws Exception {
            GetItemPromotionResponseBodyItemPromotionModel self = new GetItemPromotionResponseBodyItemPromotionModel();
            return TeaModel.build(map, self);
        }

        public GetItemPromotionResponseBodyItemPromotionModel setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setPromotionFlag(Boolean promotionFlag) {
            this.promotionFlag = promotionFlag;
            return this;
        }
        public Boolean getPromotionFlag() {
            return this.promotionFlag;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setSkuPromotion(java.util.Map<String, ?> skuPromotion) {
            this.skuPromotion = skuPromotion;
            return this;
        }
        public java.util.Map<String, ?> getSkuPromotion() {
            return this.skuPromotion;
        }

        public GetItemPromotionResponseBodyItemPromotionModel setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
