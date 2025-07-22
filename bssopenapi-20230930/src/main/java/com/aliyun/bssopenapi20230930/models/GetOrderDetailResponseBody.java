// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetOrderDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOrderDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailResponseBody self = new GetOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrderDetailResponseBody setData(GetOrderDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrderDetailResponseBodyData getData() {
        return this.data;
    }

    public GetOrderDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("AttrApiCode")
        public String attrApiCode;

        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("ModuleApiCode")
        public String moduleApiCode;

        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties self = new GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties setAttrApiCode(String attrApiCode) {
            this.attrApiCode = attrApiCode;
            return this;
        }
        public String getAttrApiCode() {
            return this.attrApiCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties setModuleApiCode(String moduleApiCode) {
            this.moduleApiCode = moduleApiCode;
            return this;
        }
        public String getModuleApiCode() {
            return this.moduleApiCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties extends TeaModel {
        @NameInMap("billModuleProperties")
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties> billModuleProperties;

        public static GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties self = new GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties setBillModuleProperties(java.util.List<GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties> billModuleProperties) {
            this.billModuleProperties = billModuleProperties;
            return this;
        }
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModulePropertiesBillModuleProperties> getBillModuleProperties() {
            return this.billModuleProperties;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig extends TeaModel {
        /**
         * <p>apiCode</p>
         * 
         * <strong>example:</strong>
         * <p>datadisk</p>
         */
        @NameInMap("ApiCode")
        public String apiCode;

        @NameInMap("BillModuleProperties")
        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties billModuleProperties;

        /**
         * <strong>example:</strong>
         * <p>datadisk</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig self = new GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig setApiCode(String apiCode) {
            this.apiCode = apiCode;
            return this;
        }
        public String getApiCode() {
            return this.apiCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig setBillModuleProperties(GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties billModuleProperties) {
            this.billModuleProperties = billModuleProperties;
            return this;
        }
        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfigBillModuleProperties getBillModuleProperties() {
            return this.billModuleProperties;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig extends TeaModel {
        @NameInMap("billModuleConfig")
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig> billModuleConfig;

        public static GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig self = new GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig setBillModuleConfig(java.util.List<GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig> billModuleConfig) {
            this.billModuleConfig = billModuleConfig;
            return this;
        }
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfigBillModuleConfig> getBillModuleConfig() {
            return this.billModuleConfig;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties self = new GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties extends TeaModel {
        @NameInMap("moduleProperties")
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties> moduleProperties;

        public static GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties self = new GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties setModuleProperties(java.util.List<GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties> moduleProperties) {
            this.moduleProperties = moduleProperties;
            return this;
        }
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModulePropertiesModuleProperties> getModuleProperties() {
            return this.moduleProperties;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>systemdisk</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ModuleProperties")
        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties moduleProperties;

        @NameInMap("Name")
        public String name;

        public static GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig self = new GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig setModuleProperties(GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties moduleProperties) {
            this.moduleProperties = moduleProperties;
            return this;
        }
        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfigModuleProperties getModuleProperties() {
            return this.moduleProperties;
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig extends TeaModel {
        @NameInMap("originalModuleConfig")
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig> originalModuleConfig;

        public static GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig self = new GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig setOriginalModuleConfig(java.util.List<GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig> originalModuleConfig) {
            this.originalModuleConfig = originalModuleConfig;
            return this;
        }
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfigOriginalModuleConfig> getOriginalModuleConfig() {
            return this.originalModuleConfig;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderListOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AfterTaxAmount")
        public String afterTaxAmount;

        @NameInMap("BillModuleConfig")
        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig billModuleConfig;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>DBInstanceClass:[DBInstanceClass:rds.mysql.s1.small;EngineVersion:8.0;Region:cn-qingdao;]DBFlowType:[Region:cn-qingdao;]</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>2017-06-08T09:41:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("ExtendInfos")
        public java.util.Map<String, String> extendInfos;

        /**
         * <strong>example:</strong>
         * <p>[&quot;rm-bp1a2vsr018313t6o&quot;]</p>
         */
        @NameInMap("InstanceIds")
        public String instanceIds;

        /**
         * <strong>example:</strong>
         * <p>322315</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>241559391310333</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>productsuborder</p>
         */
        @NameInMap("OrderSubType")
        public String orderSubType;

        /**
         * <strong>example:</strong>
         * <p>new</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>DBInstanceClass:[DBInstanceClass:rds.mysql.s1.small;EngineVersion:8.0;Region:cn-qingdao;]DBFlowType:[Region:cn-qingdao;]</p>
         */
        @NameInMap("OriginalConfig")
        public String originalConfig;

        @NameInMap("OriginalModuleConfig")
        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig originalModuleConfig;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <strong>example:</strong>
         * <p>paid</p>
         */
        @NameInMap("PaymentStatus")
        public String paymentStatus;

        /**
         * <strong>example:</strong>
         * <p>2017-06-08T09:41:30Z</p>
         */
        @NameInMap("PaymentTime")
        public String paymentTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>241559391310332</p>
         */
        @NameInMap("RelatedOrderId")
        public String relatedOrderId;

        /**
         * <strong>example:</strong>
         * <p>234343</p>
         */
        @NameInMap("SubOrderId")
        public String subOrderId;

        /**
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Tax")
        public String tax;

        /**
         * <strong>example:</strong>
         * <p>2117-06-08T16:00:00Z</p>
         */
        @NameInMap("UsageEndTime")
        public String usageEndTime;

        /**
         * <strong>example:</strong>
         * <p>2017-06-08T16:00:00Z</p>
         */
        @NameInMap("UsageStartTime")
        public String usageStartTime;

        public static GetOrderDetailResponseBodyDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrder self = new GetOrderDetailResponseBodyDataOrderListOrder();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setAfterTaxAmount(String afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setBillModuleConfig(GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig billModuleConfig) {
            this.billModuleConfig = billModuleConfig;
            return this;
        }
        public GetOrderDetailResponseBodyDataOrderListOrderBillModuleConfig getBillModuleConfig() {
            return this.billModuleConfig;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setExtendInfos(java.util.Map<String, String> extendInfos) {
            this.extendInfos = extendInfos;
            return this;
        }
        public java.util.Map<String, String> getExtendInfos() {
            return this.extendInfos;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setInstanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public String getInstanceIds() {
            return this.instanceIds;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOrderSubType(String orderSubType) {
            this.orderSubType = orderSubType;
            return this;
        }
        public String getOrderSubType() {
            return this.orderSubType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOriginalConfig(String originalConfig) {
            this.originalConfig = originalConfig;
            return this;
        }
        public String getOriginalConfig() {
            return this.originalConfig;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOriginalModuleConfig(GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig originalModuleConfig) {
            this.originalModuleConfig = originalModuleConfig;
            return this;
        }
        public GetOrderDetailResponseBodyDataOrderListOrderOriginalModuleConfig getOriginalModuleConfig() {
            return this.originalModuleConfig;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setRelatedOrderId(String relatedOrderId) {
            this.relatedOrderId = relatedOrderId;
            return this;
        }
        public String getRelatedOrderId() {
            return this.relatedOrderId;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderList extends TeaModel {
        @NameInMap("Order")
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrder> order;

        public static GetOrderDetailResponseBodyDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderList self = new GetOrderDetailResponseBodyDataOrderList();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderList setOrder(java.util.List<GetOrderDetailResponseBodyDataOrderListOrder> order) {
            this.order = order;
            return this;
        }
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrder> getOrder() {
            return this.order;
        }

    }

    public static class GetOrderDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("OrderList")
        public GetOrderDetailResponseBodyDataOrderList orderList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetOrderDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyData self = new GetOrderDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetOrderDetailResponseBodyData setOrderList(GetOrderDetailResponseBodyDataOrderList orderList) {
            this.orderList = orderList;
            return this;
        }
        public GetOrderDetailResponseBodyDataOrderList getOrderList() {
            return this.orderList;
        }

        public GetOrderDetailResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOrderDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOrderDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
