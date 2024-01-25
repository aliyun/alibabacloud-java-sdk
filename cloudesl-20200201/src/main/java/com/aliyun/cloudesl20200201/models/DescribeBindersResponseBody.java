// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeBindersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("EslItemBindInfos")
    public java.util.List<DescribeBindersResponseBodyEslItemBindInfos> eslItemBindInfos;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBindersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindersResponseBody self = new DescribeBindersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBindersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBindersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeBindersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeBindersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeBindersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeBindersResponseBody setEslItemBindInfos(java.util.List<DescribeBindersResponseBodyEslItemBindInfos> eslItemBindInfos) {
        this.eslItemBindInfos = eslItemBindInfos;
        return this;
    }
    public java.util.List<DescribeBindersResponseBodyEslItemBindInfos> getEslItemBindInfos() {
        return this.eslItemBindInfos;
    }

    public DescribeBindersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBindersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBindersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBindersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBindersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBindersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBindersResponseBodyEslItemBindInfos extends TeaModel {
        @NameInMap("ActionPrice")
        public String actionPrice;

        @NameInMap("BePromotion")
        public Boolean bePromotion;

        @NameInMap("BindId")
        public String bindId;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("EslBarCode")
        public String eslBarCode;

        @NameInMap("EslConnectAp")
        public String eslConnectAp;

        @NameInMap("EslModel")
        public String eslModel;

        @NameInMap("EslPic")
        public String eslPic;

        @NameInMap("EslStatus")
        public String eslStatus;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemShortTitle")
        public String itemShortTitle;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("PromotionEnd")
        public String promotionEnd;

        @NameInMap("PromotionStart")
        public String promotionStart;

        @NameInMap("PromotionText")
        public String promotionText;

        /**
         * <p>SkuID。</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateSceneId")
        public String templateSceneId;

        public static DescribeBindersResponseBodyEslItemBindInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeBindersResponseBodyEslItemBindInfos self = new DescribeBindersResponseBodyEslItemBindInfos();
            return TeaModel.build(map, self);
        }

        public DescribeBindersResponseBodyEslItemBindInfos setActionPrice(String actionPrice) {
            this.actionPrice = actionPrice;
            return this;
        }
        public String getActionPrice() {
            return this.actionPrice;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setBePromotion(Boolean bePromotion) {
            this.bePromotion = bePromotion;
            return this;
        }
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setBindId(String bindId) {
            this.bindId = bindId;
            return this;
        }
        public String getBindId() {
            return this.bindId;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setEslConnectAp(String eslConnectAp) {
            this.eslConnectAp = eslConnectAp;
            return this;
        }
        public String getEslConnectAp() {
            return this.eslConnectAp;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setEslModel(String eslModel) {
            this.eslModel = eslModel;
            return this;
        }
        public String getEslModel() {
            return this.eslModel;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setEslPic(String eslPic) {
            this.eslPic = eslPic;
            return this;
        }
        public String getEslPic() {
            return this.eslPic;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setEslStatus(String eslStatus) {
            this.eslStatus = eslStatus;
            return this;
        }
        public String getEslStatus() {
            return this.eslStatus;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setPromotionEnd(String promotionEnd) {
            this.promotionEnd = promotionEnd;
            return this;
        }
        public String getPromotionEnd() {
            return this.promotionEnd;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setPromotionStart(String promotionStart) {
            this.promotionStart = promotionStart;
            return this;
        }
        public String getPromotionStart() {
            return this.promotionStart;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setPromotionText(String promotionText) {
            this.promotionText = promotionText;
            return this;
        }
        public String getPromotionText() {
            return this.promotionText;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeBindersResponseBodyEslItemBindInfos setTemplateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

    }

}
