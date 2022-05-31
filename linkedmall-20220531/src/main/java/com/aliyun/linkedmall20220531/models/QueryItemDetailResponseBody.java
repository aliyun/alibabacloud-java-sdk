// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryItemDetailResponseBody extends TeaModel {
    // 渠道公共数据
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    // 返回的执行结果码， 正确为字符串 0000
    @NameInMap("Code")
    public String code;

    // 每次请求操作对应的操作日志号，由系统自动生成，返回给租户，可用于排查问题，双方日志中统一透出此标识
    @NameInMap("LogsId")
    public String logsId;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求结果数据
    @NameInMap("Model")
    public QueryItemDetailResponseBodyModel model;

    // 当前页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // POP请求流水号，建议租户日志中也输出此流水号，双方排查问题方便
    @NameInMap("RequestId")
    public String requestId;

    // 错误子代码。一般用于显示业务类的错误代码，一般建议关注此类错误
    @NameInMap("SubCode")
    public String subCode;

    // 业务处理相关的错误信息，一般建议关注此类错误
    @NameInMap("SubMessage")
    public String subMessage;

    // 本次执行的结果成功与否
    @NameInMap("Success")
    public Boolean success;

    // 总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailResponseBody self = new QueryItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemDetailResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemDetailResponseBody setModel(QueryItemDetailResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryItemDetailResponseBodyModel getModel() {
        return this.model;
    }

    public QueryItemDetailResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryItemDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemDetailResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryItemDetailResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryItemDetailResponseBodyModelSkus extends TeaModel {
        @NameInMap("CanSell")
        public String canSell;

        @NameInMap("PriceCent")
        public String priceCent;

        @NameInMap("ReservePrice")
        public String reservePrice;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("SkuPicUrl")
        public String skuPicUrl;

        @NameInMap("SkuPropertities")
        public String skuPropertities;

        @NameInMap("SkuTitle")
        public String skuTitle;

        public static QueryItemDetailResponseBodyModelSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyModelSkus self = new QueryItemDetailResponseBodyModelSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyModelSkus setCanSell(String canSell) {
            this.canSell = canSell;
            return this;
        }
        public String getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailResponseBodyModelSkus setPriceCent(String priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public String getPriceCent() {
            return this.priceCent;
        }

        public QueryItemDetailResponseBodyModelSkus setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailResponseBodyModelSkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryItemDetailResponseBodyModelSkus setSkuPicUrl(String skuPicUrl) {
            this.skuPicUrl = skuPicUrl;
            return this;
        }
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        public QueryItemDetailResponseBodyModelSkus setSkuPropertities(String skuPropertities) {
            this.skuPropertities = skuPropertities;
            return this;
        }
        public String getSkuPropertities() {
            return this.skuPropertities;
        }

        public QueryItemDetailResponseBodyModelSkus setSkuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }
        public String getSkuTitle() {
            return this.skuTitle;
        }

    }

    public static class QueryItemDetailResponseBodyModel extends TeaModel {
        @NameInMap("CanSell")
        public String canSell;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("DescOption")
        public String descOption;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("FirstPicUrl")
        public String firstPicUrl;

        @NameInMap("IforestProps")
        public java.util.List<java.util.Map<String, String>> iforestProps;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemImages")
        public java.util.List<String> itemImages;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemCategory")
        public String lmItemCategory;

        @NameInMap("Lmitemid")
        public String lmitemid;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("ReservePrice")
        public String reservePrice;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("SellerPayPostfee")
        public String sellerPayPostfee;

        @NameInMap("SellerType")
        public String sellerType;

        @NameInMap("Skus")
        public java.util.List<QueryItemDetailResponseBodyModelSkus> skus;

        @NameInMap("TbShopName")
        public String tbShopName;

        @NameInMap("TotalSoldQuantity")
        public String totalSoldQuantity;

        @NameInMap("VideoPicUrl")
        public String videoPicUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static QueryItemDetailResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryItemDetailResponseBodyModel self = new QueryItemDetailResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryItemDetailResponseBodyModel setCanSell(String canSell) {
            this.canSell = canSell;
            return this;
        }
        public String getCanSell() {
            return this.canSell;
        }

        public QueryItemDetailResponseBodyModel setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public QueryItemDetailResponseBodyModel setDescOption(String descOption) {
            this.descOption = descOption;
            return this;
        }
        public String getDescOption() {
            return this.descOption;
        }

        public QueryItemDetailResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryItemDetailResponseBodyModel setFirstPicUrl(String firstPicUrl) {
            this.firstPicUrl = firstPicUrl;
            return this;
        }
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        public QueryItemDetailResponseBodyModel setIforestProps(java.util.List<java.util.Map<String, String>> iforestProps) {
            this.iforestProps = iforestProps;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getIforestProps() {
            return this.iforestProps;
        }

        public QueryItemDetailResponseBodyModel setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryItemDetailResponseBodyModel setItemImages(java.util.List<String> itemImages) {
            this.itemImages = itemImages;
            return this;
        }
        public java.util.List<String> getItemImages() {
            return this.itemImages;
        }

        public QueryItemDetailResponseBodyModel setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryItemDetailResponseBodyModel setLmItemCategory(String lmItemCategory) {
            this.lmItemCategory = lmItemCategory;
            return this;
        }
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        public QueryItemDetailResponseBodyModel setLmitemid(String lmitemid) {
            this.lmitemid = lmitemid;
            return this;
        }
        public String getLmitemid() {
            return this.lmitemid;
        }

        public QueryItemDetailResponseBodyModel setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public QueryItemDetailResponseBodyModel setReservePrice(String reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public String getReservePrice() {
            return this.reservePrice;
        }

        public QueryItemDetailResponseBodyModel setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public QueryItemDetailResponseBodyModel setSellerPayPostfee(String sellerPayPostfee) {
            this.sellerPayPostfee = sellerPayPostfee;
            return this;
        }
        public String getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        public QueryItemDetailResponseBodyModel setSellerType(String sellerType) {
            this.sellerType = sellerType;
            return this;
        }
        public String getSellerType() {
            return this.sellerType;
        }

        public QueryItemDetailResponseBodyModel setSkus(java.util.List<QueryItemDetailResponseBodyModelSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<QueryItemDetailResponseBodyModelSkus> getSkus() {
            return this.skus;
        }

        public QueryItemDetailResponseBodyModel setTbShopName(String tbShopName) {
            this.tbShopName = tbShopName;
            return this;
        }
        public String getTbShopName() {
            return this.tbShopName;
        }

        public QueryItemDetailResponseBodyModel setTotalSoldQuantity(String totalSoldQuantity) {
            this.totalSoldQuantity = totalSoldQuantity;
            return this;
        }
        public String getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public QueryItemDetailResponseBodyModel setVideoPicUrl(String videoPicUrl) {
            this.videoPicUrl = videoPicUrl;
            return this;
        }
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        public QueryItemDetailResponseBodyModel setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
