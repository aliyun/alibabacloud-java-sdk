// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RenderDistributionOrderResponseBody extends TeaModel {
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
    public java.util.List<RenderDistributionOrderResponseBodyModel> model;

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

    public static RenderDistributionOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenderDistributionOrderResponseBody self = new RenderDistributionOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RenderDistributionOrderResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public RenderDistributionOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenderDistributionOrderResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RenderDistributionOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenderDistributionOrderResponseBody setModel(java.util.List<RenderDistributionOrderResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<RenderDistributionOrderResponseBodyModel> getModel() {
        return this.model;
    }

    public RenderDistributionOrderResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public RenderDistributionOrderResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public RenderDistributionOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenderDistributionOrderResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RenderDistributionOrderResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RenderDistributionOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RenderDistributionOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RenderDistributionOrderResponseBodyModelDeliveryInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("PostFee")
        public Long postFee;

        @NameInMap("ServiceType")
        public String serviceType;

        public static RenderDistributionOrderResponseBodyModelDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelDeliveryInfos self = new RenderDistributionOrderResponseBodyModelDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelDeliveryInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RenderDistributionOrderResponseBodyModelDeliveryInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RenderDistributionOrderResponseBodyModelDeliveryInfos setPostFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }
        public Long getPostFee() {
            return this.postFee;
        }

        public RenderDistributionOrderResponseBodyModelDeliveryInfos setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

    public static class RenderDistributionOrderResponseBodyModelLmItemInfos extends TeaModel {
        @NameInMap("CanSell")
        public String canSell;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public String skuId;

        public static RenderDistributionOrderResponseBodyModelLmItemInfos build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModelLmItemInfos self = new RenderDistributionOrderResponseBodyModelLmItemInfos();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModelLmItemInfos setCanSell(String canSell) {
            this.canSell = canSell;
            return this;
        }
        public String getCanSell() {
            return this.canSell;
        }

        public RenderDistributionOrderResponseBodyModelLmItemInfos setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderDistributionOrderResponseBodyModelLmItemInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RenderDistributionOrderResponseBodyModelLmItemInfos setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderDistributionOrderResponseBodyModelLmItemInfos setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

    }

    public static class RenderDistributionOrderResponseBodyModel extends TeaModel {
        @NameInMap("DeliveryInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelDeliveryInfos> deliveryInfos;

        @NameInMap("LmItemInfos")
        public java.util.List<RenderDistributionOrderResponseBodyModelLmItemInfos> lmItemInfos;

        public static RenderDistributionOrderResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RenderDistributionOrderResponseBodyModel self = new RenderDistributionOrderResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RenderDistributionOrderResponseBodyModel setDeliveryInfos(java.util.List<RenderDistributionOrderResponseBodyModelDeliveryInfos> deliveryInfos) {
            this.deliveryInfos = deliveryInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelDeliveryInfos> getDeliveryInfos() {
            return this.deliveryInfos;
        }

        public RenderDistributionOrderResponseBodyModel setLmItemInfos(java.util.List<RenderDistributionOrderResponseBodyModelLmItemInfos> lmItemInfos) {
            this.lmItemInfos = lmItemInfos;
            return this;
        }
        public java.util.List<RenderDistributionOrderResponseBodyModelLmItemInfos> getLmItemInfos() {
            return this.lmItemInfos;
        }

    }

}
