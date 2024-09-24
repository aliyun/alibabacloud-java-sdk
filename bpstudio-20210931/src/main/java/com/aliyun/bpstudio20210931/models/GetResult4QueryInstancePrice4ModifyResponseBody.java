// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetResult4QueryInstancePrice4ModifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;&quot;,
     *     &quot;NoPermissionType&quot;: &quot;&quot;,
     *     &quot;AuthAction&quot;: &quot;&quot;
     *   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetResult4QueryInstancePrice4ModifyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResult4QueryInstancePrice4ModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResult4QueryInstancePrice4ModifyResponseBody self = new GetResult4QueryInstancePrice4ModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResult4QueryInstancePrice4ModifyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetResult4QueryInstancePrice4ModifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResult4QueryInstancePrice4ModifyResponseBody setData(GetResult4QueryInstancePrice4ModifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResult4QueryInstancePrice4ModifyResponseBodyData getData() {
        return this.data;
    }

    public GetResult4QueryInstancePrice4ModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResult4QueryInstancePrice4ModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DiscountAmount")
        public Double discountAmount;

        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OriginalAmount")
        public Double originalAmount;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TradeAmount")
        public Double tradeAmount;

        public static GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList build(java.util.Map<String, ?> map) throws Exception {
            GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList self = new GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList();
            return TeaModel.build(map, self);
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setOriginalAmount(Double originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Double getOriginalAmount() {
            return this.originalAmount;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList setTradeAmount(Double tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Double getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class GetResult4QueryInstancePrice4ModifyResponseBodyData extends TeaModel {
        @NameInMap("PriceList")
        public java.util.List<GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList> priceList;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>d9a3e99b-6954-4a16-ad51-954db4a528b7</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetResult4QueryInstancePrice4ModifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResult4QueryInstancePrice4ModifyResponseBodyData self = new GetResult4QueryInstancePrice4ModifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyData setPriceList(java.util.List<GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList> priceList) {
            this.priceList = priceList;
            return this;
        }
        public java.util.List<GetResult4QueryInstancePrice4ModifyResponseBodyDataPriceList> getPriceList() {
            return this.priceList;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
